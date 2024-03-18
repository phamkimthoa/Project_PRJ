/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;
import model.Email;
import model.EmailUtils;

/**
 *
 * @author Lenovo
 */
public class ForgotPass extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
        try {
            String emailAddress = request.getParameter("email");
         ProductDAO dao = new ProductDAO();
        
            Account account = dao.checkAccountExistByEmail(emailAddress);
            if (account == null) {
                request.setAttribute("error", "Email wrong!");
            } else {
                Email email = new Email();
                email.setFrom("buisyduc2710@gmail.com");
                email.setFromPassword("demdblquwwtzlfsh");
                email.setTo(emailAddress);
                email.setSubject("<FRUITABLE SHOP>QUEN MAT KHAU");
                StringBuilder sb = new StringBuilder();
                sb.append("Xin chào, ").append("<br>");
                sb.append("Mật khẩu của bạn là <b>").append(account.getPassword()).append(" </b> <br>");
                sb.append("Trân trọng,<br>");
                sb.append("Bống Family");
                email.setContent(sb.toString());
             EmailUtils.send(email);
                request.setAttribute("mess", "Mật khẩu đã được gửi đến mail của bạn. Xin vui lòng kiểm tra!");
            }
        } catch (Exception e) {
        }
        request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
    }

    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */


