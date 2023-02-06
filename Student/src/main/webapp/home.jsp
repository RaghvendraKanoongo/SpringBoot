<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Insert
<form action="addStudent">
<input type = "text" name = "roll"> <br>
<input type = "text" name = "name"><br>
<input type = "submit"><br>

<br><br><br>

Find
 <form action="getStudent">
<input type = "text" name = "roll"> <br>
<input type = "submit"><br>  
</form>

Delete
<form action = "deleteStudent">
<input type = "text" name = "roll"> <br>
<input type = "submit"><br>  
</form>
</body>
</html>