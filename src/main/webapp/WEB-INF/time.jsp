<%--
  Created by IntelliJ IDEA.
  User: Albert
  Date: 25.04.2023
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>Current server time: <%=request.getAttribute("date")%>

</h1>
<br>
<a href="./">Go back.</a>
</body>
</html>
