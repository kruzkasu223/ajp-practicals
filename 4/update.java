import java.sql.*;

public class update {
    public static void main(String args[])
    {
        String fname = "Krushang";
        String lname = "Kasundra";
        String contact = "9879879988";
        String newContact = "9988779876";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("
             jdbc:oracle:thin:@localhost:1521:orcl", "login", "pwd");
            Statement stmt = con.createStatement();
          
            // Updating database
            String q1 = "UPDATE studregi set contact = '" + newContact + 
                    "' WHERE fname = '" +fname+ "' AND lname = '" + lname + "'";
            int x = stmt.executeUpdate(q1);
              
            if (x > 0)            
                System.out.println("Contact No. Successfully Updated...");            
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