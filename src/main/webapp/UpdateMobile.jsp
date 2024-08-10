<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.hibernate_servlet.entity.Mobile"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="UpdateMobile.css">
<title>Update Mobile Details</title>
</head>
<body>
<% Mobile mobile = (Mobile) request.getAttribute("mobile"); %>

<form action="SaveUpdatedDetails" method="post">

<!-- Labels for input fields -->
<label for="mobileId">Mobile ID:</label>
<input type="number" value="<%=mobile.getMobileId() %>" name="mobileId" readonly><br>

<label for="mobileModel">Mobile Model:</label>
<input type="text" value="<%=mobile.getMobileModel() %>" name="mobileModel"><br>

<label for="mobileBrand">Mobile Brand:</label>
<input type="text" value="<%=mobile.getMobileBrand() %>" name="mobileBrand"><br>

<label for="mobileRom">ROM:</label>
<input type="text" value="<%=mobile.getRom()%>" name="mobileRom"><br>

<label for="mobileRam">RAM:</label>
<input type="text" value="<%=mobile.getRam() %>" name="mobileRam"><br>

<label for="mobilePrice">Mobile Price:</label>
<input type="text" value="<%=mobile.getMobilePrice() %>" name="mobilePrice"><br>

<input type="submit" value="Update">
</form>
</body>
</html>