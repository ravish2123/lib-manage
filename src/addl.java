import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Font;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class addl extends JFrame implements ActionListener  {
	JLabel l3,l4,l5,l6,l7,l8;
	JTextField t3,t5,t6,t7,t8;
	JButton b8;
	JPasswordField t4;
	private JLabel label;
	
	
	public addl(String title){
		
super(title);
l3 = new JLabel("Name:");
l3.setForeground(new Color(248, 248, 255));
l3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
l4 = new JLabel("Password:");
l4.setForeground(new Color(248, 248, 255));
l4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
l5=new JLabel ("Email:");
l5.setForeground(new Color(248, 248, 255));
l5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
l6=new JLabel("Address:");
l6.setForeground(new Color(248, 248, 255));
l6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
l7=new JLabel("City:");
l7.setForeground(new Color(248, 248, 255));
l7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
l8=new JLabel("Phone:");
l8.setForeground(new Color(248, 248, 255));
l8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
t3= new JTextField();
t3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
t4= new JPasswordField();
t4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
t5= new JTextField();
t5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
t6= new JTextField();
t6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
t7= new JTextField();
t7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
t8= new JTextField();
t8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
b8 = new JButton("Submit");
b8.setForeground(new Color(30, 144, 255));
b8.setFont(new Font("Times New Roman", Font.ITALIC, 20));
l3.setBounds(208,181,92,20);
l4.setBounds(208,218,100,20);
l5.setBounds(208,263,100,20);
l6.setBounds(211,306,92,20);
l7.setBounds(214,354,92,20);
l8.setBounds(214,403,92,20);
t3.setBounds(310,180,200,20);
t4.setBounds(310,221,200,20);
t5.setBounds(310,263,200,20);
t6.setBounds(310,306,200,20);
t7.setBounds(310,354,200,20);
t8.setBounds(310,403,200,20);
b8.setBounds(347, 480, 100, 30);
getContentPane().add(l3);
getContentPane().add(l4);
getContentPane().add(l5);getContentPane().add(l6);getContentPane().add(l7);getContentPane().add(l8);getContentPane().add(t3);getContentPane().add(t4);getContentPane().add(t5);getContentPane().add(t6);getContentPane().add(t7);getContentPane().add(t8);
getContentPane().add(b8);
b8.addActionListener(this);

getContentPane().setLayout(null);
label = new JLabel("");
label.setForeground(new Color(248, 248, 255));
label.setIcon(new ImageIcon("images\\24manguel-master768.jpg"));
label.setBounds(0, 0, 780, 560);
getContentPane().add(label);
setSize(780,560);
setVisible(true);

setDefaultCloseOperation(HIDE_ON_CLOSE);
}
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()==b8){
			
				String name=t3.getText();
				String password=String.valueOf( t4.getPassword());
				String email=t5.getText();
				String address=t6.getText();
				String city=t7.getText();
				String contact=t8.getText();
				

				int i=LibrarianDao.save(name, password, email, address, city, contact);
				if(i>0){
					JOptionPane.showMessageDialog(addl.this,"Librarian added successfully!");
					AdminSuccess as = new AdminSuccess("Admin");
					
					dispose();
					
				}else{
					JOptionPane.showMessageDialog(addl.this,"Sorry, unable to save!");
				}	
			
				}
}
}
