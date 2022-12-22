<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div style="text-align: center;">
		<h1 class="">Update Student</h1>
	</div>
	<form action="updatestudent" method="post">

		<div class="mb-3 row">
			<label for="inputPassword" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" id="inputPassword" name="studentName" value="">
			</div>
		</div>

		<div class="mb-3 row">
			<label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="text" id="staticEmail" name="studentEmail" value="">
			</div>
		</div>

		<div style="margin-left: 150px">
			<button type="submit" class="btn btn-success">Submit</button>
		</div>

	</form>
</body>
</html>