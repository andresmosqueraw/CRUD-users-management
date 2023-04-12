<%-- 
    Document   : add
    Created on : 28/03/2023, 11:34:43 p. m.
    Author     : pipem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./styles.css">
        <!-- Bootstrap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    </head>
    <body class="bg-primary">
        <nav class="navbar bg-dark" data-bs-theme="dark">
            <div class="container-fluid d-flex justify-content-center">
                <span class="navbar-brand mb-0 h1">User Management Application</span>
              </div>
        </nav>
        <div class="container d-flex justify-content-center mt-5 bg-white py-5 px-0">
            <div class="col-lg-6">
                <h1>Agregar Persona</h1>
                <form action="Controlador">
                    <input class="form-control" type="text" name="usuario_nombre" placeholder="nombre"><br>
                    <input class="form-control" type="text" name="usuario_apellido" placeholder="apellido"><br>
                    <input class="form-control" type="text" name="usuario_login" placeholder="login"><br>
                    <input class="form-control" type="password" name="usuario_clave"placeholder="clave"><br>
                    <input class="form-control" type="number" name="usuario_documento" placeholder="documento"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a class="btn btn-light" href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
        <footer class="fixed-bottom" style="background-color: #000 !important; color:white;">
            <div class="d-flex flex-column justify-content-between py-1">
                <p class="text-center">© 2023 All rights reserved, User Management Application. Developed by - Andres Mosquera & Juan Mahecha</p>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </body>
</html>
