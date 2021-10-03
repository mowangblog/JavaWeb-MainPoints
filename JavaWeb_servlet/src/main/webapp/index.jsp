<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="ServletRequest">Hello Servlet</a>
<form action="ServletRequest" method="post">
    <input type="text" size="80" value="user" name="user">用户名
    <input type="password" size="80" value="password" name="password">密码
    <input type="submit" size="80" value="提交">
</form>
</body>
</html>