 import java.sql.*;

 public class Tablepolice {
 	public static void main(String args[])
 	{
 		try {
 			Connection connection = DriverManager.getConnection("jdbc:derby:testdb;create=true");
 			System.out.println("Connected To Derby Database!");
 			Statement st = connection.createStatement();
 			st.executeUpdate("create table POLICE (Name varchar(30), RegisteredNumber varchar(30), Penalty int, Status varchar(30))");
             System.out.println("HIT");
 			connection.close();
 		}
 		catch(Exception ee)
 		{
		
 		}
	}
}