import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.Label;
import java.awt.Font;


public class dell extends JFrame implements ActionListener {
	
JLabel nm;
private JTextField textField;

JButton b;
private JButton btnNewButton;


JLabel lblName;
	public dell(String title){
		super(title);
		
		btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(439, 78, 89, 30);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		lblName = new JLabel("Name of Librarian:");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblName.setBounds(180, 32, 177, 20);
		getContentPane().add(lblName);
		b = new JButton("Delete");
		b.setBackground(new Color(0, 0, 0));
		b.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		b.setForeground(new Color(255, 255, 255));
		getContentPane().add(b);
		b.setBounds(270,78,150,30);
		b.addActionListener(this);
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		textField.setEditable(true);
		textField.setBounds(361, 32, 131, 20);
		getContentPane().add(textField);
		textField.setColumns(20);
		
		getContentPane().setLayout(null);
		nm = new JLabel("");
		nm.setIcon(new ImageIcon("images\\images (1)1.png"));
		nm.setBounds(0,0,584,321);
		getContentPane().add(nm);
		
		setSize(600,360);
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(java.awt.event.ActionEvent ae) {
		// TODO Auto-generated method stub
		
	if(ae.getSource()==b){
		String sid = textField.getText();
		if(sid==null||sid.trim().equals("")){
			JOptionPane.showMessageDialog(dell.this,"Name can't be blank");
		}else{
			
			int i=LibrarianDao.delete(sid);
			if(i>0){
				JOptionPane.showMessageDialog(dell.this,"Record deleted successfully!");
			}else{
				JOptionPane.showMessageDialog(dell.this,"Unable to delete given id!");
			}	
	}
	if(ae.getSource()==btnNewButton){
		dispose();		
	}
	
}}}
