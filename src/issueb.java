import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class issueb extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3,t4;
private JLabel label;
private JButton btnIssue;
private JButton btnBack;
	public issueb(String title){
		super(title);
		l1 = new JLabel("Book Id:");
		l1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		l2 = new JLabel("Student Id:");
		l2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		l3 = new JLabel("Student name:");
		l3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		l4 = new JLabel("Student contact:");
		l4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		t1 = new JTextField();
		t1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		t2 = new JTextField();
		t2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		t3 = new JTextField();
		t3.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		t4 = new JTextField();
		t4.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		l1.setBounds(50,40,137,30);
		l2.setBounds(50,80,137,30);
		l3.setBounds(50,120,137,30);
		l4.setBounds(50,160,137,30);
		t1.setBounds(197,40,140,30);
		t2.setBounds(197,80,140,30);
		t3.setBounds(197,120,140,30);
		t4.setBounds(197,160,140,30);
		getContentPane().add(l1);getContentPane().add(l2);getContentPane().add(l3);getContentPane().add(l4);
		getContentPane().add(t1);getContentPane().add(t2);getContentPane().add(t3);getContentPane().add(t4);
		
		getContentPane().setLayout(null);
		
		label = new JLabel("");
		label.setBackground(new Color(218, 165, 32));
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(0, 0, 384, 361);
		getContentPane().add(label);
		
		btnIssue = new JButton("Issue");
		btnIssue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnIssue.setBackground(new Color(218, 165, 32));
		btnIssue.setBounds(78, 220, 89, 23);
		getContentPane().add(btnIssue);
		btnIssue.addActionListener(this);
		
		btnBack = new JButton("Back");
		btnBack.setBackground(new Color(218, 165, 32));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnBack.setBounds(205, 222, 89, 23);
		getContentPane().add(btnBack);
		btnBack.addActionListener(this);
		
		setSize(400,400);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnIssue){
			String bookcallno=t1.getText();
			int studentid=Integer.parseInt(t2.getText());
			String studentname=t3.getText();
			String studentcontact=t4.getText();
			
			if(IssueBookDao.checkBook(bookcallno)){
			
			int i=IssueBookDao.save(bookcallno, studentid, studentname, studentcontact);
			if(i>0){
				JOptionPane.showMessageDialog(issueb.this,"Book issued successfully!");
				librarian lib = new librarian("Librarian");
				dispose();
				
			}else{
				JOptionPane.showMessageDialog(issueb.this,"Sorry, unable to issue!");
			}
			
			}else{
				JOptionPane.showMessageDialog(issueb.this,"Sorry, book Id doesn't exist!");
			}
			
		}
		if(arg0.getSource()==btnBack){
		dispose();
		}
	}

}
