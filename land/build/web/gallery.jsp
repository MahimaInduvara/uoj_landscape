<%-- 
    Document   : gallery
    Created on : Aug 13, 2024, 12:04:38 AM
    Author     : MSI KATANA
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    Class.forName("com.mysql.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/landscape";
    Connection con=DriverManager.getConnection(url,"root","");
    Statement st=con.createStatement();
   String q1="SELECT*FROM gallery";
   ResultSet rs1=st.executeQuery(q1);
   

    %>
    <div class="content">
        <center><h1><b>Gallery</b></h1></center>
        
    </div>
    <div class="news">
        <table>
            <tr>
                <% 
                int a = 0;
                int b = 0;
                while(rs1.next() && b <= 4) {
                    if (b == 4) {
                        %>
                        </tr><tr>
                        <% 
                        while(a <= 3) { %>
                            <td>
                                <div class="card-container">
                                    <div class="card">
                                        <% 
                                            byte[] imageData = rs1.getBytes("GalleryPhoto");
                                            String base64Image = Base64.getEncoder().encodeToString(imageData);
                                        %>
                                        <img src="data:image/png;base64,<%= base64Image %>"  width="255px" height="280px" />
                                        <div class="card-body">
                                            <h4><%= rs1.getString("GalleryID") %></h4>
                                            <h3><%= rs1.getString("GalleryName") %></h3>
                                           
                                            
                                        </div>
                                    </div>
                                </div>
                            </td> 
                            <% 
                            rs1.next();
                            a++;
                        }
                        break;
                    } %>
                    <td>
                        <div class="col-md-4">
                            <div class="card">
                                <% 
                                    byte[] image = rs1.getBytes("GalleryPhoto");
                                    String base64 = Base64.getEncoder().encodeToString(image);
                                %>
                                <img src="data:image/png;base64,<%= base64 %>"  width="255" height="230" />
                                <div class="card-body">
                                    <h4><%= rs1.getString("GalleryID") %></h4>
                                    <h3><%= rs1.getString("GalleryName") %></h3>
                                    
                                    <br>
                                </div>
                            </div>
                        </div>
                    </td> 
                    <% b++;
                } %>
            </tr>
        </table>
    </div>
    </body>
</html>
