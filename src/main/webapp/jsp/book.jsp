<%--
  Created by IntelliJ IDEA.
  User: bbuharali
  Date: 21/6/16
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${book} Book</title>
</head>
<body>
<h1>${book} Book</h1>
<form action="/spring/${book}/chk" method="POST">
    Quantity: <input type="text" name="quantity" />
    <input type="submit" value="Buy" />
</form>

<form action="/spring/jsp/chk.jsp" method="POST">
    <input type="hidden" name="book" value="${book}"/>
    Second Quantity: <input type="text" name="quantity" />
    <input type="submit" value="Buy" />
</form>
</body>
</html>
