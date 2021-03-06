/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author xplo
 */
public class myServlet extends HttpServlet {

  

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String form = request.getParameter("form");
        String article = request.getParameter("article");
        HttpSession session = request.getSession();
        
        if (form != null){
            if (form.equals("login")){
            //Session bean creation
            ClientBean client = new ClientBean();
            CartBean articles = new CartBean();
            
            client.setFirst_name(request.getParameter("first_name"));
            client.setName(request.getParameter("name"));
            client.setMail(request.getParameter("client"));
            client.setPhoneNumber(request.getParameter("telephone"));
            client.setRegister(Boolean.TRUE);
            
            session.setAttribute("client", client);
            session.setAttribute("cart", articles);
            
            RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
            disp.forward(request, response);
            }
            
            if (form.equals("checkout")){
                RequestDispatcher disp = request.getRequestDispatcher("checkout.jsp");
                disp.forward(request, response);
            }
        
        }
        else if (article != null){
            
            CartBean articles = (CartBean) session.getAttribute("cart");
            String str_price = request.getParameter("price");
            int price = (int) Integer.parseInt(str_price);
            Article a = new Article();
            
            a.setName(article);
            a.setPrice(price);
            articles.addArticle(a);
            
            RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
            disp.forward(request, response);
            }
    }
        

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
