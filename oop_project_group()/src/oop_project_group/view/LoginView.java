
package oop_project_group.view;

  /*
        Group members
        =============
        
        Name                                 Registration Number
        ====                                 ===================
        CHANCE LUWONG                        18/847/BIT-S
        DUKU MOSES                           18/927/BSSE-S
        RICHARD KAMULAK JUSTIN LOKOSANG      18/1176/BIT-S
        PHILIP JUNGO                         18/1068/BIT-S

        */

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;
//import java.awt.Rectangle;

public class LoginView  extends JComponent{
   //objects
    private JTextField userNameField;
    private JPasswordField userPasswordField;
    private JLabel labelUserName;
    private JLabel labelUserPassword;
    
    private JButton buttonLogin;
    private JButton buttonCancel;
   
    
    public LoginView() {
        
        JFrame myFrame = new JFrame("Login View");
        
        JPanel myPanel = new JPanel(  );
        labelUserName = new JLabel("Username: "); // name label
        labelUserName.setBounds(150,100, 60, 60);
        
        userNameField = new JTextField( 20 ); // user field
        userNameField.setBounds(285, 158, 180, 25);
       
        
        
        labelUserPassword = new JLabel ("Password: "); // password label
        labelUserPassword.setBounds(300, 300, 90, 90);
      
        
        
        userPasswordField = new JPasswordField( 20 ); // password field
        userPasswordField.setBounds(295, 230, 200, 25);
        
        
        buttonLogin = new JButton( " Login ");// login button
        buttonLogin.setBounds(250, 250, 78, 30);
        
        // Validattion
        buttonLogin.addActionListener( new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (Authentificate.Validate(getUserName(), getUserPassword())) {
                    JOptionPane.showMessageDialog(LoginView.this, 
                            "Hi " + getUserName() +" You have successfully logged in" , "Log in",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                   
                } else {
                    JOptionPane.showMessageDialog(LoginView.this, "Oops!, Incorrect username or password",
                    "Log in ", JOptionPane.ERROR_MESSAGE);
                    userNameField.setText("");
                    userPasswordField.setText("");
                }
            }
            
            
        });
    
        
       
        
        buttonCancel = new JButton( " Cancel"); // cancel button
        buttonCancel.setBounds(450, 330, 76, 30);
        
        myFrame.setBounds(200, 30, 850, 600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.getContentPane().setBackground(Color.BLUE);
        // components display
        myFrame.getContentPane().add(labelUserPassword);
        myFrame.getContentPane().add(labelUserName);
        myFrame.getContentPane().add(userNameField);
        myFrame.getContentPane().add(userPasswordField);
        myFrame.getContentPane().add(buttonLogin);
        myFrame.getContentPane().add(buttonCancel);
        myFrame.getContentPane().add(myPanel);
        myFrame.setVisible(true);
        
     
       
    // Collectors
    }
     public String getUserName() {
            return userNameField.getText().trim();
        }
     public String getUserPassword (){
         return new String(userPasswordField.getPassword());
     }
}

       