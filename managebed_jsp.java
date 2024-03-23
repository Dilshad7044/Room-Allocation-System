package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managebed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("     <script type=\"text/javascript\">\n");
      out.write("       function back(){\n");
      out.write("         window.location.href =\"bed_list.jsp\";\n");
      out.write("       }\n");
      out.write("       function register(){\n");
      out.write("         window.location.href =\"signin.jsp\";\n");
      out.write("       }\n");
      out.write("     </script>\n");
      out.write("     \n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("   </head>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css\\registration.css\">\n");
      out.write("<body>\n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print(request.getAttribute("status"));
      out.write("\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"title\"> Add Bed</div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <form method=\"post\" action=\"add_bed\">\n");
      out.write("        <div class=\"user-details\">\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Hostel Name</span>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Hostel name\" name=\"hname\" value=\" \" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Room No</span>\n");
      out.write("            <input type=\"number\" placeholder=\"Enter Room No\" name=\"rno\" value=\" \" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <span class=\"details\">Bed No</span>\n");
      out.write("            <input type=\"number\" placeholder=\"Enter Bed No\" name=\"bno\" value=\"\"required>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("          <div class=\"category\"> \n");
      out.write("          <label for=\"bed\">Bed Status:</label>\n");
      out.write("\n");
      out.write("          <select name=\"bstatus\" id=\"cars\">\n");
      out.write("          <option value=\"yes\">alloted</option>\n");
      out.write("          <option value=\"not\">not alloted</option>\n");
      out.write("\n");
      out.write("          </select>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        <div class=\"button\">\n");
      out.write("          <input type=\"submit\" value=\"Show data\" onclick=\"back()\">\n");
      out.write("          <input type=\"submit\" value=\"Add Bed\" name=\"submit\" style=\"margin-left:85px;\">\n");
      out.write("        </div>\n");
      out.write("        <span style=\"color:red\"></span>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("            var status=document.getElementById(\"status\").value;\n");
      out.write("            if (status===\"success\"){\n");
      out.write("                alert(\"Bed Created Successfully\");\n");
      out.write("            }\n");
      out.write("            else if(status===\"failed\"){\n");
      out.write("                \n");
      out.write("                alert(\"Bed Creation Failed\");\n");
      out.write("            }\n");
      out.write("            else if(status===\"Created\"){\n");
      out.write("                \n");
      out.write("                alert(\"Bed Already Exist\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
