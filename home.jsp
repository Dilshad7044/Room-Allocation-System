<%-- 
    Document   : home.jsp
    Created on : 23 Jun, 2023, 11:35:00 AM
    Author     : Dilshad Ansari
--%>
<%-- 
    Document   : index
    Created on : 16 Jun, 2023, 11:47:46 PM
    Author     : Dilshad Ansari
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1" name="viewport" />
    <title>Home page</title>
    <link rel="stylesheet" href="css\home.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Encode+Sans+Expanded:wght@400;700&display=swap" rel="stylesheet">

    </head>
   <body onscroll="changecolor()">

    <script type="text/javascript">
    function rtohome(){
      window.location.href ="index.jsp";
    }
    function change(){
      window.location.href ="registration.jsp";
    }
    window.onscroll=function(){
      var top=window.scrollY;
      if(top>=50){
        document.getElementById("Nav1").style.backgroundColor = "white";
        document.getElementById("linkcolor").style.color = "black";
        document.getElementById("linkcolor1").style.color = "black";
        document.getElementById("linkcolor2").style.color = "black";
        document.getElementById("linkcolor3").style.color = "black";
      }
      else{
        document.getElementById("Nav1").style.backgroundColor = "transparent";
        document.getElementById("linkcolor").style.color = "white";
        document.getElementById("linkcolor1").style.color = "white";
        document.getElementById("linkcolor2").style.color = "white";
        document.getElementById("linkcolor3").style.color = "white";
      }
    }

    </script>


<div class="Nav" id="Nav1">
  <div class="NavbarContainer">
    <img src="image\MANUULOGO.jpg" alt="" class="NavLogo" onclick="rtohome()">
    <div class="MobileIcon">
    <i class="fa fa-bars"></i>
    </div>
    <ul class="NavMenu ">
        <li class="NavItem"><a id="linkcolor" on class="NavLinks" href="index.jsp">Home</a></li>
      <li class="NavItem"><a id="linkcolor" on class="NavLinks" href="aboutme.jsp">About</a></li>
      <li class="NavItem"><a id="linkcolor1" class="NavLinks" href="service.jsp">Service</a></li>
      <li class="NavItem"><a id="linkcolor2" class="NavLinks" href="#contact">Contact Us</a></li>
      <li class="NavItem"><a id="linkcolor3" class="NavLinks" href="signin.jsp">Sign in</a></li>
    </ul>
    <div class="NavBtn">
      <button type="button" name="button" class="NavBtnLink"  onclick="change()">Signup</button>
    </div>

  </div>
</div>

<!-- Hero section -->
<div class="HeroContainer">
  <div class="HeroBg">
    <video muted autoplay="autoplay" loop class="VideoBg">
  <source src="videos\Manuu.mp4" type="video/mp4">
</video>
  </div>
<div class="HeroContent">
  <h1 class="HeroH1">Hostel Management System</h1>
  <p class="HeroP">MANUU HYDERABAD</p>
  <div class="HeroBtnWrapper">
<button type="button" name="button" class="NavBtnLink"  onclick="change()">Get Started</button>
  </div>
</div>

</div>



<!-- infosection1 -->

<div class="InfoContainer" id="about">
<div class="InfoWrapper">

<div class="InfoRow">
<div class="Column1">
<div class="TextWrapper">
<p class="TopLine">World class facilities</p>
<h1 class="Heading">Best facilities with less prices</h1>
<p class="Subtitle">Cherish your hostel life with our hostels</p>
<div class="BtnWrap">
<button type="button" name="button" class="NavBtnLink">Get Started</button>
</div>
</div>
</div>

<div class="Column2">
<div class="ImgWrap">
<img class="Img" src="image\svg-1.svg" alt="">
</div>
</div>
</div>
</div>

</div>




<!-- infosection2 -->

<div class="InfoContainer">
<div class="InfoWrapper">

<div class="InfoRow" style="grid-template-areas:'col1 col2' ;">
<div class="Column1">
<div class="TextWrapper">
<p class="TopLine">Best food</p>
<h1 class="Heading">Unlimited variety of dishes</h1>
<p class="Subtitle">Taste dishes across the world </p>
<div class="BtnWrap">
<button type="button" name="button" class="NavBtnLink">Get Started</button>
</div>
</div>
</div>

<div class="Column2">
<div class="ImgWrap">
<img class="Img" src="image/infosectionpic2.svg" alt="">
</div>
</div>


</div>

</div>

</div>

<!-- footer -->
<div class="FooterContainer" id="contact">
<div class="FooterWrap">
  <div class="FooterLinksContainer">
    <div class="FooterLinksWrapper">
        <div class="FooterLinkItems">
            <h1 class="FooterLinkTitle">About Us</h1>
            <a href="aboutme.html" class="FooterLink">Developers</a>
            <a href="#aboutme.html" class="FooterLink">About us</a>
            <a href="service.html" class="FooterLink">Service</a>
            <a href="admin\adminlogin." class="FooterLink">Admin</a>
        </div>
    </div>
  </div>

  <div class="SocialMedia">
    <div class="SocialMediaWrap">
      <a href="#" class="SocialLogo">HMS</a>
      <p class="WebsiteRights">MANUU © 2022</p>
      <div class="SocialIcons">
        <a href="https://www.facebook.com/manuuhydofficial/" class="SocialIconLink"><i class="fa fa-facebook-square" aria-hidden="true"></i></a>
        <a href="https://twitter.com/officialmanuu" class="SocialIconLink"><i class="fa fa-twitter" aria-hidden="true"></i></a>
        <a href="https://www.instagram.com/vellore_vit/?hl=en" class="SocialIconLink"><i class="fa fa-instagram" aria-hidden="true"></i></a>
        <a href="https://www.youtube.com/@IMCMANUU/featured" class="SocialIconLink"><i class="fa-brands fa-youtube"></i></a>
      </div>
    </div>

  </div>

</div>
</div>


  </body>
</html>