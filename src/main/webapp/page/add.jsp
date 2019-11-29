<%--
  Created by IntelliJ IDEA.
  User: hyy
  Date: 2019/11/4
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/save" method="post">
    姓名：<input type="text" name="name" placeholder=""/><br/>
    年龄：<input type="text" name="age" /><br/>
    性别：<input type="text" name="sex" /><br/>
    电话号码：<input type="text" name="number" /><br/>
    家庭住址：<input type="text" name="address" /><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>
