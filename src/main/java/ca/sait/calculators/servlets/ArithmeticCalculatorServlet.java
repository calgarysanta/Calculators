package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Calculates arithmetic
 * @author YEON
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // No calculation has been performed
        String message = String.format("---");
        
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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

        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String message = "";
    
        if (firstInput != null & secondInput != null) {
            try {
                int first = Integer.parseInt(firstInput);
                int second = Integer.parseInt(secondInput);
                String calcNum = "";
                
                if (request.getParameter("plus") != null) {
                    calcNum = Integer.toString(first + second);
                } else if (request.getParameter("minus") != null) {
                    calcNum = Integer.toString(first - second);
                } else if (request.getParameter("times") != null) {
                    calcNum = Integer.toString(first * second);
                } else if (request.getParameter("obelus") != null) {
                    calcNum = Double.toString((first * 1.0) / second);
                }
                
                message = String.format("%s", calcNum);

                request.setAttribute("firstInput", firstInput);
                request.setAttribute("secondInput", secondInput);                
                request.setAttribute("message", message);
                
            } catch (NumberFormatException ex) {
                // Inputs invalid value
                message = "invalid";

                request.setAttribute("message", message);
            } 
        } 
        else {
            // Inputs no any value
            message = "invalid";

            request.setAttribute("message", message);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}