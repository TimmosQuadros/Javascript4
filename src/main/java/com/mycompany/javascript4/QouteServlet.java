/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javascript4;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TimmosQuadros
 */
public class QouteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        ArrayList<String> qoutes = new ArrayList<>();
        qoutes.add("Luke i'm your father");
        qoutes.add("Don't cry because it's over, smile because it happened.");
        qoutes.add("Be yourself; everyone else is already taken.");
        qoutes.add("Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.");
        qoutes.add("Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.");
        qoutes.add("A room without books is like a body without a soul.");
        qoutes.add("You know you're in love when you can't fall asleep because reality is finally better than your dreams.");
        qoutes.add("You only live once, but if you do it right, once is enough.");
        qoutes.add("Be the change that you wish to see in the world.");
        qoutes.add("If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.");
        qoutes.add("Friendship ... is born at the moment when one man says to another \"What! You too? I thought that no one but myself . . .");
        qoutes.add("No one can make you feel inferior without your consent.");
        qoutes.add("If you tell the truth, you don't have to remember anything.");
        qoutes.add("A friend is someone who knows all about you and still loves you.");
        qoutes.add("Always forgive your enemies; nothing annoys them so much.");
        
        int index = (int) (Math.random() * qoutes.size());
        
        String result = qoutes.get(index);
        
        // create the gson object
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        Gson gson = new Gson();
//        response.getWriter().write(gson.toJson(result));
        // use the gson objected created to convert albums to json
        // representation
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(result);
        }
        //System.out.println(gson.toJson(qoutes));
        
         
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
    }

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
        processRequest(request, response);
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

    private void forward(HttpServletRequest req, HttpServletResponse res, String path) throws IOException, ServletException {
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(path);
		rd.forward(req, res);
	}
}
