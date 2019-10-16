<%--
  Created by IntelliJ IDEA.
  User: sanab
  Date: 10/16/2019
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring REST Demo</title>
</head>
<body>
<h3>Spring REST Demo</h3>
<hr>
</body>
<a href="${pageContext.request.contextPath}/test/hello">Hello world</a>
<hr>
<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
</body>
</html>
