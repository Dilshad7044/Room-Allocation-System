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
         window.location.href ="bed_list.jsp";
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
    <div class="title"> Add Bed</div>
    <div class="content">
      <form method="post" action="add_bed">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Hostel Name</span>
            <input type="text" placeholder="Enter Hostel name" name="hname" value=" " required>
          </div>
          <div class="input-box">
            <span class="details">Room No</span>
            <input type="number" placeholder="Enter Room No" name="rno" value=" " required>
          </div>
          <div class="input-box">
            <span class="details">Bed No</span>
            <input type="number" placeholder="Enter Bed No" name="bno" value=""required>
          </div>
        
        </div>
          <div class="category"> 
          <label for="bed">Bed Status:</label>

          <select name="bstatus" id="cars">
          <option value="yes">alloted</option>
          <option value="not">not alloted</option>

          </select>
          </div>
        
        <div class="button">
          <input type="submit" value="Show data" onclick="back()">
          <input type="submit" value="Add Bed" name="submit" style="margin-left:85px;">
        </div>
        <span style="color:red"></span>
      </form>
    </div>
    <script type="text/javascript">
            
            var status=document.getElementById("status").value;
            if (status==="success"){
                alert("Bed Created Successfully");
            }
            else if(status==="failed"){
                
                alert("Bed Creation Failed");
            }
            else if(status==="Created"){
                
                alert("Bed Already Exist");
            }
        </script>
    
</body>
</html>

