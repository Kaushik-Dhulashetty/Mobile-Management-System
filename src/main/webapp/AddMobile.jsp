<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="AddMobile.css">
<link
	href="https://fonts.googleapis.com/css2?family=Lobster&family=Roboto:wght@400;700&display=swap"
	rel="stylesheet">
<title>Add Mobile Details</title>
</head>
<body>	
	<form action="AddMobileServlet">
	<h1>Enter Mobile Details</h1>
		    <label for="mobileId">Mobile Id</label>
		    <input type="number"id="mobileId" placeholder="Enter the Mobile Id" name="mobileId">

		    <label for="mobileModel">Mobile Model</label>
            <input type="text"id="mobileModel" placeholder="Enter the Mobile Model"
			name="mobileModel"> 
			
			<label for="mobileBrand">Mobile Brand</label>
		    <input type="text" id="mobileBrand"placeholder="Enter the Mobile Brand" name="mobileBrand"> 
			
			<label for="mobileRom">ROM</label> 
			<input type="text" id="mobileRom"placeholder="Enter the ROM" name="mobileRom"> 
			
			<label for="mobileRam">RAM</label> 
			<input type="text" id="mobileRam"placeholder="Enter the RAM" name="mobileRam"> 
			
			<label for="mobilePrice">Price</label> 
			<input type="text" id="mobilePrice"placeholder="Enter the Price" name="mobilePrice"> 
			
			<input type="submit" value="Add">
</body>
</html>