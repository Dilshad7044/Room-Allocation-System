<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Signin</title>
    <link rel="stylesheet" href="css\signin.css">
    <link rel="java" href="login.jsp">
    <script type="text/javascript">
      function back(){
        window.location.href ="index.jsp";
      }
    </script>

  </head>
  <body>
    <div class="center">
      <h1>Login</h1>
      <form method="post" action="login.jsp" >
        <div class="txt_field">
          <input name="username" type="text" required>
         
          <label>Employee id</label>
        </div>
        <div class="txt_field">
          <input name="password" type="password" required>

          <label>Password</label>
        </div>
        <div class="pass">Forgot Password?</div>
        <input type="submit" value="Go Back"onclick="back()" style="margin-bottom:5px;">
        <input type="submit" value="Login">
        <div class="signup_link">
          Not a member? <a href="registration.jsp">Signup</a>
        </div>
        <span style="color:red "></span>
      </form>
    </div>

  </body>
</html>
