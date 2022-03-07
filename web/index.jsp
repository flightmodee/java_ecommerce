<%-- 
    Document   : index
    Created on : Mar 5, 2022, 5:18:54 PM
    Author     : xplo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bonjour à vous, ${client.getFirst_name()}, et bienvenue chez ESIEEcommerce !</h1>
        <form action='cart.jsp' method="POST">
            <input type='submit' value='Afficher le panier'>
        </form>
        <hr/>
        
        <div class="container">
            <div class="article" id='banana'>
                
                <form action='myServlet' method="POST">
                    <p>Banane</p>
                    <input type='submit' value='Ajouter au panier'/>
                    <input type='hidden' name='article' value='Banane'/>
                    <input type='hidden' name='price' value="2"/>

                </form>
            </div>
            
            <div class="article" id="apple"> 
                <form action='myServlet' method="POST">
                    <p>Pomme</p>
                    <input type='submit' value='Ajouter au panier'/>
                    <input type='hidden' name='article' value='Pomme'/>
                    <input type="hidden" name='price' value="3"/>
                </form>
            </div>
            
            <div class="article" id='strawberries'>
                <form action='myServlet' method="POST">
                    <p>Fraise</p>
                    <input type='submit' value='Ajouter au panier'/>
                    <input type='hidden' name='article' value='Fraise'/>
                    <input type='hidden' name='price' value="10"/>
                </form>
            </div>
        </div>
    </body>
</html>
