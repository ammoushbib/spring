<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page isELIgnored="false" %>  

<html>
<head>
<title>Liste Des Etudiants</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" >

</head>
<body>
<div class="container2">
	<div class="row">
    	<div class="col-sm-8"><h1>Liste Des Etudiants:</h1></div>
    	<div class="col-sm-4"><a class="btn btn btn-outline-dark" href="http://localhost:8080/DSISpringMVCDemo/app/student/ajouter" role="button">Ajouter un Etudiant</a>	
       </div>
    </div>
</div>
<table class="table table-striped">
	<thead class="thead-dark">
		<tr	>
			<th scope="col">ID</th>
			<th scope="col">Nom Prenom</th>
			<th scope="col">Date Naissance</th>
			<th scope="col">Adresse</th>
			<th scope="col">Email</th>
			<th scope="col">Telephone</th>
			<th scope="col">Modifier</th>
			<th scope="col">Supprimer</th>
		</tr>
	</thead>
	<c:forEach items="${std}" var="s">
	
	<tr>
		<th scope="row">${s.idEtud}</td>
		<td>${s.nomPrenom}</td>
		<td>${s.daten}</td>
		<td>${s.adresse}</td>
		<td>${s.email}</td>
		<td>${s.tel}</td>
		<td>
			<div class="col-sm-4"><a class="btn btn btn-outline-dark" href="http://localhost:8080/DSISpringMVCDemo/app/student/edit?idEtud=${s.idEtud}" role="button">Modifier</a>
		</td>
		<td>
			<div class="col-sm-4"><a class="btn btn btn-outline-dark" href="http://localhost:8080/DSISpringMVCDemo/app/student/delete?idEtud=${s.idEtud}" role="button">Supprimer</a>
		</td>
	</tr>
	</c:forEach> 
</table>
<nav aria-label="Page navigation example">
	<ul class="pagination justify-content-center">
		<c:forEach items="${pages}" varStatus="loop">
		<li class="nav-item">
			<a class="nav-link" href="http://localhost:8080/DSISpringMVCDemo/app/student/page?page=${loop.index}">
			${loop.index+1}
			</a>
		</li>
		</c:forEach>
	</ul>
</nav>
</body>
</html>