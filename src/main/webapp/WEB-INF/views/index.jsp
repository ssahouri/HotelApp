<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<h1>Hotel Search</h1>
<form action ="/hotel-listing">
<select name = "city">

<option value="">Show All</option>
  <option value="Detroit">Detroit</option>
    <option value="Grand Rapids">Grand Rapids</option>


</select>
<button type = "submit">Go</button>
</form>
</body>
</html>