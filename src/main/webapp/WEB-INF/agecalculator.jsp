<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <div>
                <label for="age">Enter your age:</lable>
                <input type="number" name="age" id="age">
            </div>
            
            <button type="submit" value="Age next birthday">Submit</button>
        </form>
        
        <p>Result: ${message}</p>
        
        <div>
            <a href="/Calculators/arithmetic">Arithmetic Calculator</a>
        </div>
    </body>
</html>