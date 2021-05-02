import java.sql.*;

public class delete {
    public static void main(String args[])
    {
        String fname = "Krushang";
        String lname = "Kasundra";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("
             jdbc:oracle:thin:@localhost:1521:orcl", "login", "pwd");
            Statement stmt = con.createStatement();
                   
            // Deleting from database
            String q1 = "DELETE from studregi WHERE fname = '" + fname + 
                    "' AND lname = '" + lname + "'";
                      
            int x = stmt.executeUpdate(q1);
              
            if (x > 0)            
                System.out.println("One Student Successfully Deleted...");            
            else
                System.out.println("ERROR OCCURED :(");  
            
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}