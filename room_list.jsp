<%-- 
    Document   : room_list
    Created on : Jul 16, 2023, 1:19:05 AM
    Author     : user
--%>

<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <style>
                nav{
                    background: linear-gradient(120deg,#00467F, #A5CC82);
                }
                .btn{
                    background: linear-gradient(120deg,#00467F, #A5CC82);
                }
            </style>
            <title>Room Management</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" >
                    <div>
                        <a href="#" class="navbar-brand"> Room
     Management </a>
                    </div>

                    
                </nav>
            </header>
            <br>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Rooms</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="manageroom.jsp" id="btn" class="btn btn-success" >Add
     New Room</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Hostel Name</th>
                                <th>Room No</th>
                                <th>No. Of Bed</th>
                                <!--<th>Actions</th>-->
                            </tr>
                        </thead>
                        <%
          try{
              Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?useSSL=false&allowPublicKeyRetrieval=true" , "root","admin");
              Statement pst = conn.createStatement();
              String str="Select * from roomdetails ";
              ResultSet rs = pst.executeQuery(str);
              
              while(rs.next())
              {
                 %>
                 <tr>
                 <td><%=rs.getString("HostelName")%></td>
                 <td><%=rs.getString("RoomNo")%></td>
                 <td><%=rs.getString("BedNo")%></td>
                 <!--<td><a href="edit?id=">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=">Delete</a></td>-->
                 </tr>
                 <%}
          }
          catch(Exception e){
          }
        %>

                    </table>
                </div>
            </div>
     
        </body>

        </html>
