<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/maths/caculator" method="post">
    <h1>Calculator</h1>
    <input type="number" name="s1" id="s1" step="any" required>
    <input type="number" name="s2" id="s2" step="any" required><br><br>
    <input type="submit" name="operation" value="Addition(+)">
    <input type="submit" name="operation" value="Subtraction(-)">
    <input type="submit" name="operation" value="Multiplication(X)">
    <input type="submit" name="operation" value="Division(/)">
</form>

<h3>Result: ${result}</h3>
<c:if test="${not empty error}">
    <p style="color: red;">${error}</p>
</c:if>
</body>
</html>
