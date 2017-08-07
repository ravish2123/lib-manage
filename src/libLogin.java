import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class libLogin extends JFrame implements ActionListener{
	JLabel lnm,lpw;
	JTextField tnm;
	JPasswordField tpw;
	JButton sub;
	private JLabel label;
	
	public libLogin(String title){
	super(title);
	lnm  =new JLabel("Name:");
	lnm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	lpw = new JLabel("Password:");
	lpw.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	tnm = new JTextField();
	tnm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	tpw = new JPasswordField();
	tpw.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	sub = new JButton("Submit");
	sub.setBackground(new Color(255, 255, 255));
	sub.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
	lnm.setBounds(130,101,100,30);
	lpw.setBounds(130,142,100,30);
	tnm.setBounds(240,104,129,30);
	tpw.setBounds(240,145,129,30);
	sub.setBounds(195,214,100,30);
	getContentPane().add(lnm);
	getContentPane().add(lpw);
	getContentPane().add(tnm);
	getContentPane().add(tpw);
	getContentPane().add(sub);
	getContentPane().setLayout(null);
	
	label = new JLabel("");
	label.setIcon(new ImageIcon("images\\hgsg.jpg"));
	label.setBounds(0, 0, 500, 350);
	getContentPane().add(label);
	setVisible(true);
	setSize(520,370);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	sub.addActionListener(this);
	
	
}

	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==sub){
			
			String name=tnm.getText();
			String password=String.valueOf(tpw.getPassword());
			//System.out.println(name+" "+password);
			if(LibrarianDao.validate(name, password)){
				librarian li = new librarian("Librarian");
				dispose();
			}else{
				JOptionPane.showMessageDialog(libLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				tnm.setText("");
				tpw.setText("");
			}
			}
		}
	}

