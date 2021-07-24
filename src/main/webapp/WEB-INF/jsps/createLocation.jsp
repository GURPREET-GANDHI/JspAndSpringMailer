<html lang="en">
<head>
    <title>Hello Frontend!!</title>

</head>
<body>
<form action="saveLoc" method="post">

    <pre>
        Id: <input type="text" name="id"/> <br>
        Code: <input type="text" name="code"/> <br>
        Name: <input type="text" name="name"/> <br>
        Type:
        Urban: <input type="radio" name="type" value="urban">
        Rural: <input type="radio" name="type" value="rural"> <br>
        <input type="submit" value="save">
    </pre>

    ${msg}
</form>

<a href="displayLocations">View All Locations</a>
</body>
</html>