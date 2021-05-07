<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/4/30
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h3>查询所有账户</h3>
  <c:forEach items="${requestScope.list}" var="account">
      ${account.name}
      ${account.money}
  </c:forEach>
</body>
</html>
