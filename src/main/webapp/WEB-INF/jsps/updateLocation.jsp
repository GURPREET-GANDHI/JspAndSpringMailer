<%@page language="java" contentType="text/html; ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html lang="en">
<head>
    <title>Hello Frontend!!</title>

</head>
<body>
<form action="updateLoc" method="post">

    <pre>
         Id: <input type="text" name="id" value="${location.id}" readonly="true"/> <br>
        Code: <input type="text" name="code" value="${location.code}"/> <br>
        Name: <input type="text" name="name" value="${location.name}"/> <br>
        Type:
        Urban: <input type="radio" name="type"
                      value="urban" ${location.type=='urban'? 'checked':''} /> </br>
        Rural: <input type="radio" name="type"
                      value="rural"  ${location.type=='rural'? 'checked':''} /> <br>
        <input type="submit" value="save">
    </pre>

    ${msg}
</form>

</body>
</html>