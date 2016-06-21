<%--
  Created by IntelliJ IDEA.
  User: bbuharali
  Date: 21/6/16
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Bookstore</title>
  </head>
  <body>
  <h1>Welcome to the Bookstore</h1>
  <table style="width:100%">
  <c:forEach items="${books}" var="book">
    <tr>
      <td>${book.title}</td>
      <td>${book.author}</td>
      <td><a href="/spring/book/${book.title}">Click here!</a></td>
    </tr>
  </c:forEach>
  </table>
  </body>
</html>
