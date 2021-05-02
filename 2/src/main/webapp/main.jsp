<%
   Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
   Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));
   firstName.setMaxAge(60*60*24); 
   lastName.setMaxAge(60*60*24); 
      response.addCookie( firstName );
   response.addCookie( lastName );
%>
<html>
   <head>
      <title>Setting Cookies</title>
   </head>
   <body>
      <center>
         <h1>Setting Cookies</h1>
      </center>
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p></li>
      </ul>
   </body>
</html>