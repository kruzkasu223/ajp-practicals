import java.sql.*;
  
public class connect 
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
              
            // Establishing Connection
            Connection con = DriverManager.getConnection(
             "jdbc:oracle:thin:@localhost:1521:orcl", "login", "pwd");
  
            if (con != null)             
                System.out.println("Connected…");            
            else            
                System.out.println("Not Connected");
              
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}