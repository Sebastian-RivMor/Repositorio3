package Clases;

import java.util.Vector;


public class ListaUsuarios {
    private static Vector<consultas> datos = new Vector<consultas>();
    public static void agregar(consultas obj){
        datos.addElement(obj);
    }
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
    }
    public static Vector mostrar(){
        return datos;
    }
}
