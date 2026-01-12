//JDBC--> java database connectivity(API)
//java-->JDB-->database
//drivers-->types1,2,3,4
//1.install database
//2.download database related jar file and add to project
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
public class DemoJDBC {
	private static String USERNAME="postgres";
	private static String PWD="veena";
	private static String URL="jdbc:postgresql://localhost:5432/AVN";
	public static void main(String[] args) {
		try {
			//1.load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
		    //2.get the connection 
			Connection con = DriverManager.getConnection(URL, USERNAME, PWD);
			System.out.println("connection established");
			//3. create the statement
			Statement stmt=con.createStatement();
			//4. execute query
			String Query="select*from student";
			ResultSet rs=stmt.executeQuery(Query);
			while(rs.next()) {
				System.out.println(
						rs.getInt(1) +" "+
			   		    rs.getString(2)+" "+
					    rs.getString(3)
					    );
			}
			rs.close();
			con.close();
			stmt.close();
	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
