import java.sql.*;
public class LibrarianDao {

	
	public static int save(String name,String password,String email,String address,String city,String contact){
		int status=0;
		try{
			Connect cn=new Connect();
			Connection con=cn.conn();
			
			PreparedStatement ps=con.prepareStatement("insert into viewl(Name,Password,Email,Address,Phone,City) values(?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,address);
			ps.setString(5,contact);
			ps.setString(6,city);
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(String sid){
		int status=0;
		try{
			Connect cn=new Connect();
			Connection con=cn.conn();
			PreparedStatement ps=con.prepareStatement("delete from viewl where name=?");
			ps.setString(1,sid);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connect cn=new Connect();
			Connection con=cn.conn();
			
			PreparedStatement ps=con.prepareStatement("select * from viewl where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
