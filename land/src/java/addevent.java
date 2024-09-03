<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/addevent"})
@MultipartConfig
public class addevent extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addevent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addevent at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        try {
            try {
                //processRequest(request, response);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(addevent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String id=request.getParameter("eid");
            String name=request.getParameter("ename");
            String date=request.getParameter("date");
            String descripsion=request.getParameter("edis");
            Part image= request.getPart("eimage");
            InputStream input = image.getInputStream();
            
            String url="jdbc:mysql://localhost:3306/landscape";
            Connection con=(Connection) DriverManager.getConnection(url,"root","");
            Statement st;
            st = (Statement) con.createStatement();
            
            String q;
            q = "INSERT INTO events VALUES('"+id+"','"+name+"','"+date+"','"+descripsion+"',?)";
           
            PreparedStatement ps = con.prepareStatement(q);
            ps.setBlob(1, input);
            ps.executeUpdate();
            response.sendRedirect("landnew.jsp");
           
            
        } catch (SQLException ex) {
            Logger.getLogger(addevent.class.getName()).log(Level.SEVERE, null, ex);
        }
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

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/addevent"})
@MultipartConfig
public class addevent extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addevent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addevent at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        try {
            try {
                //processRequest(request, response);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(addevent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String id=request.getParameter("eid");
            String name=request.getParameter("ename");
            String date=request.getParameter("date");
            String descripsion=request.getParameter("edis");
            Part image= request.getPart("eimage");
            InputStream input = image.getInputStream();
            
            String url="jdbc:mysql://localhost:3306/landscape";
            Connection con=(Connection) DriverManager.getConnection(url,"root","");
            Statement st;
            st = (Statement) con.createStatement();
            
            String q;
            q = "INSERT INTO events VALUES('"+id+"','"+name+"','"+date+"','"+descripsion+"',?)";
           
            PreparedStatement ps = con.prepareStatement(q);
            ps.setBlob(1, input);
            ps.executeUpdate();
            response.sendRedirect("landnew.jsp");
           
            
        } catch (SQLException ex) {
            Logger.getLogger(addevent.class.getName()).log(Level.SEVERE, null, ex);
        }
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

>>>>>>> Stashed changes
