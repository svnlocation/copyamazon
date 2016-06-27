<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
  <head>
    <meta charset="UTF-8">
    <title>Simple login form</title>
    
    
    <link rel="stylesheet" href="../css/reset.css">

    
        <link rel="stylesheet" href="../css/style.css">

    
    
    
  </head>

  <body>

    <div class="container">
  <div class="login">
  	<h1 class="login-heading">
      <strong>Welcome.</strong> Please login.</h1>
      <form method="post">
        <input type="text" name="user" placeholder="Username" required="required" class="input-txt" />
          <input type="password" name="password" placeholder="Password" required="required" class="input-txt" />
          <div class="login-footer">
             <a href="#" class="lnk">
              <span class="icon icon--min">ಠ╭╮ಠ</span> 
              I've forgotten something
            </a>
            <button type="submit" class="btn btn--right">Sign in  </button>
    
          </div>
      </form>
  </div>
</div>
    
        <script src="../js/index.js"></script>

    
    
    
  </body>
</html>
