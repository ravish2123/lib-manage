import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.*;


public class viewl extends JFrame {
	private JTable table;
	JPanel contentPane;
	

	public viewl(String title)
	{
		super(title);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		String data[][]=null;
		String column[]=null;
		try
		{
			Connect cn=new Connect();
			Connection con=cn.conn();
			PreparedStatement ps=con.prepareStatement("select * from viewl",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();
			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
		
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		table = new JTable(data,column);
		table.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		JScrollPane sp = new JScrollPane(table);
		contentPane.add(sp,BorderLayout.CENTER);
		setSize(400,400);
		setVisible(true);
		
	}


}
