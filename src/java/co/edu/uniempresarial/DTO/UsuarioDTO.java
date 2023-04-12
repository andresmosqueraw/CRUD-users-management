
package co.edu.uniempresarial.DTO;


public class UsuarioDTO {
    private int usuario_id;
    private String usuario_nombre;
    private String usuario_apellido;
    private String usuario_login;
    private String usuario_clave;
    private int usuario_documento;
    
    public UsuarioDTO() {
        
    }
    
    public UsuarioDTO(int usuario_id, String usuario_nombre, String usuario_apellido, String usuario_login, String usuario_clave, int usuario_documento) {
        this.usuario_id = usuario_id;
        this.usuario_nombre = usuario_nombre;
        this.usuario_apellido = usuario_apellido;
        this.usuario_login = usuario_login;
        this.usuario_clave = usuario_clave;
        this.usuario_documento = usuario_documento;
    }
    
    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_nombre() {
        return usuario_nombre;
    }

    public void setUsuario_nombre(String usuario_nombre) {
        this.usuario_nombre = usuario_nombre;
    }

    public String getUsuario_apellido() {
        return usuario_apellido;
    }

    public void setUsuario_apellido(String usuario_apellido) {
        this.usuario_apellido = usuario_apellido;
    }

    public String getUsuario_login() {
        return usuario_login;
    }

    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }

    public String getUsuario_clave() {
        return usuario_clave;
    }

    public void setUsuario_clave(String usuario_clave) {
        this.usuario_clave = usuario_clave;
    }

    public int getUsuario_documento() {
        return usuario_documento;
    }

    public void setUsuario_documento(int usuario_documento) {
        this.usuario_documento = usuario_documento;
    }
}
