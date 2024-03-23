<%-- 
    Document   : registration
    Created on : 17 Jun, 2023, 12:53:52 AM
    Author     : Dilshad Ansari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <script type="text/javascript">
       function back(){
         window.location.href ="index.jsp";
       }
       function register(){
         window.location.href ="signin.jsp";
       }
     </script>
     
	
        
        
    
   </head>
  <link rel="stylesheet" href="css\registration.css">
<body>
    <input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
  <div class="container">
    <div class="title"> Warden Registration</div>
    <div class="content">
      <form method="post" action="register">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" placeholder="Enter your name" name="name" value=" " required>
          </div>
          <div class="input-box">
            <span class="details">Emp ID</span>
            <input type="text" placeholder="Enter your Enrolno" name="enrol" value=" " required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" placeholder="Enter your email" name="email" value=""required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" placeholder="Enter your number" name="phoneno" value=""required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" placeholder="Enter your password" name="password" required>
          </div>
          <div class="input-box">
            <span class="details">Confirm Password</span>
            <input type="password" placeholder="Confirm your password" name="confirmpassword" required>
          </div>

        </div>
        <div class="gender-details">
          <input type="radio" name="gender" id="dot-1" value="male">
          <input type="radio" name="gender" id="dot-2" value="female">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>

          </div>
        </div>
        <div class="button">
          <input type="submit" value="Go Back" onclick="back()">
          <input type="submit" value="Register" name="submit" style="margin-left:85px;">
        </div>
        <span style="color:red"></span>
      </form>
    </div>
  </div>
    <script type="text/javascript">
            
            var status=document.getElementById("status").value;
            if (status==="success"){
                alert("Account Created Successfully");
            }
        </script>
    
</body>
</html>

