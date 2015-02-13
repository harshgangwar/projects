import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class MyFrstP // implements ActionListener
{
	JLabel l[]=new JLabel[9];
	String s[]={"NAME :","COLLEGE :","BRANCH :","YEAR :","SKILLS :","INTEREST :","EXPERIENCE :","USERNAME :","PASSWORD :",};
	JTextField name,pass,username,clg,br,yr,sk,inte,exp;
	JFrame f;
	MyFrstP()
	{
		for(int i=0;i<l.length;i++)
		{
		    l[i]=new JLabel(s[i]);
		}
		
		f =new JFrame("student database");
		f.setSize(800,800);
		f.setLayout(null);
		
		name=new JTextField(12);
		clg=new JTextField(19);
		br=new JTextField(20);
		yr=new JTextField(10);
		sk=new JTextField(30);
		inte=new JTextField(40);
		exp=new JTextField(40);
		username=new JTextField(10);
		pass=new JTextField(20);
		
		l[0].add(name);
		f.add(clg);
		f.add(br);
		f.add(yr);
		f.add(sk);
		f.add(inte);
		f.add(exp);
		f.add(username);
		f.add(pass);
		
		name.setBounds(100,10,10,50);
		clg.setBounds(100,150,400,100);
		br.setBounds(100,200,400,100);
		yr.setBounds(100,250,400,100);
		sk.setBounds(100,300,400,100);
		inte.setBounds(100,350,400,100);
		exp.setBounds(100,400,400,100);
		username.setBounds(100,450,400,100);
		pass.setBounds(100,500,400,100);
		
		
		
		
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent win)
			{
			System.exit(0);
			}
		}
		); 
		int r=100;
		int c=100;
		int m=0;
		for(int i=0;i<l.length;i++)
		{
		l[i].setSize(r,100+m);
		m+=50;
		f.add(l[i]);
		}
		f.setVisible(true);
		
		
		
		
		
		
	
	}
	
	
	
	public static void main(String... harsh)
	{
		new MyFrstP();
		
	}
}
