<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<br>
<h2>查询所有的学生信息</h2>

<table border="1">
    <thead>
    <tr class="success">
        <th class="sorting_asc">ID</th>
        <th class="sorting_desc">姓名</th>
        <th class="sorting_asc sorting_asc_disabled">年龄</th>
        <th class="sorting_desc sorting_desc_disabled">性别</th>
        <th class="sorting_asc sorting_asc_disabled">电话号码</th>
        <th class="sorting_desc sorting_desc_disabled">家庭住址</th>
        <th class="sorting">操作</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${studentList}" var="student">
        <tr class="active">
            <td>${student.s_id }</td>
            <td>${student.name }</td>
            <td>${student.age }</td>
            <td>${student.sex }</td>
            <td>${student.number }</td>
            <td>${student.address}</td>
            <td class="text-center">
                <a href="${pageContext.request.contextPath}/student/findById?id=${student.s_id}" class="btn bg-olive btn-xs">学生详情</a>
                <a href="${pageContext.request.contextPath}/page/add.jsp"class="btn bg-olive btn-xs">添加学生信息</a>
                <%--<a href="${pageContext.request.contextPath}/WEB-INF/page/add.jsp" class="btn bg-olive btn-xs">添加角色</a>--%>
                <a href="${pageContext.request.contextPath}/student/del?id=${student.s_id}" class="btn bg-olive btn-xs">删除学生信息</a>
                <a href="${pageContext.request.contextPath}/student/findWithUpdate?id=${student.s_id}" class="btn bg-olive btn-xs">修改学生信息</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
