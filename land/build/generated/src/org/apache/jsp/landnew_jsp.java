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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <title>University Landscape - Home</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .flex-container {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu {\n");
      out.write("            display: flex;\n");
      out.write("            flex-grow: 1;\n");
      out.write("            justify-content: center;\n");
      out.write("            background-color: #FF0000;\n");
      out.write("            width: 100%;\n");
      out.write("            padding-left: 350px;\n");
      out.write("            padding-top: 100px;\n");
      out.write("              position: fixed;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul {\n");
      out.write("            list-style: none;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul li {\n");
      out.write("            margin: 0 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul li a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul li a:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .image-container {\n");
      out.write("            margin-right: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .image-container img {\n");
      out.write("            height: 108px;\n");
      out.write("            width: 250px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("             border: 0;\n");
      out.write("        border-radius: 8px;\n");
      out.write("        padding: 20px;\n");
      out.write("        width: 295px;\n");
      out.write("        height: 450px;\n");
      out.write("       \n");
      out.write("        background-color: #fff;\n");
      out.write("        margin: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card h3 {\n");
      out.write("        margin-top: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   \n");
      out.write("    .card p {\n");
      out.write("        margin-bottom: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("      \n");
      out.write("        .logo{\n");
      out.write("            padding-left: 200px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .bimage{\n");
      out.write("            padding-top: 60px;\n");
      out.write("             position: fixed;\n");
      out.write("        }\n");
      out.write("        .all{\n");
      out.write("            padding-top: 700px;\n");
      out.write("        }\n");
      out.write("        .ptag{\n");
      out.write("             \n");
      out.write("            justify-content: space-around;\n");
      out.write("            flex-wrap: wrap-reverse;\n");
      out.write("            background-color: yellow;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

    Class.forName("com.mysql.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/landscape";
    Connection con=DriverManager.getConnection(url,"root","");
    Statement st=con.createStatement();
   String q1="SELECT*FROM events";
   ResultSet rs=st.executeQuery(q1);
   
    
      out.write("\n");
      out.write("  \n");
      out.write("        <div class=\"flex-container\">\n");
      out.write("            \n");
      out.write("            <nav class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"aboutUs.html\">About Us</a></li>\n");
      out.write("                    <li><a href=\"projects.html\">Projects</a></li>\n");
      out.write("                    <li><a href=\"resources.html\">Resources</a></li>\n");
      out.write("                    <li><a href=\"gallery.html\">Gallery</a></li>\n");
      out.write("                    <li><a href=\"contactUs.html\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                <img src=\"image/uj.PNG\" alt=\"University Image\" width=\"130px\" height=\"70px\" style=\" padding-right: 0px; padding-left: 10px;\">\n");
      out.write("           </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"bimage\">\n");
      out.write("    <br><img src=\"image/uj.PNG\" width=\"100%\" height=\"100%\"></div>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("        <div class=\"all\">\n");
      out.write("            <div class=\"ptag\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h1> Welcome to Our University</h1>\n");
      out.write("                <p>This is the home page content.</p>\n");
      out.write("        </div></div><br><br>\n");
      out.write("        <div class=\"news\">\n");
      out.write("            <center>\n");
      out.write("                <h1><b>Uoj Events</b></h1>\n");
      out.write("            <p>What's Happening at Our University</p>\n");
      out.write("        </div></center>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            ");
 
                int d=0;
                int c=0;
                while(rs.next() && c<=4)
                {
            if(c==4)
            {
      out.write("\n");
      out.write("        </tr><tr>\n");
      out.write("           ");
 while(d<=3){
 
      out.write("<td>\n");
      out.write("                  <div class=\"card-container\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            ");
 
                byte[] imageData = rs.getBytes("Image");
                String base64Image = Base64.getEncoder().encodeToString(imageData);
                
                 
      out.write("\n");
      out.write("                 <img src=\"data:image/png;base64,");
      out.print( base64Image );
      out.write("\"  width=\"255px\" height=\"280px\" />\n");
      out.write("            <div class=\"card-body\"><form action=\"landnew.jsp\" method=\"post\">\n");
      out.write("                <h3>");
      out.print(rs.getString("ename") );
      out.write("</h3>\n");
      out.write("                <p class=\"card-text\">");
      out.print(rs.getString("description"));
      out.write("</p>\n");
      out.write("                <h4>Rs:");
      out.print(rs.getString("eid") );
      out.write("</h4>\n");
      out.write("                 <br>\n");
      out.write("                 <center><button style=\" border-radius: 4px; width: 100px; background-color: #cccccc; font-weight: bold; border: 0; \" type=\"submit\" onmousemove=\"this.style.backgroundColor = '#2a38ec'; this.style.color='white';\" onmouseout=\"this.style.backgroundColor = '#cccccc'; this.style.color='black';\">Add to Cart</button></form></center></center> \n");
      out.write("                </form></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("                  \n");
      out.write("              </td> \n");
      out.write("            ");
rs.next();
            d++;}

            break;
            

}
            
      out.write("<td>\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            ");
 
                byte[] image = rs.getBytes("photo");
                String base64 = Base64.getEncoder().encodeToString(image);
                
                 
      out.write("\n");
      out.write("                 <img src=\"data:image/png;base64,");
      out.print( base64 );
      out.write("\"  width=\"255\" height=\"230\" />\n");
      out.write("            <div class=\"card-body\"><form action=\"landnew.jsp\" method=\"post\">\n");
      out.write("                <h3>");
      out.print(rs.getString("ename") );
      out.write("</h3><input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString("ename") );
      out.write("\">\n");
      out.write("                <p class=\"card-text\">");
      out.print(rs.getString("description"));
      out.write("</p><input type=\"hidden\" name=\"des\" value=\"");
      out.print(rs.getString("description") );
      out.write("\">\n");
      out.write("                <h4>");
      out.print(rs.getString("eid") );
      out.write("</h4><input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs.getString("eid") );
      out.write("\">\n");
      out.write("                 <br>\n");
      out.write("                 <center><button style=\" border-radius: 4px; width: 100px; background-color: #cccccc; font-weight: bold; border: 0; \" type=\"submit\" onmousemove=\"this.style.backgroundColor = '#2a38ec'; this.style.color='white';\" onmouseout=\"this.style.backgroundColor = '#cccccc'; this.style.color='black';\">view more</button></form></center></center> \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                  \n");
      out.write("              </td>  ");
 c++;}
            
            
      out.write("\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("        ");
String q2="SELECT*FROM news";
   ResultSet rs1=st.executeQuery(q2);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h1><b>Uoj Events</b></h1>\n");
      out.write("            <p>Forthcoming events at the university</p><br><br>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"news\">\n");
      out.write("            <table>\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            ");
 
                int a=0;
                int b=0;
                while(rs1.next() && b<=4)
                {
            if(b==4)
            {
      out.write("\n");
      out.write("        </tr><tr>\n");
      out.write("           ");
 while(a<=3){
 
      out.write("<td>\n");
      out.write("                  <div class=\"card-container\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            ");
 
                byte[] imageData = rs1.getBytes("Image");
                String base64Image = Base64.getEncoder().encodeToString(imageData);
                
                 
      out.write("\n");
      out.write("                 <img src=\"data:image/png;base64,");
      out.print( base64Image );
      out.write("\"  width=\"255px\" height=\"280px\" />\n");
      out.write("            <div class=\"card-body\"><form action=\"landnew.jsp\" method=\"post\">\n");
      out.write("                <h3>");
      out.print(rs1.getString("nname") );
      out.write("</h3>\n");
      out.write("                <p class=\"card-text\">");
      out.print(rs1.getString("ndis"));
      out.write("</p>\n");
      out.write("                <h4>");
      out.print(rs1.getString("nid") );
      out.write("</h4>\n");
      out.write("                 <br>\n");
      out.write("                 <center><button style=\" border-radius: 4px; width: 100px; background-color: #cccccc; font-weight: bold; border: 0; \" type=\"submit\" onmousemove=\"this.style.backgroundColor = '#2a38ec'; this.style.color='white';\" onmouseout=\"this.style.backgroundColor = '#cccccc'; this.style.color='black';\">view more</button></form></center></center> \n");
      out.write("                </form></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("                  \n");
      out.write("              </td> \n");
      out.write("            ");
rs.next();
            a++;}

            break;
            

}
            
      out.write("<td>\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            ");
 
                byte[] image = rs1.getBytes("photo");
                String base64 = Base64.getEncoder().encodeToString(image);
                
                 
      out.write("\n");
      out.write("                 <img src=\"data:image/png;base64,");
      out.print( base64 );
      out.write("\"  width=\"255\" height=\"230\" />\n");
      out.write("            <div class=\"card-body\"><form action=\"landnew.jsp\" method=\"post\">\n");
      out.write("                <h3>");
      out.print(rs1.getString("nname") );
      out.write("</h3><input type=\"hidden\" name=\"name\" value=\"");
      out.print(rs.getString("ename") );
      out.write("\">\n");
      out.write("                <p class=\"card-text\">");
      out.print(rs1.getString("description"));
      out.write("</p><input type=\"hidden\" name=\"des\" value=\"");
      out.print(rs.getString("description") );
      out.write("\">\n");
      out.write("                <h4>");
      out.print(rs1.getString("nid") );
      out.write("</h4><input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs1.getString("nid") );
      out.write("\">\n");
      out.write("                 <br>\n");
      out.write("                 <center><button style=\" border-radius: 4px; width: 100px; background-color: #cccccc; font-weight: bold; border: 0; \" type=\"submit\" onmousemove=\"this.style.backgroundColor = '#2a38ec'; this.style.color='white';\" onmouseout=\"this.style.backgroundColor = '#cccccc'; this.style.color='black';\">view more</button></form></center></center> \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                  \n");
      out.write("              </td>  ");
 b++;}
            
            
      out.write("\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("      \n");
      out.write("</body>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
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
