
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Student Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
h2 {
margin-top:165px;
margin-left:120px;
}
form{
margin-top:165px;
margin-bottom:130px;
margin-left:425px;
margin-right:425px;
 
}
</style>
</head>
<body>

<form action="../student/delete" method="post">
<div class="form-group">
	<h2>DELETE STUDENT</h2>

    <label for="id">Student Id:</label>

				<input style="width: 450px" placeholder="Enter the Student Id" type="number"
					class="form-control" size="20" name="id">
			</div>
			<div class="form-group">

    
			<input  style="font-size:20px" type="submit" class="btn btn-success btn-sm" value="Delete">

		</form>
</body>
</html>