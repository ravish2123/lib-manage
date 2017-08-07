import java.sql.*;


public class IssueBookDao {
	public static boolean checkBook(String bookcallno){
		boolean status=false;
		try{
			Connect cn = new Connect();
			Connection con=cn.conn();
			PreparedStatement ps=con.prepareStatement("select * from books where libid=?");
			ps.setString(1,bookcallno);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static int save(String bookcallno,int studentid,String studentname,String studentcontact){
		int status=0;
		try{
			Connect cn = new Connect();
			Connection con=cn.conn();
			
			status=updatebook(bookcallno);//updating quantity and issue
			
			if(status>0){
			PreparedStatement ps=con.prepareStatement("insert into issuebooks(bookcallno,studentid,studentname,studentcontact) values(?,?,?,?)");
			ps.setString(1,bookcallno);
			ps.setInt(2,studentid);
			ps.setString(3,studentname);
			ps.setString(4,studentcontact);
			status=ps.executeUpdate();
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int updatebook(String bookcallno){
		int status=0;
		int quantity=0,issued=0;
		try{
			Connect cn = new Connect();
			Connection con=cn.conn();
			
			PreparedStatement ps=con.prepareStatement("select qty,issued from books where libid=?");
			ps.setString(1,bookcallno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				quantity=rs.getInt("qty");
				issued=rs.getInt("issued");
			}
			
			if(quantity>0){
			PreparedStatement ps2=con.prepareStatement("update books set qty=?,issued=? where libid=?");
			ps2.setInt(1,quantity-1);
			ps2.setInt(2,issued+1);
			ps2.setString(3,bookcallno);
			
			status=ps2.executeUpdate();
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
