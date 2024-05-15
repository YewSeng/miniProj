<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.caltech.pojo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> list=(List<Employee>)request.getAttribute("list");  %>
<table border="1">
<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Phono</th></tr>
<%for(Employee ss:list){ %>
<tr><td><%=ss.getEmpno() %></td><td><%=ss.getEmpname() %></td><td><%=ss.getPhono() %></td></tr>
<%} %>
</table>
</body>
</html>
