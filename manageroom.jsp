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
         window.location.href ="wardenindex.jsp";
       }
       function add_room(){
         window.location.href ="manageroom.jsp";
       }
     </script>
   </head>
  <link rel="stylesheet" href="css\registration.css">
<body>
    <input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
  <div class="container">
    <div class="title"> Add Room</div>
    <div class="content">
      <form method="post" action="add_room">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Hostel Name</span>
            <input type="text" placeholder="Enter Hostel name" name="hname" value=" " required>
          </div>
          <div class="input-box">
            <span class="details">Room No</span>
            <input type="number" placeholder="Enter Room No" name="room_no" value=" " required>
          </div>
          <div class="input-box">
            <span class="details">No. of Bed</span>
            <input type="number" placeholder="Enter Bed No" name="nob" value=""required>
          </div>
        </div>
        
        <div class="button">
          <input type="submit" value="Go Back" onclick="back()">
          <input type="submit" name="submit" style="margin-left:85px;" >
        </div>
        <span style="color:red"></span>
      </form>
    </div>
    </div>
    <script type="text/javascript">
            
            var status=document.getElementById("status").value;
            if (status==="success"){
                alert("Room Created Successfully");
            }
            else if(status==="already created"){
                alert("Room Already Created");
            }
        </script>
    
</body>
</html>

