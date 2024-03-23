<%-- 
    Document   : Home
    Created on : Dec 22, 2022, 1:15:32 PM
    Author     : user
--%>

<%@ page import ="java.sql.*" %>
<%
    try{
        String username = request.getParameter("username");   
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?useSSL=false&allowPublicKeyRetrieval=true" , "root","admin");    
        PreparedStatement pst = conn.prepareStatement("Select enrolNo,password from users where enrolNo=? and password=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())  
        {
           out.println("Valid login credentials");
           out.println("Welcome "+username);
           String site = new String("wardenindex.jsp");
           response.setStatus(response.SC_MOVED_TEMPORARILY);
           response.setHeader("Location", site); 
           
        }
        else
           out.println("Invalid login credentials");            
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again"+e);       
   }      
%>