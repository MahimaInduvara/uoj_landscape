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
        }

        .container {
            width: 80%;
            margin: 0 auto;
        }

        .flex-container {
            display: flex;
            align-items: center;
            
        }

        .menu {
            display: flex;
            flex-grow: 1;
            justify-content: center;
            background-color: #FF0000;
            width: 100%;
            padding-left: 350px;
            padding-top: 100px;
              position: fixed;
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
            background-color: #555;
        }

        .image-container {
            margin-right: 20px;
        }

        .image-container img {
            height: 108px;
            width: 250px;
        }

        .content {
            text-align: center;
            margin-top: 20px;
        }

        

        .card {
             border: 0;
        border-radius: 8px;
        padding: 20px;
        width: 295px;
        height: 450px;
       
        background-color: #fff;
        margin: 20px;
        }

        .card h3 {
        margin-top: 0;
    }

   
    .card p {
        margin-bottom: 0;
    }

        
        


        

      
        .logo{
            padding-left: 200px;
            
        }
        .bimage{
            padding-top: 60px;
             position: fixed;
        }
        .all{
            padding-top: 700px;
        }
        .ptag{
             
            justify-content: space-around;
            flex-wrap: wrap-reverse;
            background-color: yellow;
            
            
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
  
        <div class="flex-container">
            
            <nav class="menu">
                <ul>
                    <li><a href="landnew.jsp">Home</a></li>
                    <li><a href="aboutUs.html">About Us</a></li>
                    <li><a href="projects.html">Projects</a></li>
                    <li><a href="resources.html">Resources</a></li>
                    <li><a href="gallery.jsp">Gallery</a></li>
                    <li><a href="contactUs.html">Contact Us</a></li>
                </ul>
                <div class="logo">
                <img src="image/uoj.jpg" alt="University Image" width="130px" height="70px" style=" padding-right: 0px; padding-left: 10px;">
           </div>
            </nav>
        </div>
    <div class="bimage">
    <br><img src="image/" width="100%" height="100%"></div>
    
 
        <div class="all">
            <div class="ptag">
        <div class="content">
            <h1> Welcome to Our University</h1>
                <p>This is the home page content.</p>
        </div></div><br><br>
        <div class="news">
            <center>
                <h1><b>Uoj Events</b></h1>
            <p>What's Happening at Our University</p>
        </div></center>
            <br><br>
            
            <table>
        <tr>
            
            <% 
                int d=0;
                int c=0;
                while(rs.next() && c<=4)
                {
            if(c==4)
            {%>
        </tr><tr>
           <% while(d<=3){
 %><td>
                  <div class="card-container">
        <div class="card">
            <% 
                byte[] imageData = rs.getBytes("Image");
                String base64Image = Base64.getEncoder().encodeToString(imageData);
                
                 %>
                 <img src="data:image/png;base64,<%= base64Image %>"  width="255px" height="280px" />
            <div class="card-body"><form action="landnew.jsp" method="post">
                <h3><%=rs.getString("ename") %></h3>
                <p class="card-text"><%=rs.getString("description")%></p>
                <h4><%=rs.getString("eid") %></h4>
                 <br>
                 </form>
                </form></div>
            </div>
        </div>
    
                  
              </td> 
            <%rs.next();
            d++;}

            break;
            

}
            %><td>
                  <div class="col-md-4">
        <div class="card">
            <% 
                byte[] image = rs.getBytes("photo");
                String base64 = Base64.getEncoder().encodeToString(image);
                
                 %>
                 <img src="data:image/png;base64,<%= base64 %>"  width="255" height="230" />
            <div class="card-body"><form action="landnew.jsp" method="post">
                    <h4><%=rs.getString("eid") %></h4><input type="hidden" name="eid" value="<%=rs.getString("eid") %>">
                <h3><%=rs.getString("ename") %></h3><input type="hidden" name="name" value="<%=rs.getString("ename") %>">
                <p class="card-text"><%=rs.getString("description")%></p><input type="hidden" name="des" value="<%=rs.getString("description") %>">
                
                 <br>
                 </form>
                </form>
            </div>
        </div>
    </div>
                  
              </td>  <% c++;}
            
            %>
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
    <p>Forthcoming news at the university</p><br><br>
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
                                        byte[] imageData = rs1.getBytes("Image");
                                        String base64Image = Base64.getEncoder().encodeToString(imageData);
                                    %>
                                    <img src="data:image/png;base64,<%= base64Image %>"  width="255px" height="280px" />
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
                    <div class="col-md-4">
                        <div class="card">
                            <% 
                                byte[] image = rs1.getBytes("photo");
                                String base64 = Base64.getEncoder().encodeToString(image);
                            %>
                            <img src="data:image/png;base64,<%= base64 %>"  width="255" height="230" />
                            <div class="card-body">
                                <h4><%= rs1.getString("nid") %></h4>
                                <h3><%= rs1.getString("nname") %></h3>
                                <p class="card-text"><%= rs1.getString("description") %></p>
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
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</html>
