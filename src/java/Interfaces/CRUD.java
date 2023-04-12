
package Interfaces;

import co.edu.uniempresarial.DTO.UsuarioDTO;
import java.util.List;

public interface CRUD {
    public List listar();
    public UsuarioDTO list(int usuario_id);
    public boolean add(UsuarioDTO per);
    public boolean edit(UsuarioDTO per);
    public boolean eliminar(int usuario_id);
}
