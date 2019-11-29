<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
    <title>学生个人信息详情</title>
</head>
<body>
<h2 >学生信息详情</h2>
<table border="1">
    <thead>
    <tr>
        <th class="sorting_desc">姓名</th>
        <th class="sorting_asc sorting_asc_disabled">年龄</th>
        <th class="sorting_desc sorting_desc_disabled">性别</th>
        <th class="sorting_asc sorting_asc_disabled">电话号码</th>
        <th class="sorting_desc sorting_desc_disabled">家庭住址</th>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td>${studentInfo.name}</td>
            <td>${studentInfo.age}</td>
            <td>${studentInfo.sex}</td>
            <td>${studentInfo.number}</td>
            <td>${studentInfo.address}</td>
        </tr>
    </tbody>
</table>

</body>
</html>
