import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.DropMode;



public class admin extends JFrame implements ActionListener {
	
	
	JLabel l1,l2;
JTextField t1;
JPasswordField t2;
	JButton b3;
	
	
	public admin(String title){
		super(title);
		setResizable(false);
		
		
		l1 = new JLabel("Admin Username:");
		l1.setForeground(new Color(0, 0, 255));
		l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		l2 = new JLabel("Admin password:");
		l2.setForeground(new Color(0, 0, 255));
		l2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		t1 = new JTextField();
		t1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		t1.setForeground(new Color(0, 0, 0));
		t1.setBackground(new Color(244, 164, 96));
		t2 = new JPasswordField();
		t2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		t2.setBackground(new Color(244, 164, 96));
		b3 = new JButton("Submit");
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(new Color(0, 0, 255));
		b3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		l1.setBounds(40,20,182,30);
		
		t1.setBounds(259, 20, 120, 30);
		l2.setBounds(40,60,163,30);
		t2.setBounds(259, 60, 120, 30);
		b3.setBounds(122, 118, 110, 39);
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(t1);
		getContentPane().add(t2);
		getContentPane().add(b3);
		b3.addActionListener(this);
		getContentPane().setBackground(Color.orange);
setSize(600,293);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(248, 248, 255));
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label.setIcon(new ImageIcon("images\\library1.jpg"));
		label.setBounds(0, 0, 594, 264);
		getContentPane().add(label);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3){
			String un=t1.getText();
			String pd=String.valueOf( t2.getPassword());
			if(un.equals("admin")&&pd.equals("admin123")){
				AdminSuccess as = new AdminSuccess("Admin");
				
			}else
			{

				JOptionPane.showMessageDialog(admin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				t1.setText("");
				t2.setText("");
			}
			
		}
	}
}
