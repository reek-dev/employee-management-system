
package employee.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AddEmployee extends JFrame implements ActionListener {
    
    Font font;
    
    JTextField nameInput, ageInput, genderInput, phoneInput, emailInput, salaryInput, designationInput;
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    AddEmployee() {
        
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
        
        
        // heading
        JLabel heading = new JLabel("Add employee details here");
        heading.setBounds(150, 30, 250, 40);
        heading.setFont(font.deriveFont(20f));
        heading.setForeground(Color.decode("#F7EFE5"));
        this.add(heading);
        
        
        // name field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(90, 90, 250, 40);
        nameLabel.setFont(font.deriveFont(16f));
        nameLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(nameLabel);
        
        nameInput = new JTextField();
        nameInput.setBounds(190, 93, 250, 30);
        nameInput.setFont(font.deriveFont(16f));
        nameInput.setMargin(new Insets(2,6,2,2));
        this.add(nameInput);
        
        
        
        // age field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(90, 130, 250, 40);
        ageLabel.setFont(font.deriveFont(16f));
        ageLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(ageLabel);
        
        ageInput = new JTextField();
        ageInput.setBounds(190, 133, 250, 30);
        ageInput.setFont(font.deriveFont(16f));
        ageInput.setMargin(new Insets(2,6,2,2));
        this.add(ageInput);
        
        
        // date of birth field
        JLabel dobLabel = new JLabel("D.O.B.");
        dobLabel.setBounds(90, 170, 250, 40);
        dobLabel.setFont(font.deriveFont(16f));
        dobLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(dobLabel);
        
        JDateChooser dobChooser = new JDateChooser();
        dobChooser.setBounds(190, 173, 250, 30);
        dobChooser.setFont(font.deriveFont(14f));
        this.add(dobChooser);
        
        // gender field
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(90, 210, 250, 40);
        genderLabel.setFont(font.deriveFont(16f));
        genderLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(genderLabel);
        
        genderInput = new JTextField();
        genderInput.setBounds(190, 213, 250, 30);
        genderInput.setFont(font.deriveFont(16f));
        genderInput.setMargin(new Insets(2,6,2,2));
        this.add(genderInput);
        
        
        // phone field
        JLabel phoneLabel = new JLabel("Phone no.");
        phoneLabel.setBounds(90, 250, 250, 40);
        phoneLabel.setFont(font.deriveFont(16f));
        phoneLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(phoneLabel);
        
        phoneInput = new JTextField();
        phoneInput.setBounds(190, 253, 250, 30);
        phoneInput.setFont(font.deriveFont(16f));
        phoneInput.setMargin(new Insets(2,6,2,2));
        this.add(phoneInput);
        
        
        // email field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(90, 290, 250, 40);
        emailLabel.setFont(font.deriveFont(16f));
        emailLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(emailLabel);
        
        emailInput = new JTextField();
        emailInput.setBounds(190, 293, 250, 30);
        emailInput.setFont(font.deriveFont(16f));
        emailInput.setMargin(new Insets(2,6,2,2));
        this.add(emailInput);
        
        // salary field
        JLabel salaryLabel = new JLabel("Salary");
        salaryLabel.setBounds(90, 330, 250, 40);
        salaryLabel.setFont(font.deriveFont(16f));
        salaryLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(salaryLabel);
        
        salaryInput = new JTextField();
        salaryInput.setBounds(190, 333, 250, 30);
        salaryInput.setFont(font.deriveFont(16f));
        salaryInput.setMargin(new Insets(2,6,2,2));
        this.add(salaryInput);
        
        // highest education field
        JLabel educationLabel = new JLabel("Education");
        educationLabel.setBounds(90, 370, 250, 40);
        educationLabel.setFont(font.deriveFont(16f));
        educationLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(educationLabel);
        
        String courses[] = {
            "B.Tech(CSE)", "B.Tech(IT)", "B.Tech(ECE)", "B.Tech(EEE)",
            "B.C.A.", "B.B.A.", "B.B.A. (H.M.)",
            "B.Sc.(Mathematics)", "B.Sc.(Physics)", "B.Sc.(Chemistry)", "B.Sc (Comp. Science)"
        };
        JComboBox educationDropdown = new JComboBox(courses);
        educationDropdown.setBounds(190, 373, 250, 30);
        educationDropdown.setFont(font.deriveFont(16f));
        this.add(educationDropdown);
        
        
        // designation field
        JLabel designationLabel = new JLabel("Designation");
        designationLabel.setBounds(90, 410, 250, 40);
        designationLabel.setFont(font.deriveFont(16f));
        designationLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(designationLabel);
        
        designationInput = new JTextField();
        designationInput.setBounds(190, 413, 250, 30);
        designationInput.setFont(font.deriveFont(16f));
        designationInput.setMargin(new Insets(2,6,2,2));
        this.add(designationInput);
        
        
        // employee ID field
        JLabel empIDLabel = new JLabel("Employee ID");
        empIDLabel.setBounds(90, 450, 250, 40);
        empIDLabel.setFont(font.deriveFont(16f));
        empIDLabel.setForeground(Color.decode("#EDDBC7"));
        this.add(empIDLabel);
        
        JLabel empIDInput = new JLabel("" + number);
        empIDInput.setBounds(250, 456, 250, 30);
        empIDInput.setFont(font.deriveFont(16f));
        empIDInput.setForeground(Color.decode("#F8EAD8"));
        this.add(empIDInput);
        
        
        // add button
        JButton add = new JButton("Add employee");
        add.setBounds(100, 520, 160, 30);
        add.setFont(font.deriveFont(16f));
        add.setBackground(Color.decode("#FFFFE8"));
        add.setFocusPainted(false);
        add.addActionListener(this);
        this.add(add);
        
        // back button
        JButton back = new JButton("Back");
        back.setBounds(300, 520, 160, 30);
        back.setFont(font.deriveFont(16f));
        back.setBackground(Color.decode("#FFFFE8"));
        back.setFocusPainted(false);
        back.addActionListener(this);
        this.add(back);
        
        this.setSize(560, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    public static void main(String[] args) {
        new AddEmployee();
    }

    
    
}
