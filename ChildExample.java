import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class ChildExample{
 
    JFrame mainFrame;
    JTextField usernameTxt;
    JPasswordField passwordTxt;
     
    public static void main(String[] args){
        ChildExample ex1 = new ChildExample();
        ex1.go();
                 
     
    }
    public void go(){
        mainFrame = new JFrame("Frame");
        JPanel mainPanel = new JPanel();
         
        usernameTxt = new JTextField(25);   
        passwordTxt = new JPasswordField(25);
        JLabel usernameLbl = new JLabel("Username: ");
        JLabel passwordLbl = new JLabel("Password: ");
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new loginButtonListener());
         
        JTextArea textArea = new JTextArea(25,25);
        mainPanel.add(textArea);
        mainFrame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        mainFrame.setSize(1000,450);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
 
    }
 
    public class loginButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            //if username and password is good hide child window
                 
             
        }
         
    }
}