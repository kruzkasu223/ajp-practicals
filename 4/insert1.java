import java.sql.*;

public class insert1 {
    public static void main(String args[])
    {
        String enroll = "181120107027";
        String fname = "Krushang";
        String lname = "Kasundra";
        String sem = "6";
        String contact = "9879879988";
          
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("
             jdbc:oracle:thin:@localhost:1521:orcl", "login", "pwd");
            Statement stmt = con.createStatement();
              
            // Inserting data in database
            String q1 = "insert into studregi values('" +enroll+ "', '" +fname+ 
                                  "', '" +lname+ "', '" +sem+ "', '" +contact+ "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0)            
                System.out.println("Data Successfully Inserted...");            
            else            
                System.out.println("Insert Failed");
              
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}