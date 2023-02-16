
package employee.management.system;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class RemoveEmployee extends JFrame {
    
    RemoveEmployee() {
        
        this.getContentPane().setBackground(Color.decode("#393E46"));
        this.setLayout(null);
        
        this.setSize(560, 420);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new RemoveEmployee();
    }
    
}
