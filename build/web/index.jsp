<%-- 
    Document   : index
    Created on : 28/03/2023, 11:27:58 p. m.
    Author     : pipem 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar bg-dark" data-bs-theme="dark">
            <div class="container-fluid d-flex justify-content-center">
                <span class="navbar-brand mb-0 h1">User Management Application</span>
              </div>
        </nav>
        <br>
        <br>
        <div class="container">
            <a class="btn btn-primary" href="Controlador?accion=listar">Listar Persona</a>
        </div>
        <footer class="fixed-bottom" style="background-color: #000 !important; color:white;">
            <div class="d-flex flex-column justify-content-between py-1">
                <p class="text-center">© 2023 All rights reserved, User Management Application. Developed by - Andres Mosquera & Juan Mahecha</p>
            </div>
        </footer>
    </body>
</html>
