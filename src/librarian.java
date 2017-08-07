import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
public class librarian extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6;
	private JLabel label;
	public librarian(String title){
		super(title);
		b1 = new JButton("Add Books");
		b1.setBackground(new Color(230, 230, 250));
		b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		b2 = new JButton("View Books");
		b2.setBackground(new Color(255, 250, 205));
		b2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		b3 = new JButton("Issue Books");
		b3.setBackground(new Color(255, 127, 80));
		b3.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		b4 = new JButton("View Issued Books");
		b4.setBackground(new Color(32, 178, 170));
		b4.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		b5 = new JButton("Return Book");
		b5.setBackground(new Color(233, 150, 122));
		b5.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		b6 = new JButton("Logout");
		b6.setBackground(new Color(148, 0, 211));
		b6.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		b1.setBounds(87,180,100,30);
		b2.setBounds(251,180,136,30);
		b3.setBounds(445,180,122,30);
		b4.setBounds(65,402,136,30);
		b5.setBounds(251,402,136,30);b6.setBounds(445,402,122,30);
		
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		
		getContentPane().setLayout(null);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("images\\jij.jpg"));
		label.setBounds(0, 0, 625, 558);
		getContentPane().add(label);
		setVisible(true);
		setSize(645,578);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
	}
	

	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1){
			addb ab = new addb("Add Book");
			
		}
		if(ae.getSource()==b3){
			issueb ib = new issueb("Issue Book");
			
		 }
		if(ae.getSource()==b5){
			returnb ab = new returnb("Return Book");
			
		}
		if(ae.getSource()==b2){
			viewb vb = new viewb("View Books");
			
		}
		
		if(ae.getSource()==b4){
			vib ab = new vib("View Issued Books");
			
		}
		
			
		
		if(ae.getSource()==b6){
			dispose();
			
		}
		
		
	}

}
