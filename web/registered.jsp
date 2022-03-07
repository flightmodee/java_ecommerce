<%-- 
    Document   : registered.jsp
    Created on : Mar 5, 2022, 4:52:28 PM
    Author     : xplo
--%>

<jsp:useBean id="client" class="projet.ClientBean" scope="session"/>

<% 
    if (client.isRegistered()){
        %><jsp:forward page="index.jsp"/><%
    }


    else{
        %><jsp:forward page="login.jsp"/><%
    }
%>
        
