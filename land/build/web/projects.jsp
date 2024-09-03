<%-- 
    Document   : aboutUs
    Created on : Sep 3, 2024, 2:57:35 PM
    Author     : Akila Udantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projects</title>
        <style>
        
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            
            background-size: cover; 
            background-attachment: fixed; 
             
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
    </body>
</html>
