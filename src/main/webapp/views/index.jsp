<%@page language = "java" %>

<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <title> Login Page </title>
    </head>
    <body>
            <h2 class="login">Login Page</h2>
            <h2 class="heading"> ${name} </h2>

            <form class = "form" action="addUser">
                <label for="id" >Enter Id : </label>
                <input type="text" id="id" name="id">
                
                <label for="name">Enter Name : </label>
                <input type="text" id="name" name="name">
                <br>
                <input class="button" type="submit" value="Login">
            </form>
    </body>
</html>