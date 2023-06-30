package tarea7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUMNO32
 */
public class MenuPrincipal {
  public static void main(String[] args) {
    List<Automovil> misCarros = new ArrayList<Automovil>();
    misCarros = Operaciones.deserializacion("MisCarros.ser");
    // Aqui se deserializa misCarros, si no existe se crea
    int opc = 0;
    while (opc != 5) {
      System.out.println("1. Registrar un Automovil");
      System.out.println("2. Listar Automoviles");
      System.out.println("3. Eliminar un Automovil");
      System.out.println("4. Buscar un Automovil");
      System.out.println("5. Salir");
      System.out.println("Escribe la opcion a realizar");
      opc = Operaciones.leeEntero();

      switch (opc) {
        case 1:
          System.out.println("Placa:");
          break;
        case 2:
          break;
        case 5:
          System.out.println("Guardando...");
          // Operaciones.serializa(Automovil auto, String path);
          break;
        default:
          break;
      }
    }

  }

}
