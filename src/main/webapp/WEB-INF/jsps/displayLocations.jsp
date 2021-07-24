<%@page language="java" contentType="text/html; UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>

<h2>Locations</h2>
<br>

<table border="2" width="3" cellspacing="2" cellpadding="2" align="center">

    <tr>
        <th>ID</th>
        <th>CODE</th>
        <th>NAME</th>
        <th>TYPE</th>
    </tr>
    <c:forEach items="${locations}" var="location">

        <tr>
            <td>${location.id}</td>
            <td>${location.code}</td>
            <td>${location.name}</td>
            <td>${location.type}</td>
            <td><a href="deleteLocations?id=${location.id}">delete</a></td>
            <td><a href="showUpdate?id=${location.id}">update</a></td>

        </tr>


    </c:forEach>
</table>


<a href="showCreate">Create Location </a>


</body>
</html>