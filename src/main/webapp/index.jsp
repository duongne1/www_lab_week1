<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>LOGON</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div id="index">
    <form id="formLogin" action="action" method="get">
        <h2 >LOGIN FORM</h2>
        <label>User:</label>
        <input  class="ip1" type="text" name="userName" placeholder="Enter User"/> <br>
        <label>Password:</label>
        <input class="ip2" type="password" name="password" placeholder="Enter password"/> <br>
        <button type="submit" id="loginbtn" name="login" >Login</button>
    </form>
    <a href="dashboard.jsp">dashboard</a>
</div>
</body>
</html>