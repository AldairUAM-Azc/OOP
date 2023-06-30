package repaso;

import java.util.List;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        List<Persona> seleccion = new ArrayList<Persona>();
        Entrenador entrenador = new Entrenador("Tuca", 69, "Rayados", "Psicologo", 45600.0f);
        Masajista masajista = new Masajista("Chespirito", 78, "America FC", "Arte dramatico", 6);
        seleccion.add(entrenador, masajista);

        System.out.println(seleccion);

        for (Persona p : seleccion){
            System.out.println(p.toString());
            System.out.println(p.premio());
            if (p instanceof Jugador) {
                System.out.println("Es jugador");
                ((Jugador) p).convocatoria();
            }
            if (p instanceof Entrenador){
                System.out.println("Es entrenador");
                ((Entrenador) p).convocatoria();
            }
            
        }
    }
}