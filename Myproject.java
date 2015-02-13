import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Runner
{
	public static void main(String... harsh)
	{
		Board board=new Board(); //The Board is a panel where the game takes place.
		String winner=playGame(board);
		printBoard(board);
		printWriter(winner);
	}
}


private static String playGame(Board board) // only called by Runner class
{
	//now Set Up Objects
	Player playerX=new Player('X',board);
	Player playerO=new Player('O',board);
	Scanner in=new Scanner(System.in);
	Player currP;
	int turncount=0;
	int play;
	boolean hasWon=false;
	String winner="Tie";
	
	boolean keepPlaying=true;
	while(keepPlaying)
	{
		printBoard(board);
		turncount++;
		if(turncount %2==0)
		currP=playerO;
		else
		currP=playerX;
		
		System.out.println(currP.getName() + ",make a move(1-9): ");
		play=in.nextInt();
		hasWon=currP.makePlay(Player.cells[play - 1]); //Player.cells[play - 1] figures out which cell the player wants to play in. 
		if(hasWon)
		{
			winner=currP.getName();
			keepPlaying=false;
		}
		if(turncount==9)//If we are on the 9th turn, then all the cells have been filled,
		{
			keepPlaying=false;
		}
	}

	return null;
}
private static void printWinner(String winner)
{
	if(winner.equals("Tie"))
	System.out.println("It's a tie");
	else
	System.out.println(winner + " won! ");
}



