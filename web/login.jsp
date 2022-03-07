<%-- 
    Document   : login
    Created on : Mar 5, 2022, 4:58:47 PM
    Author     : xplo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion à ESIEe-commerce</title>
    </head>
    <body>
    <jsp:useBean id="client" class="projet.ClientBean" scope="session"/>
    <% 
        if (client.isRegistered()){
            %><jsp:forward page="index.jsp"/><%
        }
    %>
        <h1>Bienvenue sur votre site e-commerce ! Connectez-vous</h1>
        <hr/>
        
        <form action='myServlet' method='GET'>
            
            <label for='first_name'>Prénom:<label/>
            <input type='text' name='first_name'/> <br/>
            <label for='name'>Nom:<label/>
            <input type='text' name='name'/> <br/>
            <label for='telephone'>Numéro de téléphone<label/>
            <input type='text' name='telephone'/> <br/>
            <label for='mail'>Mail</label>
            <input type='text' name='mail'><br/>
            
            <input type='submit' value='Valider'/>
            <input type='hidden' name='form' value='login'/>
            

        </form>
        

        
        
    </body>
</html>

