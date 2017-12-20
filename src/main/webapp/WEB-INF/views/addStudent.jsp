<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" >
</head>
<body>
<form action="save" method="get">
  
	  <div class="form-group">
	      <label for="inputText4">Nom Prenom</label>
	      <input type="text" class="form-control" name="nomPrenom" placeholder="Nom Prenom">
	   </div>
<div class="form-row">
    <div class="	form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="email" name="email" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputTelephone4">Telephone</label>
      <input type="text" class="form-control" id="tel" name="tel" placeholder="Telephone">
    </div>
  </div>
  <div class="form-group">
    <label for="inputDate">Date de naissance</label>
    <input type="text" class="form-control" id="daten" name="daten" placeholder="Date de Naissance">
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" id="adresse" name="adresse" placeholder="Adresse">
  </div>
  <button type="submit" class="btn btn-primary">Ajouter</button>
</form>	 
</body>
</html>