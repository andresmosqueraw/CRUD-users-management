
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import co.edu.uniempresarial.DTO.UsuarioDTO;
import java.sql.*;
import java.util.*;


public class UsuarioDAO implements CRUD {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    UsuarioDTO p = new UsuarioDTO();
    
    
    @Override
    public List listar() {
        ArrayList<UsuarioDTO>list=new ArrayList<>();
        String sql = "select * from usuario";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                UsuarioDTO per = new UsuarioDTO();
                per.setUsuario_id(rs.getInt("usuario_id"));
                per.setUsuario_nombre(rs.getString("usuario_nombre"));
                per.setUsuario_apellido(rs.getString("usuario_apellido"));
                per.setUsuario_login(rs.getString("usuario_login"));
                per.setUsuario_clave(rs.getString("usuario_clave"));
                per.setUsuario_documento(rs.getInt("usuario_documento"));
                list.add(per);
            }
        } catch (Exception e) {
            
        }
        return list;
    }

    @Override
    public UsuarioDTO list(int usuario_id) {
        String sql = "select * from usuario where usuario_id="+usuario_id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                p.setUsuario_id(rs.getInt("usuario_id"));
                p.setUsuario_nombre(rs.getString("usuario_nombre"));
                p.setUsuario_apellido(rs.getString("usuario_apellido"));
                p.setUsuario_login(rs.getString("usuario_login"));
                p.setUsuario_clave(rs.getString("usuario_clave"));
                p.setUsuario_documento(rs.getInt("usuario_documento"));
            }
        } catch (Exception e) {
            
        }
        return p;
    }
    @Override
    public boolean add(UsuarioDTO per) {
        String sql = "insert into usuario(usuario_nombre, usuario_apellido, usuario_login, usuario_clave, usuario_documento) values('"+per.getUsuario_nombre()+"','"+per.getUsuario_apellido()+"','"+per.getUsuario_login()+"','"+per.getUsuario_clave()+"','"+per.getUsuario_documento()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        
        }
        return false;
    }

    @Override
    public boolean edit(UsuarioDTO per) {
        String sql = "update usuario set usuario_nombre='"+per.getUsuario_nombre()+"',usuario_apellido='"+per.getUsuario_apellido()+"',usuario_login='"+per.getUsuario_login()+"',usuario_clave='"+per.getUsuario_clave()+"',usuario_documento='"+per.getUsuario_documento()+"'where usuario_id="+per.getUsuario_id();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return false;
    }

    @Override
    public boolean eliminar(int usuario_id) {
        String sql = "delete from usuario where usuario_id="+usuario_id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate(sql);
        } catch (Exception e) {
        }
        return false;
    }
    
}
