package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class landnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <title>University Landscape - Home</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .flex-container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-grow: 1;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            background-color: #FF0000;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding-left: 350px;\r\n");
      out.write("            padding-top: 100px;\r\n");
      out.write("              position: fixed;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu ul {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu ul li {\r\n");
      out.write("            margin: 0 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu ul li a {\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu ul li a:hover {\r\n");
      out.write("            background-color: #555;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .image-container {\r\n");
      out.write("            margin-right: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .image-container img {\r\n");
      out.write("            height: 108px;\r\n");
      out.write("            width: 250px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .content {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        .card {\r\n");
      out.write("             border: 0;\r\n");
      out.write("        border-radius: 8px;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        width: 295px;\r\n");
      out.write("        height: 450px;\r\n");
      out.write("       \r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        margin: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .card h3 {\r\n");
      out.write("        margin-top: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    .card p {\r\n");
      out.write("        margin-bottom: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        .logo{\r\n");
      out.write("            padding-left: 200px;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        .bimage{\r\n");
      out.write("            padding-top: 60px;\r\n");
      out.write("             position: fixed;\r\n");
      out.write("        }\r\n");
      out.write("        .all{\r\n");
      out.write("            padding-top: 700px;\r\n");
      out.write("        }\r\n");
      out.write("        .ptag{\r\n");
      out.write("             \r\n");
      out.write("            justify-content: space-around;\r\n");
      out.write("            flex-wrap: wrap-reverse;\r\n");
      out.write("            background-color: yellow;\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

    Class.forName("com.mysql.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/landscape";
    Connection con=DriverManager.getConnection(url,"root","");
    Statement st=con.createStatement();
   String q1="SELECT*FROM events";
   ResultSet rs=st.executeQuery(q1);
   
    
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        <div class=\"flex-container\">\r\n");
      out.write("            \r\n");
      out.write("            <nav class=\"menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"landnew.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"aboutUs.html\">About Us</a></li>\r\n");
      out.write("                    <li><a href=\"projects.html\">Projects</a></li>\r\n");
      out.write("                    <li><a href=\"resources.html\">Resources</a></li>\r\n");
      out.write("                    <li><a href=\"gallery.jsp\">Gallery</a></li>\r\n");
      out.write("                    <li><a href=\"contactUs.html\">Contact Us</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                <img src=\"image/uoj.jpg\" alt=\"University Image\" width=\"130px\" height=\"70px\" style=\" padding-right: 0px; padding-left: 10px;\">\r\n");
      out.write("           </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"bimage\">\r\n");
      out.write("    <br><img src=\"image/\" width=\"100%\" height=\"100%\"></div>\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("        <div class=\"all\">\r\n");
      out.write("            <div class=\"ptag\">\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <h1> Welcome to Our University</h1>\r\n");
      out.write("                <p>This is the home page content.</p>\r\n");
      out.write("        </div></div><br><br>\r\n");
      out.write("        <div class=\"news\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <h1><b>Uoj Events</b></h1>\r\n");
      out.write("            <p>What's Happening at Our University</p>\r\n");
      out.write("        </div></center>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            \r\n");
      out.write("            <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            \r\n");
      out.write("            ");
 
                int d=0;
                int c=0;
                while(rs.next() && c<=4)
                {
            if(c==4)
            {
      out.write("\r\n");
      out.write("        </tr><tr>\r\n");
      out.write("           ");
 while(d<=3){
 
      out.write("<td>\r\n");
      out.write("                  <div class=\"card-container\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            ");
 
                byte[] imageData = rs.getBytes("Image");
                String base64Image = Base64.getEncoder().encodeToString(imageData);
                
                 
      out.write("\r\n");
      out.write("                 <img src=\"data:image/png;base64,");
      out.print( base64Image );
      out.write("\"  width=\"255px\" height=\"280px\" />\r\n");
      out.write("            <div class=\"card-body\"><form action=\"landnew.jsp\" method=\"post\">\r\n");
      out.write("                <h3>");
      out.print(rs.getString("ename") );
      out.write("</h3>\r\n");
      out.write("                <p class=\"card-text\">");
      out.print(rs.getString("description"));
      out.write("</p>\r\n");
      out.write("                <h4>");
      out.print(rs.getString("eid") );
      out.write("</h4>\r\n");
      out.write("                 <br>\r\n");
      out.write("                 </form>\r\n");
      out.write("                </form></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("                  \r\n");
      out.write("              </td> \r\n");
      out.write("            ");
rs.next();
            d++;}

            break;
            

}
            
      out.write("<td>\r\n");
      out.write("                  <div class=\"col-md-4\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            ");
 
                byte[] image = rs.getBytes("photo");
                String base64 = Base64.getEncoder().encodeToString(image);
                
                 
      out.write("\r\n");
      out.write("                 <img src=\"data:image/png;base64,");
      out.print( base64 );
      out.write("\"  width=\"255\" height=\"230\" />\r\n");
      out.write("            <div class=\"card-body\"><form action=\"landnew.jsp\" method=\"post\">\r\n");
      out.write("                    <h4>");
      out.print(rs.getString("eid") );
      out.write("</h4><input type=\"hidden\" name=\"eid\" value=\"");
      out.print(rs.getString("eid") );
      out.write("\">\r\n");
      out.write("                <h3>");
      out.print(rs.getString("ename") );
      out.write("</h3><input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString("ename") );
      out.write("\">\r\n");
      out.write("                <p class=\"card-text\">");
      out.print(rs.getString("description"));
      out.write("</p><input type=\"hidden\" name=\"des\" value=\"");
      out.print(rs.getString("description") );
      out.write("\">\r\n");
      out.write("                \r\n");
      out.write("                 <br>\r\n");
      out.write("                 </form>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("                  \r\n");
      out.write("              </td>  ");
 c++;}
            
            
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <br><br>\r\n");
      out.write("        ");

            Statement st1=con.createStatement();
            
            String q2="SELECT*FROM news";
   ResultSet rs1=st1.executeQuery(q2);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       <div class=\"content\">\r\n");
      out.write("    <h1><b>Uoj News</b></h1>\r\n");
      out.write("    <p>Forthcoming news at the university</p><br><br>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"news\">\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            ");
 
            int a = 0;
            int b = 0;
            while(rs1.next() && b <= 4) {
                if (b == 4) {
                    
      out.write("\r\n");
      out.write("                    </tr><tr>\r\n");
      out.write("                    ");
 
                    while(a <= 3) { 
      out.write("\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <div class=\"card-container\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    ");
 
                                        byte[] imageData = rs1.getBytes("Image");
                                        String base64Image = Base64.getEncoder().encodeToString(imageData);
                                    
      out.write("\r\n");
      out.write("                                    <img src=\"data:image/png;base64,");
      out.print( base64Image );
      out.write("\"  width=\"255px\" height=\"280px\" />\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <h4>");
      out.print( rs1.getString("nid") );
      out.write("</h4>\r\n");
      out.write("                                        <h3>");
      out.print( rs1.getString("nname") );
      out.write("</h3>\r\n");
      out.write("                                        <p class=\"card-text\">");
      out.print( rs1.getString("description") );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td> \r\n");
      out.write("                        ");
 
                        rs1.next();
                        a++;
                    }
                    break;
                } 
      out.write("\r\n");
      out.write("                <td>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            ");
 
                                byte[] image = rs1.getBytes("photo");
                                String base64 = Base64.getEncoder().encodeToString(image);
                            
      out.write("\r\n");
      out.write("                            <img src=\"data:image/png;base64,");
      out.print( base64 );
      out.write("\"  width=\"255\" height=\"230\" />\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h4>");
      out.print( rs1.getString("nid") );
      out.write("</h4>\r\n");
      out.write("                                <h3>");
      out.print( rs1.getString("nname") );
      out.write("</h3>\r\n");
      out.write("                                <p class=\"card-text\">");
      out.print( rs1.getString("description") );
      out.write("</p>\r\n");
      out.write("                                <br>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td> \r\n");
      out.write("                ");
 b++;
            } 
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</html>\r\n");
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
