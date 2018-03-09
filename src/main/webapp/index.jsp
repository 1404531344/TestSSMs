<%--
  Created by IntelliJ IDEA.
  User: fz
  Date: 2018/3/7
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="../../plugs/bootstrap/css/bootstrap.min.css">
    <script src="../../plugs/jquery/jquery.min.js"></script>
    <script src="../../plugs/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

<form action="/queryLike.action" method="get">
    <input type="text" name="pid"></br>
    <%--<input type="text" name="pid"></br>--%>
    <button type="submit">提交</button>

</form>

<span class="glyphicon glyphicon-search" aria-hidden="true"></span><br>

</body>
</html>
