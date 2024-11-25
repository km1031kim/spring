<%--
  Created by IntelliJ IDEA.
  User: gimjingyu
  Date: 2024. 11. 25.
  Time: 오후 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<%--<form:form modelAttribute="user">--%>
<%--    이메일 : <form:input path="email" />--%>
<%--    비일번호 : <form:password path="password"/>--%>
<%--    <input type="submit" value="로그인" />--%>
<%--</form:form>--%>

<form action="/user/login" method="post">
  이메일 : <input type="text" name="email" />
  비밀번호 : <input type="text" name="password" />
  <button type="submit">로그인</button>
</form>
<h2> ${message}</h2>
</body>
</html>
