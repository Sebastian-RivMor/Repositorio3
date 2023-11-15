package Clases;
import java.util.Vector;
public class consultas {
    private String nombreUsuario;
    private String contrasena;
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public static int verificarUsuarioNuevo(String usuario){
        Vector lista=mostrar();
        consultas obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (consultas)lista.elementAt(i);
            if(obj.getNombreUsuario().equalsIgnoreCase(usuario))
            return i;
        }
        return -1;
    }
    public static int verificarInicioSesion(String usuario, String contrasena){
        Vector lista = mostrar();
        consultas obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (consultas) lista.elementAt(i);
            if(obj.getNombreUsuario().equalsIgnoreCase(usuario) && obj.getContrasena().equals(contrasena)){
                return 1;
            }
        }
        return -1;
    }
    
    public static Vector mostrar(){
        return ListaUsuarios.mostrar();
    }
}
