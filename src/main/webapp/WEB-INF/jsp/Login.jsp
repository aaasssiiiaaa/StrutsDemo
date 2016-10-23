<%--
  Created by IntelliJ IDEA.
  User: 98162
  Date: 2016/10/11
  Time: 19:08
  To change this template use File | Settings | File Templates.
  需求：登录界面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>基于Struts的登录系统应用</title>
</head>
<body>
    <!--action属性中的login是连接的业务控制器指定的名字，login必须与struts.xml中的名字一致
    -->
    <form method="post" action="login.action">
        用户名：<input name="userName" type="text" size="24">
        <br>
          密码：<input name="passWord" type="password" size="26">
        <br>
        <input type="submit" value="登录">
    </form>
    <hr>
</body>
</html>
