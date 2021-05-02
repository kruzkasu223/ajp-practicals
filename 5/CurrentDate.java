import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class CurrentDate extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Display Current Date & Time";
        Date date = new Date();
        // String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
        // "transitional//en\">\n";
        out.println("<h2>" + "Current Date & Time: " + date.toString() + "</h2>");
        out.close();
    }
}