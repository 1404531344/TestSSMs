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

<form action="/fz.action" method="get">
  <%--编号：  <input type="text" name="pid"></br>--%>


    <%--<select name="stateplan">--%>
        <%--<option value ="正在进行中">正在进行中</option>--%>
        <%--<option value ="已完成">已完成</option>--%>
    <%--</select>--%>
      <input id="man" type="radio" checked="checked" name="sex" value="男"/>男 &nbsp;&nbsp;&nbsp;<input id="woman" type="radio"  name="sex" value="女"/>女
      <button type="submit">提交</button>

</form>



</body>
</html>
