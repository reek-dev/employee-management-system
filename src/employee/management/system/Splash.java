
package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Splash extends JFrame implements ActionListener {
    
    Splash() throws IOException {
        
        this.getContentPane().setBackground(Color.decode("#e6e6e6"));
        this.setLayout(null);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(400, 1, 400, 40);
        heading.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        this.add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home-screen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(494, 494, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(330, 50, 494, 494);
        this.add(image);
        
        JButton clickhere = new JButton("Click here to continue");
        clickhere.setBounds(490, 560, 190, 30);
        clickhere.setBackground(Color.decode("#567189"));
        clickhere.setForeground(Color.decode("#BAD7E9"));
        clickhere.setFocusPainted(false);
        clickhere.addActionListener(this);
        this.add(clickhere);
        
        this.setSize(1170, 650);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("icons/logo.png").getImage());
        this.setLocationRelativeTo(null);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) throws IOException {
        Splash splash = new Splash();
        splash.setVisible(true);
    }

    
}
