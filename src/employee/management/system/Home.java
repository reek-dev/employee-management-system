
package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Home extends JFrame implements ActionListener {
    
    Font font;
    JButton add, view, update, remove;
    
    Home() {
        
        this.getContentPane().setBackground(Color.decode("#393E46"));
        this.setLayout(null);
          
        // registering the open sans font here
        try {
            font = Font.createFont(
                    Font.TRUETYPE_FONT, new File("src/fonts/OpenSans-Medium.ttf"))
                    .deriveFont(24f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(90, 30, 420, 40);
        heading.setForeground(Color.decode("#F2E7D5"));
        heading.setFont(font);
        this.add(heading);
        
        
        
        /* CRUD operations */
        
        // create
        add = new JButton("Add employee");
        add.setBounds(120, 120, 150, 40);
        add.setFocusPainted(false);
        add.setFont(font.deriveFont(13f));
        add.setBackground(Color.decode("#86A3B8"));
        add.setForeground(Color.decode("#332C39"));
        add.addActionListener(this);
        this.add(add);
        
        // read
        view = new JButton("View employee");
        view.setBounds(280, 120, 150, 40);
        view.setFocusPainted(false);
        view.setFont(font.deriveFont(13f));
        view.setBackground(Color.decode("#86A3B8"));
        view.setForeground(Color.decode("#332C39"));
        view.addActionListener(this);
        this.add(view);
        
        // update
        update = new JButton("Update employee");
        update.setBounds(120, 180, 150, 40);
        update.setFocusPainted(false);
        update.setFont(font.deriveFont(13f));
        update.setBackground(Color.decode("#86A3B8"));
        update.setForeground(Color.decode("#332C39"));
        update.addActionListener(this);
        this.add(update);
        
        // delete
        remove = new JButton("Remove employee");
        remove.setBounds(280, 180, 150, 40);
        remove.setFocusPainted(false);
        remove.setFont(font.deriveFont(13f));
        remove.setBackground(Color.decode("#86A3B8"));
        remove.setForeground(Color.decode("#332C39"));
        remove.addActionListener(this);
        this.add(remove);
        
        this.setSize(560, 420);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            
        }
        else if (ae.getSource() == view) {
            
        }
        else if (ae.getSource() == update) {
            
        }
        else if (ae.getSource() == remove) {
            
        }
    }
    
    
    public static void main(String[] args) {
        new Home();
    }

    
}
