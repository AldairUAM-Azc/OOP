public class tester2 {
    public static void main (String[] args){
        seleccion[0] = new Entrenador("Tuca", 69, "Rayados", "Psicologo", 45600.0f);
        seleccion[1] = new Masajista("Chespirito", 78, "America FC", "Arte dramatico", 6);

        for (Persona p : seleccion){
            System.out.println(p);
        }
    }
}