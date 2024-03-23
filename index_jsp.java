package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\n");
      out.write("    <title>Home page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\home.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Encode+Sans+Expanded:wght@400;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("   <body onscroll=\"changecolor()\">\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    function rtohome(){\n");
      out.write("      window.location.href =\"home.jsp\";\n");
      out.write("    }\n");
      out.write("    function change(){\n");
      out.write("      window.location.href =\"registration.jsp\";\n");
      out.write("    }\n");
      out.write("    window.onscroll=function(){\n");
      out.write("      var top=window.scrollY;\n");
      out.write("      if(top>=50){\n");
      out.write("        document.getElementById(\"Nav1\").style.backgroundColor = \"white\";\n");
      out.write("        document.getElementById(\"linkcolor\").style.color = \"black\";\n");
      out.write("        document.getElementById(\"linkcolor1\").style.color = \"black\";\n");
      out.write("        document.getElementById(\"linkcolor2\").style.color = \"black\";\n");
      out.write("        document.getElementById(\"linkcolor3\").style.color = \"black\";\n");
      out.write("      }\n");
      out.write("      else{\n");
      out.write("        document.getElementById(\"Nav1\").style.backgroundColor = \"transparent\";\n");
      out.write("        document.getElementById(\"linkcolor\").style.color = \"white\";\n");
      out.write("        document.getElementById(\"linkcolor1\").style.color = \"white\";\n");
      out.write("        document.getElementById(\"linkcolor2\").style.color = \"white\";\n");
      out.write("        document.getElementById(\"linkcolor3\").style.color = \"white\";\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"Nav\" id=\"Nav1\">\n");
      out.write("  <div class=\"NavbarContainer\">\n");
      out.write("    <img src=\"image\\MANUULOGO.jpg\" alt=\"\" class=\"NavLogo\" onclick=\"rtohome()\">\n");
      out.write("    <div class=\"MobileIcon\">\n");
      out.write("    <i class=\"fa fa-bars\"></i>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"NavMenu \">\n");
      out.write("        <li class=\"NavItem\"><a id=\"linkcolor\" on class=\"NavLinks\" href=\"index.jsp\">Home</a></li>\n");
      out.write("      <li class=\"NavItem\"><a id=\"linkcolor\" on class=\"NavLinks\" href=\"aboutme.jsp\">About</a></li>\n");
      out.write("      <!--<li class=\"NavItem\"><a id=\"linkcolor1\" class=\"NavLinks\" href=\"service.jsp\">Service</a></li>-->\n");
      out.write("      <li class=\"NavItem\"><a id=\"linkcolor2\" class=\"NavLinks\" href=\"#contact\">Contact Us</a></li>\n");
      out.write("      <li class=\"NavItem\"><a id=\"linkcolor3\" class=\"NavLinks\" href=\"signin.jsp\">Sign in</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <div class=\"NavBtn\">\n");
      out.write("      <button type=\"button\" name=\"button\" class=\"NavBtnLink\"  onclick=\"change()\">Signup</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Hero section -->\n");
      out.write("<div class=\"HeroContainer\">\n");
      out.write("\n");
      out.write("<div class=\"HeroContent\">\n");
      out.write("  <h1 class=\"HeroH1\">Hostel Management System</h1>\n");
      out.write("  <p class=\"HeroP\">MANUU HYDERABAD</p>\n");
      out.write("  <div class=\"HeroBtnWrapper\">\n");
      out.write("<button type=\"button\" name=\"button\" class=\"NavBtnLink\"  onclick=\"change()\">Get Started</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- infosection1 -->\n");
      out.write("\n");
      out.write("<div class=\"InfoContainer\" id=\"about\">\n");
      out.write("<div class=\"InfoWrapper\">\n");
      out.write("\n");
      out.write("<div class=\"InfoRow\">\n");
      out.write("<div class=\"Column1\">\n");
      out.write("<div class=\"TextWrapper\">\n");
      out.write("<p class=\"TopLine\">World class facilities</p>\n");
      out.write("<h1 class=\"Heading\">Best facilities with less prices</h1>\n");
      out.write("<p class=\"Subtitle\">Cherish your hostel life with our hostels</p>\n");
      out.write("<div class=\"BtnWrap\">\n");
      out.write("<button type=\"button\" name=\"button\" class=\"NavBtnLink\">Get Started</button>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"Column2\">\n");
      out.write("<div class=\"ImgWrap\">\n");
      out.write("<img class=\"Img\" src=\"image\\svg-1.svg\" alt=\"\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- infosection2 -->\n");
      out.write("\n");
      out.write("<div class=\"InfoContainer\">\n");
      out.write("<div class=\"InfoWrapper\">\n");
      out.write("\n");
      out.write("<div class=\"InfoRow\" style=\"grid-template-areas:'col1 col2' ;\">\n");
      out.write("<div class=\"Column1\">\n");
      out.write("<div class=\"TextWrapper\">\n");
      out.write("<p class=\"TopLine\">Best food</p>\n");
      out.write("<h1 class=\"Heading\">Unlimited variety of dishes</h1>\n");
      out.write("<p class=\"Subtitle\">Taste dishes across the world </p>\n");
      out.write("<div class=\"BtnWrap\">\n");
      out.write("<button type=\"button\" name=\"button\" class=\"NavBtnLink\">Get Started</button>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"Column2\">\n");
      out.write("<div class=\"ImgWrap\">\n");
      out.write("<img class=\"Img\" src=\"image/infosectionpic2.svg\" alt=\"\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<div class=\"FooterContainer\" id=\"contact\">\n");
      out.write("<div class=\"FooterWrap\">\n");
      out.write("  <div class=\"FooterLinksContainer\">\n");
      out.write("    <div class=\"FooterLinksWrapper\">\n");
      out.write("        <div class=\"FooterLinkItems\">\n");
      out.write("            <h1 class=\"FooterLinkTitle\">About Us</h1>\n");
      out.write("           <!-- <a href=\"aboutme.jsp\" class=\"FooterLink\">Developers</a>-->\n");
      out.write("            <a href=\"aboutme.jsp\" class=\"FooterLink\">About us</a>\n");
      out.write("            <a href=\"service.jsp\" class=\"FooterLink\">Service</a>\n");
      out.write("            <a href=\"Admin/adminlogin.jsp\" class=\"FooterLink\">Admin</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"SocialMedia\">\n");
      out.write("    <div class=\"SocialMediaWrap\">\n");
      out.write("      <a href=\"#\" class=\"SocialLogo\">HMS</a>\n");
      out.write("      <p class=\"WebsiteRights\">MANUU © 2023 </p>\n");
      out.write("      <div class=\"SocialIcons\">\n");
      out.write("        <a href=\"https://www.facebook.com/manuuhydofficial/\" class=\"SocialIconLink\"><i class=\"fa fa-facebook-square\" aria-hidden=\"true\"></i></a>\n");
      out.write("        <a href=\"https://twitter.com/officialmanuu\" class=\"SocialIconLink\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("        <a href=\"https://www.instagram.com/vellore_vit/?hl=en\" class=\"SocialIconLink\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("        <a href=\"https://www.youtube.com/@IMCMANUU/featured\" class=\"SocialIconLink\"><i class=\"fa-brands fa-youtube\"></i></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
