<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@ page import="com.jsp.hibernate_servlet.entity.Mobile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="DisplayAllMobile.css">
<title> All Mobiles Details</title>
</head>
<body>
	<h1 style="font-size: 40px; color: red">All Mobile Details!!</h1>

	<%
	List<Mobile> mobiles = (List<Mobile>) request.getAttribute("mobile");
	%>
	<table border="">
		<thead>
			<tr>
				<th>ID</th>
				<th>Model</th>
				<th>Brand</th>
				<th>Rom</th>
				<th>Ram</th>
				<th>Price</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>

			<%
			for (Mobile mobile : mobiles) {
			%>
			<tr>
				<td><%=mobile.getMobileId()%></td>
				<td><%=mobile.getMobileModel()%></td>
				<td><%=mobile.getMobileBrand()%></td>
				<td><%=mobile.getRom()%></td>
				<td><%=mobile.getRam()%></td>
				<td><%=mobile.getMobilePrice()%></td>

				<td><a href="UpdateMobile?mobileId=<%=mobile.getMobileId()%>">UPDATE</a></td>
				<td><a href="DeleteMobile?mobileId=<%=mobile.getMobileId()%>">DELETE</a></td>

			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<h1>
		<a href="index.jsp">Go Back To Dashboard</a>
	</h1>
</body>
</html>