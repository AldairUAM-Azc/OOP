package repaso;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("1. Registrar un nuevo elemento de la seleccion: ");
            System.out.println("2. Listar todos los elementos de la seleccion: ");
            System.out.println("3. Eliminar un elemento de la seleccion");
            System.out.println("4. Busqueda de informacion");
            System.out.println("5. Salir");

            System.out.println("Seleccione la opcion que desee.");

            opcion = leeEntero();

            switch (opcion) {
                case 1:
                System.out.println("Que deseas registrar?");
                System.out.println("E = entrenador, J = jugador, M = masajista");
                String clase = leeString();
                if(clase.equalsIgnoreCase("E"))
                    System.out.println("Proporciona el sueldo");
                    float sueldo = leeFloat();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Ay la bimbo");
                    break;
                default:
                    System.out.println("Eres un tonto muchacho");
                    break;
            }

        } while (opcion != 5);
    }

    public static int leeEntero() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static String leeString() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static float leeFloat() {
        Scanner s = new Scanner(System.in);
        return s.nextFloat();
    }
}