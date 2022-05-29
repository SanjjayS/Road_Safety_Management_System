 import java.sql.*;

 public class Tablerules {
 	public static void main(String args[])
 	{
 		try {
 			Connection connection = DriverManager.getConnection("jdbc:derby:testdb;create=true");
 			System.out.println("Connected To Derby Database!");
 			// Statement st = connection.createStatement();
 			// st.executeUpdate("create table RULEBOOK (Rulename varchar(30), Fine int)");
             Statement st1 = connection.createStatement();
 			st1.executeUpdate("insert into RULEBOOK values ('Over Speed', 350)");
             Statement st2 = connection.createStatement();
 			st2.executeUpdate("insert into RULEBOOK values ('Not wearing a SeatBelt', 250)");
             Statement st3 = connection.createStatement();
 			st3.executeUpdate("insert into RULEBOOK values ('Not wearing a Helmet', 500)");
             System.out.println("HIT");
 			connection.close();
 		}
 		catch(Exception ee)
 		{
			
 		}
 	}
}