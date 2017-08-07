import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.DropMode;

public class AdminSuccess extends  JFrame implements ActionListener {
	JMenuBar jmb;
	JButton b4,b5,b6,b7;
	JMenuItem jmi1,jmi2,jmi3,jmi4;
	JLabel l1;
	private JLabel label;
	public  AdminSuccess  (String title){
		super(title);
		l1 = new JLabel("");
		b4= new JButton("Add Librarian");
		b4.setBackground(new Color(255, 222, 173));
		b4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		b5= new JButton("Delete Librarian");
		b5.setBackground(new Color(255, 222, 173));
		b5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		b6= new JButton("View Librarian");
		b6.setBackground(new Color(255, 222, 173));
		b6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		b7= new JButton("Logout");
		b7.setBackground(new Color(255, 222, 173));
		b7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		b4.setBounds(0,11,200,30);

		b5.setBounds(0,61,175,30);

		b6.setBounds(0,122,162,30);

		b7.setBounds(0,178,148,30);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		getContentPane().add(b7);
		b4.addActionListener(this);
		b5.addActionListener(this);

		b6.addActionListener(this);
b7.addActionListener(this);
		setVisible(true);
		
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		label = new JLabel("");
		label.setBackground(new Color(255, 222, 173));
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label.setIcon(new ImageIcon("images\\silver_linings_at_leeds_city_council.jpg"));
		label.setBounds(0, 0, 546, 331);
		getContentPane().add(label);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(562,370);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b4){
			addl al = new addl("Add Librarian");
		}
if(ae.getSource()==b5){
			dell dl = new dell("Delete Librarian");
		}
if(ae.getSource()==b6){
	viewl vl = new viewl("View Librarian");
}
if(ae.getSource()==b7){
	dispose();
	
}
	}

}
