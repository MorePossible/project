<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PJY
  Date: 2020/5/22
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
    <script src="webjars/jquery/3.3.1-2/jquery.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".del".click(function () {
                var href = $(this).attr('href');
                $("form").attr("action",href).submit();
                return false;
            }))
        })
    </script>
</head>
<body>
    <form action="" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
    <h1 align="center">员工信息列表</h1>
    <table align="center" width="70%" border="1px" cellspacing="0">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>邮箱</th>
            <th>性别</th>
            <th>部门</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${emps}" var="emp">
            <tr align="center">
                <td>${emp.id}</td>
                <td>${emp.lastName}</td>
                <td>${emp.email}</td>
                <td>${emp.gender==0?'女':'男'}</td>
                <td>${emp.department.deptName}</td>
                <td>
                    <a href="#">编辑</a>
                    <a class="_del" href="delete/${emp.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <h2 align="center">
        <a href="add">添加</a>
    </h2>
</body>
</html>
