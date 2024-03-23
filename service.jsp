<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Pricing</title>
    <link rel="stylesheet" href="css\service.css">

    <script type="text/javascript">
      function change(){
        window.location.href ="registration.jsp";
      }
      function rtohome(){
        window.location.href ="index.jsp";
      }
    </script>
  </head>

  <body>
    <div class="Nav" id="Nav1">
      <div class="NavbarContainer">
        <img src="images/vit1.png" alt="" class="NavLogo" onclick="rtohome()">
        <div class="MobileIcon">
        <i class="fa fa-bars"></i>
        </div>
        <ul class="NavMenu ">
          <li class="NavItem"><a id="linkcolor" on class="NavLinks" href="index.jsp#home">Home</a></li>
          <li class="NavItem"><a id="linkcolor" on class="NavLinks" href="index.jsp#about">About</a></li>
          <li class="NavItem"><a id="linkcolor1" class="NavLinks" href="service.jsp">Service</a></li>
          <li class="NavItem"><a id="linkcolor2" class="NavLinks" href="index.jsp#contact">Contact Us</a></li>
          <li class="NavItem"><a id="linkcolor3" class="NavLinks" href="signin.jsp">Sign in</a></li>
        </ul>
        <div class="NavBtn">
          <button type="button" name="button" class="NavBtnLink" onclick="change()">Signup</button>
        </div>

      </div>
    </div>

    <div class="pricingcontainer">
      <div class="pricingwrapper">
        <div class="columns">
  <ul class="price">
    <li class="header">Hostel 1</li>
    <div class="imagewrapper">
    <img style="height:150px; width:150px;" src="image\Boys Hostel-I.jpg" alt="">
    </div>

    <li class="grey">Prem Chand Hostel</li>
    <li>Comfortable Living Area</li>
    <li>Common Reading Room</li>
    <li>Best Mess Service</li>
    <li>Free Wifi Connection</li>
    <li>Badminton Court</li>
    
    <li class="grey"><a href="signin.html" class="button">Select</a></li>
  </ul>
</div>


<div class="columns">
<ul class="price">
<li class="header">Hostel 2</li>
<div class="imagewrapper">
<img style="height:150px; width:150px;" src="image\Boys Hostel-II.jpg" alt="">
</div>

<li class="grey">Sir Syed Ahmad Khan Hostel</li>
<li>Comfortable Living Area</li>
<li>Common Reading Room</li>
<li>Best Mess Service</li>
<li>Free Wifi Connection</li>
<li>Badminton Court</li>

<li class="grey"><a href="signin.html" class="button">Select</a></li>
</ul>
</div>

<div class="columns">
<ul class="price">
<li class="header">Hostel 3</li>
<div class="imagewrapper">
<img style="height:150px; width:150px;" src="image\Boys Hostel-III.jpg" alt="">
</div>

<li class="grey">Shibli Nomani Hostel</li>
<li>Comfortable Living Area</li>
<li>Common Reading Room</li>
<li>Best Mess Service</li>
<li>Free Wifi Connection</li>
<li>Badminton Court</li>

<li class="grey"><a href="signin.html" class="button">Select</a></li>
</ul>
</div>


<div class="columns">
<ul class="price">
<li class="header">Hostel 4</li>
<div class="imagewrapper">
<img style="height:150px; width:150px;" src="images/4.png" alt="">
</div>

<li class="grey">Mohammad Ali Jauhar Hostel </li>
<li>Comfortable Living Area</li>
<li>Common Reading Room</li>
<li>Best Mess Service</li>
<li>Free Wifi Connection</li>
<li>Badminton Court</li>

<li class="grey"><a href="signin.html" class="button">Select</a></li>
</ul>
</div>

      </div>
    </div>

  </body>
</html>
