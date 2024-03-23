<%-- 
    Document   : bed_list
    Created on : Jul 16, 2023, 12:14:38 AM
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
                .rtd{
                    background: red;
                }
                .gtd{
                    background: green;
                }
            </style>
            <title>Bed Management</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" >
                    <div>
                        <a href="#" class="navbar-brand"> Bed
     Management </a>
                    </div>

                    
                </nav>
            </header>
            <br>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center"><a href="wardenindex.jsp">List of Beds</a></h3>
                    <hr>
                    <div class="container text-left">

                        <a href="managebed.jsp" id="btn" class="btn btn-success" >Add
     New Bed</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Hostel Name</th>
                                <th>Room No</th>
                                <th>Bed No</th>
                                <th>Status</th>
                                <th>  </th>
                                <%--<th>Actions</th>--%>
                            </tr>
                        </thead>
                        <%
          try{
              Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?useSSL=false&allowPublicKeyRetrieval=true" , "root","admin");
              Statement pst = conn.createStatement();
              String str="Select * from bedetails ";
              ResultSet rs = pst.executeQuery(str);
              String class_name="";
              System.out.println(class_name);
              while(rs.next())
              {
                 %>
                 <tr>
                 <td><%=rs.getString("HostelName")%></td>
                 <td><%=rs.getString("RoomNo")%></td>
                 <td><%=rs.getString("BedNo")%></td>
                 <td><%=rs.getString("BedStatus")%></td>
                 
                 <td <%out.print("class="+class_name);%> ></td>
                 
                 
                 <%
                     Statement pst1 = conn.createStatement();
                     String qry="Select BedStatus from hms_db.bedetails";
                     ResultSet rs1 = pst1.executeQuery(qry);
                     while(rs1.next())
                     {
                         String status=new String(rs1.getString("BedStatus"));
                         System.out.println(status);
                         if(status=="Yes")
                         {
                             class_name="rtd";
                 %>
                             
                         <%    
                         }
                         else
                         {
                            class_name="gtd";
                            %>
                            
                            <%
                         }
                         
                         
                         
                     }
                    
                          %>
                          
                          <%
                     
                        
                     
                 %>
                 <%-- <td><a href="edit?id=">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=">Delete</a></td>--%>
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
