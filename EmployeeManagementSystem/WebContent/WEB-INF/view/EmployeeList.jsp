<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE>
<html>
<head>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/Resources/CSS/style.css"/>




</head>
<body>
<div id="header1">
	<div id="header2">
	<h2>Employee Management System</h2>
	</div>
</div>

<div id="container1">
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Contact Number</th>
			<th>Department</th>
			<th>Operation</th>
		</tr>
		
				<c:forEach var="tempEmployee" items="${employees}">
				
				<c:url var="updateLink" value="/EmployeeUpdateForm">
				<c:param name="employeeId" value="${tempEmployee.id}"/>
				</c:url>
				
				<c:url var="deleteLink" value= "/EmployeeDeleteForm">
				<c:param name="employeeId" value="${tempEmployee.id }"/>
				</c:url>
				
				<tr>
				<td> ${tempEmployee.firstName} </td>
				<td> ${tempEmployee.lastName} </td>
				<td> ${tempEmployee.emailId} </td>
				<td> ${tempEmployee.contactNumber} </td>
				<td> ${tempEmployee.department} </td>
				<td>
				<input type="button" value="Update" onclick="window.location.href='${updateLink}'; return false;" class="updatebuttoncss"/>
				<input type="button" value="Delete" onclick="window.location.href='${deleteLink}'; return false;" class="deletebuttoncss"/>
				
				</td>	
			</tr>	
		
				</c:forEach>
							
			</table>
		</div>
		
		<br>
		<br>
	
	<input type ="button" value = "Employee Add" onclick = "window.location.href='EmployeeAdditionForm'; return false;" class="addbuttoncss"/>	
</body>
</html>