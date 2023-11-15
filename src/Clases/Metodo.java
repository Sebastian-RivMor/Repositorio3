package Clases;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Element;
public class Metodo {
    Vector vInventario = new Vector();
    
    public void guardar(Medicamento unMedicamento){
        vInventario.addElement(unMedicamento);
    }
    
    public void guardarArchivo(Medicamento medicamento){
        try{
            FileWriter fw = new FileWriter("Medicamento.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(medicamento.getNombre());
            pw.print(medicamento.getDosis());
            pw.print(medicamento.getFechaCaducidad());
            pw.print(medicamento.getCodigo());
            pw.print(medicamento.getPrecio());
            pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaMedicamento(){
        Vector cabecera = new Vector();
        cabecera.addElement("Codigo");
        cabecera.addElement("Nombre");
        cabecera.addElement("Cantidad");
        cabecera.addElement("Fecha. Cad");
        cabecera.addElement("Precio");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabecera,0);
        
        try{
            FileReader fr = new FileReader("Medicamento.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d= br.readLine()) !=null){
                StringTokenizer dato = new StringTokenizer(d,"i");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return mdlTabla;
    }
}
