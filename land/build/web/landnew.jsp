<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>University Landscape - Home</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('image/pura.jpg');
            background-size: cover; 
            background-attachment: fixed; 
            background-position: center; 
        }

        .menu {
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #FF0000;
            position: fixed;
            width: 100%;
            top: 0;
            left: 0;
            z-index: 1000;
            padding: 20px 0;
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
            background-color: yellow;
            color: red;
        }

        .logo img {
            height: 70px;
            width: auto;
        }

        .bimage {
            height: 400px; 
            background-color: rgba(255, 255, 255, 0.5); 
            margin-top: 80px; 
        }

        .bimage img {
            width: 100%;
            height: auto;
        }

        main {
            padding: 20px;
            margin-top: 800px; 
        }

        .content {
            text-align: center;
            margin-top: 20px;
        }

        .card-container {
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
            margin-top: 20px;
        }

        .card {
            background-color: #FF0000;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 30%;
            margin: 10px;
            text-align: center;
        }

        .card img {
            border-top-left-radius: 8px;
            border-top-right-radius: 8px;
            width: 100%;
            height: auto;
        }

        .card-body {
            padding: 15px;
        }

        .card-title {
            font-size: 1.5em;
            margin-bottom: 10px;
        }

        .card-text {
            font-size: 1em;
            margin-bottom: 15px;
        }

        .card-button {
            background-color: #333;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 5px;
            display: inline-block;
        }

        .card-button:hover {
            background-color: #555;
        }

        .ptag {
            background-color: yellow;
            padding: 20px;
        }

        @media (max-width: 768px) {
            .card-container {
                flex-direction: column;
                align-items: center;
            }

            .card {
                width: 80%;
                margin: 10px 0;
            }
        }
    </style>
</head>
<body>
    <nav class="menu">
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="aboutUs.html">About Us</a></li>
            <li><a href="projects.html">Projects</a></li>
            <li><a href="resources.html">Resources</a></li>
            <li><a href="gallery.html">Gallery</a></li>
            <li><a href="contactUs.html">Contact Us</a></li>
        </ul>
        <div class="logo">
            <img src="image/uoj.jpg" alt="University Image">
        </div>
    </nav>
    
    <main>
        <div class="content">
            <h1>Welcome to Our University</h1>
            <p>This is the home page content.</p>
        </div>
        <div class="ptag">
            <div class="content">
                <h1><b>Uoj News</b></h1>
                <p>What's Happening at Our University</p>
            </div>
        </div>
        <div class="card-container">
            <div class="card">
                <img src="image/uj.PNG" alt="Card Image 1">
                <div class="card-body">
                    <h2 class="card-title">Card Title 1</h2>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="card-button">Read More</a>
                </div>
            </div>
            <div class="card">
                <img src="image/uj.PNG" alt="Card Image 2">
                <div class="card-body">
                    <h2 class="card-title">Card Title 2</h2>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="card-button">Read More</a>
                </div>
            </div>
            <div class="card">
                <img src="image/uj.PNG" alt="Card Image 3">
                <div class="card-body">
                    <h2 class="card-title">Card Title 3</h2>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="card-button">Read More</a>
                </div>
            </div>
        </div>
    </main>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
