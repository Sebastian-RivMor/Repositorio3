
package newpackage;


public class Usuario {
    private String nomuser;
    private String contraseña;

    public Usuario(String nomuser, String contraseña) {
        this.nomuser = nomuser;
        this.contraseña = contraseña;
    }
    

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
