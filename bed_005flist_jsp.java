package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class bed_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    \n");
      out.write("        <html>\n");
      out.write("\n");
      out.write("        <head>\n");
      out.write("            <style>\n");
      out.write("                nav{\n");
      out.write("                    background: linear-gradient(120deg,#00467F, #A5CC82);\n");
      out.write("                }\n");
      out.write("                .btn{\n");
      out.write("                    background: linear-gradient(120deg,#00467F, #A5CC82);\n");
      out.write("                }\n");
      out.write("                .rtd{\n");
      out.write("                    background: red;\n");
      out.write("                }\n");
      out.write("                .gtd{\n");
      out.write("                    background: green;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <title>Bed Management</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <nav class=\"navbar navbar-expand-md navbar-dark\" >\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" class=\"navbar-brand\"> Bed\n");
      out.write("     Management </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- <div class=\"alert alert-success\" *ngIf='message'>{{message}}</div> -->\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h3 class=\"text-center\"><a href=\"wardenindex.jsp\">List of Beds</a>List of Beds</h3>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"container text-left\">\n");
      out.write("\n");
      out.write("                        <a href=\"managebed.jsp\" id=\"btn\" class=\"btn btn-success\" >Add\n");
      out.write("     New Bed</a>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Hostel Name</th>\n");
      out.write("                                <th>Room No</th>\n");
      out.write("                                <th>Bed No</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                                <th>  </th>\n");
      out.write("                                ");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");

          try{
              Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?useSSL=false&allowPublicKeyRetrieval=true" , "root","admin");
              Statement pst = conn.createStatement();
              String str="Select * from bedetails ";
              ResultSet rs = pst.executeQuery(str);
              String class_name="";
              System.out.println(class_name);
              while(rs.next())
              {
                 
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                 <td>");
      out.print(rs.getString("HostelName"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("RoomNo"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("BedNo"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("BedStatus"));
      out.write("</td>\n");
      out.write("                 \n");
      out.write("                 <td ");
out.print("class="+class_name);
      out.write(" ></td>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 ");

                     Statement pst1 = conn.createStatement();
                     String qry="Select BedStatus from hms_db.bedetails";
                     ResultSet rs1 = pst1.executeQuery(qry);
                     while(rs1.next())
                     {
                         String status=new String(rs1.getString("BedStatus"));
                         System.out.println(status);
                         if(status=="Yes")
                         {
                             class_name="rtd";
                 
      out.write("\n");
      out.write("                             \n");
      out.write("                         ");
    
                         }
                         else
                         {
                            class_name="gtd";
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            ");

                         }
                         
                         
                         
                     }
                    
                          
      out.write("\n");
      out.write("                          \n");
      out.write("                          ");

                     
                        
                     
                 
      out.write("\n");
      out.write("                 ");
      out.write("\n");
      out.write("                 </tr>\n");
      out.write("                 ");
}
          }
          catch(Exception e){
          }
        
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("     \n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("        </html>\n");
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