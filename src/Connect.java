import java.sql.*;
import java.util.Properties;
public class Connect
{
	public Connection conn()
	{
		Connection con=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		return con;
	}
}
