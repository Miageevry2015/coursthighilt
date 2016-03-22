<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>

<title>Inscription eleve </title>
</head>
<body>

<input type="button" value="liste Cours" onclick="self.location.href='http://localhost:8080/test/Eleve/listeCours'"/>
<input type="button" value="espace personnel" onclick="self.location.href='http://localhost:8080/test/Eleve/espace'"/>
<input type="button" value="s'inscire" onclick="self.location.href='http://localhost:8080/test/Eleve/inscrire'"/>
<input type="button" value="liste prof" onclick="self.location.href='http://localhost:8080/test/Eleve/listeProf'"/>
<input type="button" value="acheter credit" onclick="self.location.href='http://localhost:8080/test/Eleve/acheter'"/>
<input type="button" value="message" onclick="self.location.href='http://localhost:8080/test/Eleve/message'"/>
<input type="button" value="Déconnecter" onclick="self.location.href='http://localhost:8080/test/Eleve/deconnecter'"/>
<h1>EleveInscrire</h1>

<div id="formEleve">
<table border=1>
<f:form modelAttribute="Eleve" action="inscrirEleve" method="post">
<tr>
<td>nom :</td>
<td><f:input path="nom"/></td>
<td><f:errors path="nom"></f:errors></td>
</tr>
<tr>
<td>prenom : </td>
<td><f:input path="prenom"/></td>
<td><f:errors path="prenom"></f:errors></td>
</tr>
<tr>
<td>date de naissance  :  </td>
<td><f:input path="dateNaissance"/></td>
<td><f:errors path="dateNaissance"></f:errors></td>
</tr>
<tr>
<td>E mail :  </td>
<td><f:input path="email"/></td>
<td><f:errors path="email"></f:errors></td>
</tr>
<tr>
<td>mot de passe: </td>
<td><f:input path="motDePasse"/></td>
<td><f:errors path="motDePasse"></f:errors></td>
</tr>

<tr>
<td>niveau: </td>
<td><f:select path="niveau">
<f:option value="SIXem"></f:option>
<f:option value="CINQem"></f:option>
<f:option value="QUATREem"></f:option>
<f:option value="TROISem"></f:option>
<f:option value="SECOND"></f:option>
<f:option value="PREMIERE"></f:option>
<f:option value="TERMINAL"></f:option>
<f:option value="BAC1"></f:option>
<f:option value="BAC2"></f:option>
<f:option value="BAC3"></f:option>
<f:option value="BAC4"></f:option>
<f:option value="BAC5"></f:option>
</f:select></td>
<td><f:errors path="niveau"></f:errors></td>
</tr>
<tr>
<td>telephone: </td>
<td><f:input path="telephone"/></td>
<td><f:errors path="telephone"></f:errors></td>
</tr>
<tr><td colspan="2"><input type="submit" value="Enregistrer"/></td></tr>
</f:form>
</table>

</div>
</body>
</html>