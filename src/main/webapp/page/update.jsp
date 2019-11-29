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
    <title>修改学生信息</title>
</head>
<body>
<h2>修改学生信息</h2>
<form action="${pageContext.request.contextPath}/student/update" method="post">
    <input type="hidden" name="s_id" value="${student.s_id}">
    姓名：<input type="text" name="name" value="${student.name}"/><br/>
    年龄：<input type="text" name="age" value="${student.age}"/><br/>
    性别：<input type="text" name="sex" value="${student.sex}"/><br/>
    电话号码：<input type="text" name="number" value="${student.number}"/><br/>
    家庭住址：<input type="text" name="address" value="${student.address}"/><br/>
    <input type="submit" class="btn btn-success" value="保存"/><br/>
</form>
</body>
</html>
