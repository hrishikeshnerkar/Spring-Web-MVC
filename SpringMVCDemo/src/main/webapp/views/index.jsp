<%@ page language="java" %>
<html>
    <head>
        <title>Addition Form</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h1>Addition of Two numbers</h1>
        <form action="add">
            <label for="num1"> Enter 1st number: </label>
            <input type="text" id="num1" name="num1"><br>
            <label for="num2"> Enter 2st number: </label>
            <input type="text" id="num2" name="num2"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>