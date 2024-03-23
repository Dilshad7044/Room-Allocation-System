package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wardenindex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title> Warden Page</title>\n");
      out.write("\n");
      out.write("\t<!-- Meta tag Keywords -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"keywords\" content=\"Intrend Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,\n");
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
      out.write("\t<!--// Meta tag Keywords -->\n");
      out.write("\n");
      out.write("\t<link href=\"web_home/css_home/slider.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("\t<!-- css files -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"web_home/css_home/bootstrap.css\"> <!-- Bootstrap-Core-CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"web_home/css_home/style.css\" type=\"text/css\" media=\"all\"/> <!-- Style-CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"web_home/css_home/fontawesome-all.css\"> <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("\t<!-- //css files -->\n");
      out.write("\n");
      out.write("\t<!-- testimonials css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"web_home/css_home/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" /><!-- flexslider css -->\n");
      out.write("\t<!-- //testimonials css -->\n");
      out.write("\n");
      out.write("\t<!-- web-fonts -->\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Poiret+One&amp;subset=cyrillic,latin-ext\" rel=\"stylesheet\">\n");
      out.write("\t<!-- //web-fonts -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- banner -->\n");
      out.write("\t<div class=\"banner\" id=\"home\">\n");
      out.write("\t\t<div class=\"cd-radial-slider-wrapper\">\n");
      out.write("\n");
      out.write("<!--Header-->\n");
      out.write("<header>\n");
      out.write("\t<div class=\"container agile-banner_nav\">\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("\n");
      out.write("\t\t\t<h1><a class=\"navbar-brand\" href=\"home.php\">MANUU <span class=\"display\"></span></a></h1>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse justify-content-center\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"hostel.jsp\">Hostels</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"room_list.jsp\">Manage Room</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        \n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"bed_list.jsp\">Manage Bed</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"dropdown nav-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\"><?php echo $_SESSION['roll']; ?>\n");
      out.write("\t\t\t\t\t\t\t<b class=\"caret\"></b>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu agile_short_dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"profile.jsp\">My Profile</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"includes/logout.inc.jsp\">Logout</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("</header>\n");
      out.write("<!--Header-->\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"cd-radial-slider\" data-radius1=\"60\" data-radius2=\"1364\" data-centerx1=\"110\" data-centerx2=\"1290\">\n");
      out.write("\t\t\t\t<li class=\"visible\">\n");
      out.write("\t\t\t\t\t<div class=\"svg-wrapper\">\n");
      out.write("\t\t\t\t\t\t<svg viewBox=\"0 0 1400 800\">\n");
      out.write("\t\t\t\t\t\t\t<title>Animated SVG</title>\n");
      out.write("\t\t\t\t\t\t\t<defs>\n");
      out.write("\t\t\t\t\t\t\t\t<clipPath id=\"cd-image-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<circle id=\"cd-circle-1\" cx=\"110\" cy=\"400\" r=\"1364\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</clipPath>\n");
      out.write("\t\t\t\t\t\t\t</defs>\n");
      out.write("\t\t\t\t\t\t\t<image height='800px' width=\"1400px\" clip-path=\"url(#cd-image-1)\" xlink:href=\"web_home/images/Boys Hostel-II.jpg\"></image>\n");
      out.write("\t\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t\t</div> <!-- .svg-wrapper -->\n");
      out.write("\t\t\t\t\t<div class=\"cd-radial-slider-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Room Allotment </h2>\n");
      out.write("\t\t\t\t\t\t\t\t<h3> MANUU </h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> <!-- .cd-radial-slider-content -->\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"next-slide\">\n");
      out.write("\t\t\t\t\t<div class=\"svg-wrapper\">\n");
      out.write("\t\t\t\t\t\t<svg viewBox=\"0 0 1400 800\">\n");
      out.write("\t\t\t\t\t\t\t<title>Animated SVG</title>\n");
      out.write("\t\t\t\t\t\t\t<defs>\n");
      out.write("\t\t\t\t\t\t\t\t<clipPath id=\"cd-image-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<circle id=\"cd-circle-2\" cx=\"1290\" cy=\"400\" r=\"60\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</clipPath>\n");
      out.write("\t\t\t\t\t\t\t</defs>\n");
      out.write("\t\t\t\t\t\t\t<image height='800px' width=\"1400px\" clip-path=\"url(#cd-image-2)\" xlink:href=\"web_home/images/Boys Hostel-I.jpg\"></image>\n");
      out.write("\t\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t\t</div> <!-- .svg-wrapper -->\n");
      out.write("\t\t\t\t\t<div class=\"cd-radial-slider-content text-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Rooms</h3>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> <!-- .cd-radial-slider-content -->\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"svg-wrapper\">\n");
      out.write("\t\t\t\t\t\t<svg viewBox=\"0 0 1400 800\">\n");
      out.write("\t\t\t\t\t\t\t<title>Animated SVG</title>\n");
      out.write("\t\t\t\t\t\t\t<defs>\n");
      out.write("\t\t\t\t\t\t\t\t<clipPath id=\"cd-image-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<circle id=\"cd-circle-3\" cx=\"110\" cy=\"400\" r=\"60\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</clipPath>\n");
      out.write("\t\t\t\t\t\t\t</defs>\n");
      out.write("\t\t\t\t\t\t\t<image height='800px' width=\"1400px\" clip-path=\"url(#cd-image-3)\" xlink:href=\"web_home/images/Boys Hostel-III.jpg\"></image>\n");
      out.write("\t\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t\t</div> <!-- .svg-wrapper -->\n");
      out.write("\t\t\t\t\t<div class=\"cd-radial-slider-content text-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Hostels</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> <!-- .cd-radial-slider-content -->\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul> <!-- .cd-radial-slider -->\n");
      out.write("\t\t\t<ul class=\"cd-radial-slider-navigation\">\n");
      out.write("\t\t\t\t<li><a href=\"#0\" class=\"next\"><i class=\"fas fa-chevron-right\"></i></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#0\" class=\"prev\"><i class=\"fas fa-chevron-left\"></i></a></li>\n");
      out.write("\t\t\t</ul> <!-- .cd-radial-slider-navigation -->\n");
      out.write("\t\t</div> <!-- .cd-radial-slider-wrapper -->\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner -->\n");
      out.write("\n");
      out.write("<!-- about -->\n");
      out.write("\n");
      out.write("<!-- why choose us -->\n");
      out.write("<!-- team -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Clients -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("\n");
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
