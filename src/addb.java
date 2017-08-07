import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
public class addb extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
JButton b1,b2;
private JLabel label;
public addb(String title){
	super(title);
	l1 = new JLabel("Id:");
	l1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	l2 = new JLabel("Name:");
	l2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	l3 = new JLabel("Author:");
	l3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	l4 = new JLabel("Publisher:");
	l4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	l5 = new JLabel("Quantity:");
	l5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	t1 = new JTextField();
	t1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	t2 = new JTextField();
	t2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	t3 = new JTextField();
	t3.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	t4 = new JTextField();
	t4.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	t5 = new JTextField();
	t5.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	b1 = new JButton("Add");
	b1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	b1.setBackground(new Color(30, 144, 255));
	b2 = new JButton("Back");
	b2.setBackground(new Color(30, 144, 255));
	b2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	l1.setBounds(10,40,100,30);
	l2.setBounds(10,80,100,30);
	l3.setBounds(10,120,100,30);
	l4.setBounds(10,160,100,30);
	l5.setBounds(10,200,100,30);
	t1.setBounds(120,40,100,30);
	t2.setBounds(120,80,100,30);
	t3.setBounds(120,120,100,30);
	t4.setBounds(120,160,100,30);
	t5.setBounds(120,200,100,30);
	b1.setBounds(37,264,100,30);
	b2.setBounds(148,264,100,30);
	getContentPane().add(l1);	getContentPane().add(l2);	getContentPane().add(l3);	getContentPane().add(l4);	getContentPane().add(l5);	getContentPane().add(b1);	getContentPane().add(b2);
	getContentPane().add(t1);getContentPane().add(t2);getContentPane().add(t3);getContentPane().add(t4);getContentPane().add(t5);
	b1.addActionListener(this);
	b2.addActionListener(this);
	getContentPane().setLayout(null);
	
	label = new JLabel("");
	label.setIcon(new ImageIcon("images\\books1.jpg"));
	label.setBounds(-17, -19, 600, 336);
	getContentPane().add(label);
	setVisible(true);
	setSize(620,356);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	
	
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==b1){
		String callno=t1.getText();
		String name=t2.getText();
		String author=t3.getText();
		String publisher=t4.getText();
		String squantity=t5.getText();
		int quantity=Integer.parseInt(squantity);
		int i=BookDao.save(callno, name, author, publisher, quantity);
		if(i>0){
			JOptionPane.showMessageDialog(addb.this,"Books added successfully!");
			librarian li1= new librarian("Librarian");
			dispose();
			
		}else{
			JOptionPane.showMessageDialog(addb.this,"Sorry, unable to save!");
		}
		}
	
		
		
	
	if(ae.getSource()==b2)
		
	{
		dispose();
}
	
}}
