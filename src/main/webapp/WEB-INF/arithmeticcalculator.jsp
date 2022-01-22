<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <div>
                <label for="first">First:</lable>
                <input type="text" name="first" id="first">
            </div>
            <div>
                <label for="second">Second:</lable>
                <input type="text" name="first" id="first">
            </div>            
            
            <div>
                <button type="submit" id="plus" name="plus">+</button>
                <button type="submit" id="minus" name="minus">-</button>
                <button type="submit" id="times" name="times">*</button>
                <button type="submit" id="obelus" name="obelus">%</button>
            </div>
        </form>
        
        <p>Result: ${message}</p>
        
        <div>
            <a href="/Calculators/age">Age Calculator</a>
        </div>
    </body>
</html>