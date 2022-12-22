<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
	<h1 class="">Welcome to College Student Registration Page</h1>
</div>
<form action="student" method="post">

	<div class="mb-3 row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="text"  id="inputPassword" name="studentName">
    </div>
  </div>
  
   <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="text"  id="staticEmail" name="studentEmail">
    </div>
  </div>
  
  <div style="margin-left: 150px">
		<button type="submit"  class="btn btn-success">Submit</button>
  </div>

</form>
</body>
</html>