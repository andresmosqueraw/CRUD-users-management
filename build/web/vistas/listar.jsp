<%-- 
    Document   : listar
    Created on : 28/03/2023, 11:34:17 p. m.
    Author     : pipem
--%>

<%@page import="java.util.*"%>
<%@page import="co.edu.uniempresarial.DTO.UsuarioDTO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
    </head>
    <body class="bg-primary">
        <nav class="navbar bg-dark" data-bs-theme="dark">
            <div class="container-fluid d-flex justify-content-center">
                <span class="navbar-brand mb-0 h1">User Management Application</span>
              </div>
        </nav>
        <div class="container bg-white mb-15 mt-5 px-5 py-2 ">
            <h1>Personas</h1>
            <a class="btn btn-primary" href="Controlador?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered" border="1">
                <thead>
                    <tr>
                        <th class="text-center">usuario_id</th>
                        <th class="text-center">usuario_nombre</th>
                        <th class="text-center">usuario_apellido</th>
                        <th class="text-center">usuario_login</th>
                        <th class="text-center">usuario_clave</th>
                        <th class="text-center">usuario_documento</th>
                        <th class="text-center">acciones</th>
                    </tr>
                </thead>
                <%
                    UsuarioDAO dao=new UsuarioDAO();
                    List<UsuarioDTO>list= dao.listar();
                    Iterator<UsuarioDTO>iter=list.iterator();
                    UsuarioDTO per=null;
                    while(iter.hasNext()){
                        per=iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getUsuario_id()%></td>
                        <td class="text-center"><%= per.getUsuario_nombre()%></td>
                        <td class="text-center"><%= per.getUsuario_apellido()%></td>
                        <td class="text-center"><%= per.getUsuario_login()%></td>
                        <td class="text-center"><%= per.getUsuario_clave()%></td>
                        <td class="text-center"><%= per.getUsuario_documento()%></td>
                        <td class="text-center">
                            <a class="btn btn-success" href="Controlador?accion=editar&id=<%=per.getUsuario_id()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%=per.getUsuario_id()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        <footer class="fixed-bottom" style="background-color: #000 !important; color:white;">
            <div class="d-flex flex-column justify-content-between py-1">
                <p class="text-center">© 2023 All rights reserved, User Management Application. Developed by - Andres Mosquera & Juan Mahecha</p>
            </div>
        </footer>
    </body>
</html>
