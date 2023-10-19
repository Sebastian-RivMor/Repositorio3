
import java.util.ArrayList;
import java.util.List;

public class REGISTROMEDICAMENTOS {
    private List<MEDICAMENTO> medicamentos;
    
    public REGISTROMEDICAMENTOS(){
        medicamentos= new ArrayList<>();
    }
    public void agregarmedicamentos(MEDICAMENTO medicamento){
        medicamentos.add(medicamento);
    }
  public void modificarMedicamento(String codigo, String nuevoNombre, int nuevaDosis, String nuevaFechaCaducidad) {
        for (MEDICAMENTO medicamento : medicamentos) {
            if (medicamento.getCodigo().equals(codigo)) {
                medicamento.setNombre(nuevoNombre);
                medicamento.setDosis(nuevaDosis);
                medicamento.setFechaCaducidad(nuevaFechaCaducidad);
                System.out.println("Medicamento modificado con éxito.");
                return;
            }
        }
        System.out.println("Medicamento no encontrado.");
    }

    public void eliminarMedicamento(String codigo) {
        MEDICAMENTO medicamentoAEliminar = null;
        for (MEDICAMENTO medicamento : medicamentos) {
            if (medicamento.getCodigo().equals(codigo)) {
                medicamentoAEliminar = medicamento;
                break;
            }
        }

        if (medicamentoAEliminar != null) {
            medicamentos.remove(medicamentoAEliminar);
            System.out.println("Medicamento eliminado con éxito.");
        } else {
            System.out.println("Medicamento no encontrado.");
        }
    }

    public void verMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("No hay medicamentos registrados.");
        } else {
            System.out.println("Lista de Medicamentos:");
            for (MEDICAMENTO medicamento : medicamentos) {
                System.out.println("Código: " + medicamento.getCodigo());
                System.out.println("Nombre: " + medicamento.getNombre());
                System.out.println("Dosis: " + medicamento.getDosis());
                System.out.println("Fecha de Caducidad: " + medicamento.getFechaCaducidad());
                System.out.println();
            }
        }
    }

    public List<MEDICAMENTO> obtenerMedicamentos() {
        return medicamentos;
    }
}

   

