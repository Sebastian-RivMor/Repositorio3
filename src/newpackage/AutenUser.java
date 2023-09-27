
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class AutenUser {
    
    private ArrayList<Usuario> usuario = new ArrayList<>();
    
    public void VerificarUser(){
        usuario.add(new Usuario("dueño", "12345"));
        usuario.add(new Usuario("empleado", "56789"));
    }
    
    public boolean autenUser(String nomuser, String contruser){
        for (Usuario usuario : usuario){
            if(usuario.getNomuser().equals(nomuser) &&
                    usuario.getContraseña().equals(contruser)){
                return true;
            }
        }
        return false;
    }
}
