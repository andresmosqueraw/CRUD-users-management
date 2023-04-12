
package Controlador;

import co.edu.uniempresarial.DTO.UsuarioDTO;
import ModeloDAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {

    String listar = "vistas/listar.jsp";
    String add = "vistas/add.jsp";
    String edit = "vistas/edit.jsp";
    UsuarioDTO p= new UsuarioDTO();
    UsuarioDAO dao=new UsuarioDAO();
    int usuario_id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        /* Recibe el valor que genera el usuario una vez que presiona en el boton */
        String action = request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso = listar;
        }
        //Ir al formulario de agregar
        else if(action.equalsIgnoreCase("add")) {
            acceso = add;
        }
        //Agregar uno nuevo
        else if(action.equalsIgnoreCase("Agregar")) {
            String usuario_nombre = request.getParameter("usuario_nombre");
            String usuario_apellido = request.getParameter("usuario_apellido");
            String usuario_login = request.getParameter("usuario_login");
            String usuario_clave = request.getParameter("usuario_clave");
            int usuario_documento = Integer.parseInt(request.getParameter("usuario_documento"));
            p.setUsuario_nombre(usuario_nombre);
            p.setUsuario_apellido(usuario_apellido);
            p.setUsuario_login(usuario_login);
            p.setUsuario_clave(usuario_clave);
            p.setUsuario_documento(usuario_documento);
            dao.add(p);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("usuario_id",request.getParameter("id"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            int usuario_id = Integer.parseInt(request.getParameter("usuario_id"));
            String usuario_nombre = request.getParameter("usuario_nombre");
            String usuario_apellido = request.getParameter("usuario_apellido");
            String usuario_login = request.getParameter("usuario_login");
            String usuario_clave = request.getParameter("usuario_clave");
            int usuario_documento = Integer.parseInt(request.getParameter("usuario_documento"));
            p.setUsuario_id(usuario_id);
            p.setUsuario_nombre(usuario_nombre);
            p.setUsuario_apellido(usuario_apellido);
            p.setUsuario_login(usuario_login);
            p.setUsuario_clave(usuario_clave);
            p.setUsuario_documento(usuario_documento);
            dao.edit(p);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            usuario_id = Integer.parseInt(request.getParameter("id"));
            p.setUsuario_id(usuario_id);
            dao.eliminar(usuario_id);
            acceso=listar;
        }
        // Para mostrarlo
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
