import java.sql.*;

public class select {
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
              
            // SELECT query
            String q1 = "select * from studregi WHERE fname = '" + fname + 
                                    "' AND lname = '" + lname + "'";
            ResultSet rs = stmt.executeQuery(q1);
            if (rs.next())
            {
                System.out.println("Enrollment No.: " + rs.getString(1));
                System.out.println("First Name:" + rs.getString(2));
                System.out.println("Last Name:" + rs.getString(3));
                System.out.println("Semester:" + rs.getString(4));
                System.out.println("Contact No.:" + rs.getString(5));
            }
            else
            {
                System.out.println("No such user id is already registered");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}