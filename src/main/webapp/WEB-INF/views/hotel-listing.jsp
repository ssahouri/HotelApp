<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotels</title>
</head>
<body>
	<table>
			<thead class="thead-dark">
				<tr>
					<th scope="col">Name</th>
					<th scope="col">City</th>
					<th scope="col">Price Per Night</th>
				
				</tr>
			</thead>
			<tr>
			</tr>
			<c:forEach var="h" items="${ hotels }">
				<tr>
				
					<td>${h.name }</td>
					<td>${ h.city}</td>
					<td>${ h.pricePerNight}</td>
				
				</tr>
			</c:forEach>
		</table>
<a href="/">Go back</a>
</body>
</html>