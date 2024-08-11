/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
@WebServlet(urlPatterns = {"/updatevent"})
@MultipartConfig(maxFileSize = 1116177215)
public class updatevent extends HttpServlet  {

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
            out.println("<title>Servlet updatevent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updatevent at " + request.getContextPath() + "</h1>");
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
        
       // processRequest(request, response);
       try {
            //processRequest(request, response);
            String eid=request.getParameter("eeid");
            String ename=request.getParameter("eename");
            String date=request.getParameter("edate");
            String descripsion=request.getParameter("eedis");
            
            
            String cimg=request.getParameter("eem");
            String up=request.getParameter("update");
            
           Part image= request.getPart("eeimage");
            InputStream input = image.getInputStream();
            
            Class.forName("com.mysql.jdbc.Driver");
            String url;
           url = "jdbc:mysql://localhost:3306/landscape";
            Connection con;
           con = DriverManager.getConnection(url, "root", "");
            Statement st=con.createStatement();
            
           if(up.equals("update"))
                {
                    String q1="UPDATE events SET ename='"+ename+"',date='"+date+"',description='"+descripsion+"' WHERE eid='"+eid+"'";
                    st.executeUpdate(q1);
                    
                    if (cimg.equals("yes"))
                    {
                    String sql = "UPDATE events SET Image=? WHERE eid='"+eid+"'";
             
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setBlob(1, input);
            
                    ps.executeUpdate();
                    
                    }
                    response.sendRedirect("event.html");
                }
                else if(up.equals("delete"))
                {
                    String q2="DELETE FROM events WHERE eid='"+eid+"'";
                    st.executeUpdate(q2);
                    response.sendRedirect("event.html");
                }
                
           
            
           
            
        } catch (IOException | ServletException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(siup.class.getName()).log(Level.SEVERE, null, ex);
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
