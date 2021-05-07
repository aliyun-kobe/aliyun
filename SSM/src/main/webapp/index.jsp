<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/4/30
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <a href="account/findAll">测试</a>
  <hr size="5" width="100%" color="green"></hr>
  <form action="account/saveAccount" method="post">
      姓名:<input type="text" name="name"></br>
      金额:<input type="text" name="money"></br>
      <input type="submit" value="提交">
  </form>
</body>
</html>
