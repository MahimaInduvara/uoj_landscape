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

@WebServlet(urlPatterns = {"/updatenews"})
@MultipartConfig 
public class updatenews extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updatenews</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updatenews at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nno = request.getParameter("nidd");
        String up = request.getParameter("update");
        String nname = request.getParameter("nnm");
        String ndate = request.getParameter("nd");
        String ndis = request.getParameter("ndis");
        String nimg = request.getParameter("nm");
        Part nimage = request.getPart("nimage");
        InputStream input = nimage != null ? nimage.getInputStream() : null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/landscape";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();

            if (up.equals("update")) {
                String q1 = "UPDATE news SET nname='" + nname + "', date='" + ndate + "', description='" + ndis + "' WHERE nid='" + nno + "'";
                st.executeUpdate(q1);

                if (nimg.equals("yes") && input != null) {
                    String sql = "UPDATE news SET photo=? WHERE nid='" + nno + "'";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setBlob(1, input);
                    ps.executeUpdate();
                }

                response.sendRedirect("landnew.jsp");
            } else if (up.equals("delete")) {
                String q2 = "DELETE FROM news WHERE nid='" + nno + "'";
                st.executeUpdate(q2);
                response.sendRedirect("news.html");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(updatenews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet for updating news records";
    }
}
