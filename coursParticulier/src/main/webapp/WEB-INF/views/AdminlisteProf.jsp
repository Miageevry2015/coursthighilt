<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<input type="button" value="liste eleves" onclick="self.location.href='http://localhost:8080/test/admin/listeEleve'"/>
<input type="button" value="liste prof" onclick="self.location.href='http://localhost:8080/test/admin/listeProf'"/>
<input type="button" value="Matier" onclick="self.location.href='http://localhost:8080/test/admin/matier'"/>
<input type="button" value="message" onclick="self.location.href='http://localhost:8080/test/admin/message'"/>
<input type="button" value="Déconnecter" onclick="self.location.href='http://localhost:8080/test/admin/deconnecter'"/>


<h1>AdminlisteProf</h1>

<table border=1>
<tr><th> Nom</th><th> prenom</th><th> date de naissance</th><th> e-mail</th><th> telephone</th><th>supp</th></tr>
<c:forEach items="${listeProf}" var="e">
<tr>
<td>${e.getNom()}</td>
<td>${e.prenom}</td>
<td>${e.dateNaissance}</td>
<td>${e.email}</td>
<td>${e.telephone}</td>
<td><input type="button" value="supprimer" onclick="self.location.href='http://localhost:8080/test/admin/sup?id=${e.getIdUtilisateur()}'"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>