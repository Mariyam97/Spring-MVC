<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Confirmation</title>
</head>
<body>


	The registration of employee is confirmed : ${employeeModel.firstName}
	${employeeModel.lastName}
	<br>
	<br> 
	The Department assigned is : ${employeeModel.department}
	<br>
	<br>
	The Technologies that employee knows : 
	<ul>
	<c:forEach var="temp" items="${employeeModel.technologies}">
	<li>${temp}</li>
	</c:forEach>
	</ul>

</body>
</html>