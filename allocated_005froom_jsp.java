package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allocated_005froom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title> Allocated Rooms</title>\n");
      out.write("\t\n");
      out.write("\t<!-- Meta tag Keywords -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"keywords\" content=\"Intrend Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("\tSmartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("\t<script type=\"application/x-javascript\">\n");
      out.write("\t\taddEventListener(\"load\", function () {\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\n");
      out.write("\t\t}, false);\n");
      out.write("\n");
      out.write("\t\tfunction hideURLbar() {\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("\t<!-- css files -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\"> <!-- Bootstrap-Core-CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS --> \n");
      out.write("\t<link rel=\"stylesheet\" href=\"web_home/css_home/fontawesome-all.css\"> <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("\t<!-- //css files -->\n");
      out.write("\t\n");
      out.write("\t<!-- web-fonts -->\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Poiret+One&amp;subset=cyrillic,latin-ext\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\" rel=\"stylesheet\">\n");
      out.write("\t<!-- //web-fonts -->\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- banner -->\n");
      out.write("<div class=\"inner-page-banner\" id=\"home\"> \t   \n");
      out.write("\t<!--Header-->\n");
      out.write("\t<header>\n");
      out.write("\t\t<div class=\"container agile-banner_nav\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<h1><a class=\"navbar-brand\" href=\"home_manager.php\">NITC <span class=\"display\"></span></a></h1>\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse justify-content-center\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"allocated_room.jsp\">Allocate Room</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"contact_manager.php\">Contact</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<!--Header-->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- //banner --> \n");
      out.write("<br><br><br>\n");
      out.write("\n");
      out.write("<section class=\"contact py-5\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"mail_grid_w3l\">\n");
      out.write("\t\t\t\t<form action=\"allocated_rooms.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t        <div class=\"col-md-9\"> \n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search by Roll Number\" name=\"search_box\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Search\" name=\"search\"></input>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<h2 class=\"heading text-capitalize mb-sm-5 mb-4\"> Rooms Allotted </h2>\n");
      out.write("\n");
      out.write("        \n");
      out.write("  <table class=\"table table-hover\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>Student Name</th>\n");
      out.write("        <th>Enrollment No</th>\n");
      out.write("        <th>Course</th>\n");
      out.write("        <th>Hostel Name</th>\n");
      out.write("        <th>Room Number</th>\n");
      out.write("        <th>Contact Number</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer class=\"py-5\">\n");
      out.write("\t<div class=\"container py-md-5\">\n");
      out.write("\t\t<div class=\"footer-logo mb-5 text-center\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"https://manuu.edu.in/\" target=\"_blank\"> <span class=\"display\"> Maulana Azad National Urdu University </span></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer-grid\">\n");
      out.write("\t\t\t<div class=\"list-footer\">\n");
      out.write("\t\t\t\t<ul class=\"footer-nav text-center\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"home.jsp\">Home</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"allocated.jsp\">Allocate</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"contact.jsp\">Contact</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"admin/manager_profile.php\">Profile</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</footer>\n");
      out.write("<!-- footer -->\n");
      out.write("\n");
      out.write("<!-- js-scripts -->\n");
      out.write("\n");
      out.write("\t<!-- js -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"web_home/js/jquery-2.2.3.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"web_home/js/bootstrap.js\"></script> <!-- Necessary-JavaScript-File-For-Bootstrap -->\n");
      out.write("\t<!-- //js -->\n");
      out.write("\n");
      out.write("\t<!-- banner js -->\n");
      out.write("\t<script src=\"web_home/js/snap.svg-min.js\"></script>\n");
      out.write("\t<script src=\"web_home/js/main.js\"></script> <!-- Resource jQuery -->\n");
      out.write("\t<!-- //banner js -->\n");
      out.write("\n");
      out.write("\t<!-- flexSlider --><!-- for testimonials -->\n");
      out.write("\t<script defer src=\"web_home/js/jquery.flexslider.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(window).load(function(){\n");
      out.write("\t\t  $('.flexslider').flexslider({\n");
      out.write("\t\t\tanimation: \"slide\",\n");
      out.write("\t\t\tstart: function(slider){\n");
      out.write("\t\t\t  $('body').removeClass('loading');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t  });\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //flexSlider --><!-- for testimonials -->\n");
      out.write("\n");
      out.write("\t<!-- start-smoth-scrolling -->\n");
      out.write("\t<script src=\"web_home/js/SmoothScroll.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"web_home/js/move-top.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"web_home/js/easing.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t$(\".scroll\").click(function(event){\n");
      out.write("\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- here stars scrolling icon -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear'\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t*/\n");
      out.write("\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //here ends scrolling icon -->\n");
      out.write("\t<!-- start-smoth-scrolling -->\n");
      out.write("\n");
      out.write("<!-- //js-scripts -->\n");
      out.write("\n");
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
