<%-- 
    Document   : adminLog1
    Created on : Aug 5, 2024, 8:56:55 PM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table>
            <form action="event.html" method="post">
                <tr><td>
                        <button type="submit">Events</button>
                    </td></tr>
            </form>
             <form action="news.html" method="post">
                <tr><td>
                        <button type="submit">News</button>
                    </td></tr>
            </form>
             <form action="edit.html" method="post">
                <tr><td>
                        <button type="submit">Edit Admin</button>
                    </td></tr>
            </form>
        </table>
       
       <%
          String user=request.getParameter("un");
       String pass=request.getParameter("pw");
      try{ Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/landscape";
       Connection con=DriverManager.getConnection(url,"root","");
       Statement st=con.createStatement();
       
       String q="INSERT INTO adminlog (username, password) VALUES('"+user+"','"+pass+"')";
       st.executeQuery(q);
      }
      catch(Exception ex)
      {out.println(ex.getMessage());}
       %>
    </body>
</html>
