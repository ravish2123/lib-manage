import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
public class returnb extends JFrame implements ActionListener {
JLabel l1,l2;
JTextField t1,t2;
JButton b1,b2;
private JLabel lblNewLabel;
 public returnb(String title){
	 super(title);
	 getContentPane().setBackground(new Color(255, 69, 0));
	 l1 = new JLabel("Book Id:");
	 l1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	 l2 = new JLabel("Student Id:");
	 l2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	 t1 = new JTextField();
	 t1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	 t2 = new JTextField();
	 t2.setFont(new Font("Times New Roman", Font.ITALIC, 12));
	 b1 = new JButton("Return");
	 b1.setBackground(new Color(112, 128, 144));
	 b1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
	 b2 = new JButton("Back");
	 b2.setBackground(new Color(100, 149, 237));
	 b2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
	 l1.setBounds(37,92,87,30);
	l2.setBounds(10,51,129,30);
	t1.setBounds(149,95,156,30);
	t2.setBounds(149,54,156,30);
	b1.setBounds(39,153,100,30);
	b2.setBounds(189,153,100,30);
	getContentPane().add(l1);	getContentPane().add(l2);
	getContentPane().add(t1);getContentPane().add(t2);
	getContentPane().add(b1);getContentPane().add(b2);
	getContentPane().setLayout(null);
	
	lblNewLabel = new JLabel("");
	lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
	lblNewLabel.setBackground(new Color(188, 143, 143));
	lblNewLabel.setBounds(0, 0, 504, 481);
	getContentPane().add(lblNewLabel);
	setVisible(true);
	setSize(520,520);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
 }
	
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stu
if(ae.getSource()==b1){
	String bookcallno=t1.getText();
	int studentid=Integer.parseInt(t2.getText());
	int i=ReturnBookDao.delete(bookcallno, studentid);
	if(i>0){
		JOptionPane.showMessageDialog(returnb.this,"Book returned successfully!");
		dispose();
		
	}else{
		JOptionPane.showMessageDialog(returnb.this,"Sorry, unable to return book!");
	}
}
		
		if(ae.getSource()==b2){
			dispose();
		}
	}

	
}
