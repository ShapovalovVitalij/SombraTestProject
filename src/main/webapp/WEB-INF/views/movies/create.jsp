<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div>
	<h3>Create Movie></h3>
	<form:form method="post" modelAttribute="movieForm">
		<label for="id">Enter id</label>
		<form:input path="id" />
		<label for="title">Enter title</label>
		<form:input path="title" placeholder="title" />
		<label for="director">Enter director</label>
		<form:input path="director" placeholder="director" />
		<div>
			<input type="submit" value="Submit" />
		</div>
	</form:form>
</div>