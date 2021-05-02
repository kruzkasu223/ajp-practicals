<%@ page import="java.util.*,mypack.*,org.hibernate.*,org.hibernate.cfg.*" %>
    <%! int id;double add; String name; Session session1=null; %>

        <body>
            <table width="220" border="1">
                <tr>
                    <th>Phone No. </th>
                    <th>Name</th>
                    <th>Address</th>
                </tr>
                <% Configuration cf=new Configuration(); cf.configure(); SessionFactory sf=cf.buildSessionFactory();
                    session1=sf.openSession(); //Using from Clause String SQL_QUERY="from Cus" ; Query
                    query=session1.createQuery(SQL_QUERY); Iterator it=query.iterate(); while(it.hasNext()) { Cus
                    e=(Cus)it.next(); id=e.getCno(); name=e.getCname(); add=e.getAdd(); %>
                    <tr>
                        <td>
                            <%=id%>
                        </td>
                        <td>
                            <%=name%>
                        </td>
                        <td>
                            <%=add%>
                        </td>
                    </tr>
                    <% } session1.close(); %>
            </table>
        </body>

        </html>