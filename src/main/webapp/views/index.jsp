<%@page language = "java" %>

<html>
    <body>
            <h2> ${name} Calculator </h2>

            <form action="addUser">
                <label for="id" >Enter Id : </label>
                <input type="text" id="id" name="id">
                <br>
                <label for="name">Enter Name : </label>
                <input type="text" id="name" name="name">
                <br>
                <input type="submit" value="Login">
            </form>
    </body>
</html>