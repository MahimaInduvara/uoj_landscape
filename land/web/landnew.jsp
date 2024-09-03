<%-- 
    Document   : landS
    Created on : Jul 20, 2024, 8:58:38 PM
    Author     : DELL
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <title>University Landscape - Home</title>
    <link rel="stylesheet" href="css/style.css">
    <style>
        
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('image/2.jpg');
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
            margin-top: 0px; 
            color: black;
            
        }

        .card-container {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            margin-top: 50px;
        }
        .card:hover{
            background-color: #fdff01;
            color:#a83022;
        }
        

        .card {
            border: 0;
            border-radius: 8px;
            padding: 20px;
            width: 295px;
            height: 450px;
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
</head>
<body>
    <%
    Class.forName("com.mysql.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/landscape";
    Connection con=DriverManager.getConnection(url,"root","");
    Statement st=con.createStatement();
    String q1="SELECT*FROM events";
    ResultSet rs=st.executeQuery(q1);
    %>
  
    <div class="flex-container" style=" padding-bottom: 700px;">
        <nav class="menu" style=" align-items: center; padding-left: 260px;">
            <ul>
                <li><a href="landnew.jsp">Home</a></li>
                <li><a href="aboutUs.jsp">About Us</a></li>
                <li><a href="projects.jsp">Projects</a></li>
                <li><a href="resources.html">Resources</a></li>
                <li><a href="gallery.jsp">Gallery</a></li>
                <li><a href="contactUs.html">Contact Us</a></li>
                </ul>            
            <div class="logo">
                <img src="image/uoj.png" alt="University Image" width="350px" height="110px">
            </div>
            </nav>
    </div>
 
    <div class="content">
        <h1>Welcome to Our University</h1>
        <p>This is the home page content.</p>
    </div>

    <div class="news">
        <h1><b>Uoj Events</b></h1>
        <p>What's Happening at Our University</p>
    </div>

    <div class="card-container">
        <table>
            <tr>
                <% 
                int d=0;
                int c=0;
                while(rs.next() && c <= 4) {
                    if(c == 4) {
                %>
                </tr><tr>
                <% 
                    while(d <= 3) {
                %>
                <td>
                    <div class="card-container">
                        <div class="card">
                            <% 
                            byte[] imageData = rs.getBytes("photo");
                            String base64Image = Base64.getEncoder().encodeToString(imageData);
                            %>
                            <img src="data:image/png;base64,<%= base64Image %>" width="255px" height="280px" />
                            <div class="card-body">
                                <form action="landnew.jsp" method="post">
                                    <h3><%=rs.getString("ename") %></h3>
                                    <p class="card-text"><%=rs.getString("description") %></p>
                                    <h4><%=rs.getString("eid") %></h4>
                                </form>
                            </div>
                        </div>
                    </div>
                </td>
                <% 
                    rs.next();
                    d++;
                }
                break;
            } %>
            <td>
                <div class="card-container">
                    <div class="card">
                        <% 
                        byte[] image = rs.getBytes("photo");
                        String base64 = Base64.getEncoder().encodeToString(image);
                        %>
                        <img src="data:image/png;base64,<%= base64 %>" width="255" height="230" />
                        <div class="card-body">
                            <form action="landnew.jsp" method="post">
                                <h4><%=rs.getString("eid") %></h4>
                                <h3><%=rs.getString("ename") %></h3>
                                <p class="card-text"><%=rs.getString("description") %></p>
                            </form>
                        </div>
                    </div>
                </div>
            </td>
            <% c++; } %>
        </tr>
    </table>
</div>
 <br><br>
        <%
            Statement st1=con.createStatement();
            
            String q2="SELECT*FROM news";
   ResultSet rs1=st1.executeQuery(q2);%>
<div class="content">
    <h1><b>Uoj News</b></h1>
    <p>Forthcoming news at the university</p>
</div>

<div class="news">
    <center><table>
        <tr>
            <% 
            int a = 0;
            int b = 0;
            while(rs1.next() && b <= 4) {
                if (b == 4) {
            %>
            </tr><tr>
            <% 
                while(a <= 3) { 
            %>
            <td>
                <div class="card-container">
                    <div class="card">
                        <% 
                        byte[] imageData = rs1.getBytes("photo");
                        String base64Image = Base64.getEncoder().encodeToString(imageData);
                        %>
                        <img src="data:image/png;base64,<%= base64Image %>" width="255px" height="280px" />
                        <div class="card-body">
                            <h4><%= rs1.getString("nid") %></h4>
                            <h3><%= rs1.getString("nname") %></h3>
                            <p class="card-text"><%= rs1.getString("description") %></p>
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
                <div class="card-container">
                    <div class="card">
                        <% 
                        byte[] image = rs1.getBytes("photo");
                        String base64 = Base64.getEncoder().encodeToString(image);
                        %>
                        <img src="data:image/png;base64,<%= base64 %>" width="255" height="230" />
                        <div class="card-body">
                            <h4><%= rs1.getString("nid") %></h4>
                            <h3><%= rs1.getString("nname") %></h3>
                            <p class="card-text"><%= rs1.getString("description") %></p>
                        </div>
                    </div>
                
            </td>
            <% b++; } %>
        </tr>
        </table></center></div>
        <footer>
        <p>&copy; 2024 University Landscape. All Rights Reserved.</p>
        <p>
            <a href="privacy.html" style="color: white; text-decoration: none;">Privacy Policy</a> | 
            <a href="terms.html" style="color: white; text-decoration: none;">Terms of Use</a>
        </p>
        <p>Follow us on 
            <a href="#" style="color: white; text-decoration: none;">Facebook</a>, 
            <a href="#" style="color: white; text-decoration: none;">Twitter</a>, 
            <a href="#" style="color: white; text-decoration: none;">Instagram</a>
        </p>
    </footer>
</div>
        

</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</html>
