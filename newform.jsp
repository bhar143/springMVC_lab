<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
      content="width=device-width,initial-scale=1, shrink-to-fit=no">
       <!-- Bootstrap CSS -->
      <link rel="stylesheet"
      href="https://stackpath.boostrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
      integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYM70gZWKYbI706tWS"
      crossorigin="anonymous">
      
  <title>Save Student</title>
</head>

<body>

      <div class="container">
           <center>
                  <b>
                     <font size = "3">
                           <h1 style="background-color:Voilet;">STUDENTS ENROLLED</h1>
                     </font>
                  </b>
           </center>
           <hr>
              
          <p class="h4 mb-4">Save Student</p>
         
         <form action="/springMVC/students/save" method="POST">
         
         <!-- Add hidden form field  to handle update -->
         <input type="hidden" name="id" value="${students.id}"/>
         
         <div class="form-inline">
         <input type="text" name="name" value="${students.name}"
          class="form-control mb-4 col-4" placeholder="Name">
         
         </div>
         
         <div class="form-inline">
         <input type="text" name="department" value="${students.department}"
          class="form-control mb-4 col-4" placeholder="Department">
         
         </div>
         
         <div class="form-inline">
         <input type="text" name="country" value="${students.country}"
          class="form-control mb-4 col-4" placeholder="Country">
         
         </div>
         
         
			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>
		
		<hr>
		<a href="/springMVC/students/list">BACK to  List</a>
		

  </div>
  

</body>
</html>