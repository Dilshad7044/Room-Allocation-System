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
         window.location.href ="hostel.jsp";
       }
       function register(){
         window.location.href ="managebed.jsp";
       }
     </script>
     
	
        
        
    
   </head>
  <link rel="stylesheet" href="css\registration.css">
<body>
    <input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
  <div class="container">
    <div class="title"> Allotment Form</div>
    <div class="content">
      <form method="post" action="allot_room">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Student Name</span>
            <input type="text" placeholder="Enter your name" name="sname" value=" " required>
          </div>
            <div class="input-box">
            <span class="details">Enrollment No</span>
            <input type="text" placeholder="Enter Enrollment number" name="enrollno" value=""required>
          </div>
          <div class="input-box">
            <span class="details">Course</span>
            <input type="text" placeholder="Enter your course" name="course" value=" " required>
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
            <span class="details">Hostel Name</span>
            <input type="text" placeholder="Enter Hostel Name" name="hostelno" value=""required>
          </div>
            <div class="input-box">
            <span class="details">Room No</span>
            <input type="text" placeholder="Enter Room number" name="roomno" value=""required>
          </div>
            <div class="input-box">
            <span class="details">Bed No</span>
            <input type="text" placeholder="Enter Bed number" name="bedno" value=""required>
          </div>
          

        </div>
        <div class="button">
          <input type="submit" value="Go Back" onclick="back()">
          <input type="submit" value="Submited" name="submit" style="margin-left:85px;">
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

