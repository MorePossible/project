<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PJY
  Date: 2020/5/24
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8"%>
<%request.setCharacterEncoding("utf-8");%>
<html>
<head>
    <title>ADD PAGE</title>
</head>
<body>
    <h1>注册信息</h1>
    <form:form action="addEmp" method="post" modelAttribute="employee">
        姓名：<form:input path="lastName"/><br>
        邮箱：<form:input path="email"/><br>
        性别：<form:radiobuttons path="gender" items="${genders}"/><br>
        部门：<form:select path="department.id" items="${depts}" itemLabel="deptName" itemValue="id"/><br>
        <input type="submit" value="add">
    </form:form>
</body>
</html>
