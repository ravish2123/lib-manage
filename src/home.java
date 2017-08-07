import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class home extends JFrame implements ActionListener {
	JFrame frmKvchLibraryManagement;
	JLabel lblNewLabel;
	JMenuBar menuBar;
	JMenu mnNewMenu,mnAbout;
	JMenuItem mntmNewMenuItem,mntmLibrarianLogin,mntmAboutUs;
	public home(){
		
		
	
	
 

			frmKvchLibraryManagement = new JFrame();
			
			frmKvchLibraryManagement.setSize(1800,1200);
			frmKvchLibraryManagement.setTitle("KVCH Library Management");
			//frmKvchLibraryManagement.getContentPane().setBackground(Color.WHITE);
			frmKvchLibraryManagement.setResizable(true);
			lblNewLabel = new JLabel("");
			lblNewLabel.setBackground(SystemColor.activeCaptionText);
			lblNewLabel.setIcon(new ImageIcon("images\\Home.jpg"));
			frmKvchLibraryManagement.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
			frmKvchLibraryManagement.setBounds(0, 0, 1800, 1200);
			frmKvchLibraryManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			menuBar = new JMenuBar();
			frmKvchLibraryManagement.setJMenuBar(menuBar);
			menuBar.setBounds(0,0,1800,30);
		
			
			mnNewMenu = new JMenu("Library");
			menuBar.add(mnNewMenu);
			
			mntmNewMenuItem = new JMenuItem("Admin Login");
			mntmNewMenuItem.addActionListener(this);
				
			mntmNewMenuItem.setIcon(new ImageIcon("images\\admin 3.png"));
			mnNewMenu.add(mntmNewMenuItem);
			
			mntmLibrarianLogin = new JMenuItem("Librarian Login");
			mntmLibrarianLogin.setIcon(new ImageIcon("images\\User-library1.png"));
			mnNewMenu.add(mntmLibrarianLogin);
			mntmLibrarianLogin.addActionListener(this);
			
			 mnAbout = new JMenu("About");
			menuBar.add(mnAbout);
			
			 mntmAboutUs = new JMenuItem("About Us");
			mntmAboutUs.setIcon(new ImageIcon("images\\about-us-icon-151.png"));
			mnAbout.add(mntmAboutUs);
			frmKvchLibraryManagement.setVisible(true);
			
		}

	


		


	/**
	 * @param args
	 */
	public static void main(String[] args) {

home h = new home();
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==mntmNewMenuItem){
			admin ad = new admin("Admin Login");
			
		}
		if(ae.getSource()==mntmLibrarianLogin){
			libLogin ll = new libLogin("Librarian Login");
		}
	}

}
