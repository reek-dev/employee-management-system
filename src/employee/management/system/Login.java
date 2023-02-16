
package employee.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener {
    
    JTextField usernameInput, passwordInput;
    
    Login() {
        
        this.getContentPane().setBackground(Color.decode("#e6e6e6"));
        this.setLayout(null);
        
        JLabel username = new JLabel("Username");
        username.setBounds(40, 20, 100, 30);
        this.add(username);
        
        usernameInput = new JTextField();
        usernameInput.setBounds(150, 22, 200, 25);
        this.add(usernameInput);
        
        JLabel password = new JLabel("Password");
        password.setBounds(40, 50, 100, 30);
        this.add(password);
        
        passwordInput = new JTextField();
        passwordInput.setBounds(150, 52, 200, 25);
        this.add(passwordInput);
        
        JButton loginButton = new JButton("Click here to login");
        loginButton.setBounds(150, 120, 140, 35);
        loginButton.setBackground(Color.decode("#E8D2A6"));
        loginButton.setForeground(Color.decode("#20262E"));
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(this);
        this.add(loginButton);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(128, 128, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380, 20, 128, 128);
        this.add(image);
        
        
        this.setSize(600, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            
            Conn conn = new Conn();
            
            String query = "SELECT * FROM `login` WHERE `username` = '" + username + "' AND `password` = '" + password + "'";
            
            ResultSet rs = conn.stmt.executeQuery(query);
            if(rs.next()) {
                this.setVisible(false);
                new Home();
            } else {
                JOptionPane.showMessageDialog(null, "invalid username or password.");
                this.setVisible(false);
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }

    
}
