<<<<<<< Updated upstream
import java.io.IOException;
import java.io.InputStream;
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

@WebServlet(urlPatterns = {"/updatevent"})
@MultipartConfig(maxFileSize = 1116177215)
public class updatevent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String eno = request.getParameter("eeid");
            String up = request.getParameter("update");
            String ename = request.getParameter("eename");
            String edis = request.getParameter("eedis");
            String edate = request.getParameter("edate");
            String eimg = request.getParameter("eem");
            Part eimage = request.getPart("eeimage");
            InputStream input = eimage.getInputStream();
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(updatevent.class.getName()).log(Level.SEVERE, null, ex);
            }
            String url = "jdbc:mysql://localhost:3306/landscape";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();
            
            if (up.equals("update")) {
                String q1 = "UPDATE events SET ename='" + ename + "', Description='" + edis + "', date='" + edate + "' WHERE eid='" + eno + "'";
                st.executeUpdate(q1);

                if (eimg.equals("yes")) {
                    String sql = "UPDATE events SET photo=? WHERE eid='" + eno + "'";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setBlob(1, input);
                    ps.executeUpdate();
                }

                response.sendRedirect("landnew.jsp");
            } else if (up.equals("delete")) {
                String q2 = "DELETE FROM events WHERE eid='" + eno + "'";
                st.executeUpdate(q2);
                response.sendRedirect("event.html");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(updatevent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
=======
import java.io.IOException;
import java.io.InputStream;
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

@WebServlet(urlPatterns = {"/updatevent"})
@MultipartConfig(maxFileSize = 1116177215)
public class updatevent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String eno = request.getParameter("eeid");
            String up = request.getParameter("update");
            String ename = request.getParameter("eename");
            String edis = request.getParameter("eedis");
            String edate = request.getParameter("edate");
            String eimg = request.getParameter("eem");
            Part eimage = request.getPart("eeimage");
            InputStream input = eimage.getInputStream();
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(updatevent.class.getName()).log(Level.SEVERE, null, ex);
            }
            String url = "jdbc:mysql://localhost:3306/landscape";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();
            
            if (up.equals("update")) {
                String q1 = "UPDATE events SET ename='" + ename + "', Description='" + edis + "', date='" + edate + "' WHERE eid='" + eno + "'";
                st.executeUpdate(q1);

                if (eimg.equals("yes")) {
                    String sql = "UPDATE events SET photo=? WHERE eid='" + eno + "'";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setBlob(1, input);
                    ps.executeUpdate();
                }

                response.sendRedirect("landnew.jsp");
            } else if (up.equals("delete")) {
                String q2 = "DELETE FROM events WHERE eid='" + eno + "'";
                st.executeUpdate(q2);
                response.sendRedirect("event.html");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(updatevent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
>>>>>>> Stashed changes
