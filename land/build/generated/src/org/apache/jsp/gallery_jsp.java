package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

    Class.forName("com.mysql.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/landscape";
    Connection con=DriverManager.getConnection(url,"root","");
    Statement st=con.createStatement();
   String q1="SELECT*FROM gallery";
   ResultSet rs1=st.executeQuery(q1);
   

    
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <center><h1><b>Gallery</b></h1></center>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"news\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                ");
 
                int a = 0;
                int b = 0;
                while(rs1.next() && b <= 4) {
                    if (b == 4) {
                        
      out.write("\n");
      out.write("                        </tr><tr>\n");
      out.write("                        ");
 
                        while(a <= 3) { 
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"card-container\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        ");
 
                                            byte[] imageData = rs1.getBytes("GalleryPhoto");
                                            String base64Image = Base64.getEncoder().encodeToString(imageData);
                                        
      out.write("\n");
      out.write("                                        <img src=\"data:image/png;base64,");
      out.print( base64Image );
      out.write("\"  width=\"255px\" height=\"280px\" />\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <h4>");
      out.print( rs1.getString("GalleryID") );
      out.write("</h4>\n");
      out.write("                                            <h3>");
      out.print( rs1.getString("GalleryName") );
      out.write("</h3>\n");
      out.write("                                           \n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </td> \n");
      out.write("                            ");
 
                            rs1.next();
                            a++;
                        }
                        break;
                    } 
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                ");
 
                                    byte[] image = rs1.getBytes("GalleryPhoto");
                                    String base64 = Base64.getEncoder().encodeToString(image);
                                
      out.write("\n");
      out.write("                                <img src=\"data:image/png;base64,");
      out.print( base64 );
      out.write("\"  width=\"255\" height=\"230\" />\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h4>");
      out.print( rs1.getString("GalleryID") );
      out.write("</h4>\n");
      out.write("                                    <h3>");
      out.print( rs1.getString("GalleryName") );
      out.write("</h3>\n");
      out.write("                                    \n");
      out.write("                                    <br>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </td> \n");
      out.write("                    ");
 b++;
                } 
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
