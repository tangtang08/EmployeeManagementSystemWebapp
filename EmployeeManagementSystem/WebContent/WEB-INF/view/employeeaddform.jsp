<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/Resources/CSS/style.css"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/Resources/CSS/employeeadd.css"/>


</head>

<body>
<div id="header1">
<div id="header2">
	<h3> Employee Management System</h3>
</div>
</div>

<div id="container1">
	<h3> Employee Addition Form </h3>
	
	<form:form action="saveEmployee" modelAttribute="employee" method="POST">
	<form:hidden path="id" />
	<table>
		<tbody>
			<tr>
			<td><label>First Name: </label>   </td>
			<td><form:input path= "firstName"/>  </td>
			</tr>
			
			<tr>
			<td><label>Last Name: </label>   </td>
			<td><form:input path= "lastName"/>  </td>
			</tr>
		
		<tr>
			<td><label>Email Id</label>   </td>
			<td><form:input path= "emailId"/>  </td>
			</tr>
		</tbody>
		
		<tr>
			<td><label>Department </label>  </td>
			<td><form:input path= "department"/>  </td>
			</tr>
		</tbody>
	
		<tr>
			<td><label>Contact</label>   </td>
			<td><form:input path= "contactNumber"/>  </td>
			</tr>
			
		<tr>
			<td><input type ="submit" value="Save"  class="save"/> <input type="button" value="back" class="save"  onclick= "window.location.href='list' return false;" /></td>
		</tr>
		</tbody>
	
	</table>
	
	</form:form>
	</div>
	</body>
	
</html>