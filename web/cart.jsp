<%-- 
    Document   : cart
    Created on : Mar 5, 2022, 7:05:45 PM
    Author     : xplo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Enumeration"%>
<%@page import="projet.Article"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier de ${client.getFirst_name()}</title>
    </head>
    <body>
        <jsp:useBean id="cart" scope="session" type="projet.CartBean"/>
        
        <h1>Voici le contenu de votre panier !</h1>
        
        <table border='2'>
            <th>Article</th><th>Quantité</th><th>Prix</th>
            <%
                
                int total = 0, quantity, items_price;
                Article a;
                String item_name;
                Enumeration enu = cart.getArticles().keys();                
                Iterator<Integer> it = cart.getArticles().values().iterator();                
               
                while (enu.hasMoreElements()){
                    a = (Article) enu.nextElement();
                    item_name = a.getName();
                    quantity = it.next();
                    items_price = a.getPrice()*quantity;
                    total = total + items_price;
            %>      

                <tr>
                    <td><%= item_name %></td>
                    <td><%= quantity %></td>
                    <td><%= items_price %> euros</td>

                </tr>
            <% }
            %>
               
        </table>
        <p>Votre total s'élève à <%= total%> euros</p>
        
        <form action='index.jsp'>
            <input type="submit" value="Retour à l'accueil" />
        </form>
        
        <form action='myServlet'>
            <input type='submit' name='cart' value='Payer'>         
            <input type='hidden' name='form' value='checkout'
        </form>
        
        
    </body>
</html>
