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
<<<<<<< Updated upstream
=======
        <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            
            background-size: cover; 
            background-attachment: fixed; 
            color: white; 
        }

        .menu {
            display: flex;
            justify-content: center;
            background-color: #a83022;
            width: 100%;
            
            position: fixed;
            
            left: 0;
            z-index: 1000; /* Ensure it stays on top */
        }

        .menu ul {
            list-style: none;
            padding: 0;
            margin: 0;
            display: flex;
        }

        .menu ul li {
            margin: 0 15px;
        }

        .menu ul li a {
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            display: block;
        }

        .menu ul li a:hover {
            background-color: #fdff01;
            color:#a83022; 
            border-radius: 8px;
        }

        .logo {
            margin-left: auto;
            margin-right: 20px;
        }

        .content {
            text-align: center;
             
            color: black;
        }

        .card-container {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            
        }
        .card:hover{
            background-color: #fdff01;
            color:#a83022;
        }
        

        .card {
            border: 0;
            border-radius: 8px;
            padding: 20px;
            width: 250px;
            height: 350px;
            background-color: rgba(255, 255, 255, 0.9); /* Semi-transparent background */
            margin: 20px;
        }

        .card h3, .card h4, .card p {
            color: black; 
        }

        .news {
            text-align: center;
            margin-top: 50px;
            color: black;
        }
        footer {
            background-color: #a83022;
            color: white;
            text-align: center;
            padding: 20px 0;
            
            bottom: 0;
            width: 100%;
            z-index: 1001;
        }
        
    </style>
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    <div class="content">
        <center><h1><b>Gallery</b></h1></center>
        
    </div>
=======
    <div class="flex-container" style=" padding-bottom: 700px;">
        <nav class="menu" style=" align-items: center; padding-left: 260px;">
            <ul>
                <li><a href="landnew.jsp">Home</a></li>
                <li><a href="aboutUs.html">About Us</a></li>
                <li><a href="projects.html">Projects</a></li>
                <li><a href="resources.html">Resources</a></li>
                <li><a href="gallery.jsp">Gallery</a></li>
                <li><a href="contactUs.html">Contact Us</a></li>
                </ul>            
            <div class="logo">
                <img src="image/uoj.png" alt="University Image" width="350px" height="110px">
            </div>
            </nav>
    </div>
    
>>>>>>> Stashed changes
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
