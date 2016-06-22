<%--
  Created by IntelliJ IDEA.
  User: bbuharali
  Date: 21/6/16
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Checkout Bookstore</title>
</head>
<body>
<h1>Checkout Bookstore</h1>
You want <%= request.getParameter("quantity")%> book <%= request.getParameter("book")%>
<td><a href="/spring/pdf">Click for pdf</a></td>
</body>
</html>
