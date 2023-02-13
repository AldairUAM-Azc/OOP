package Tarea1;
import java.util.Scanner;

/**
 *
 * @author Aldair Avalos al222005685@azc.uam.mx
 */
public class Tarea1 {

  public static void main(String[] args) {
    String nombre, sexo, estado, recomendacion, mensaje;
    String[] clasificacion;
    int edad;
    double estatura, peso, imc, tmb;
    
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa los datos que se te piden. ");
    System.out.print("Nombre: ");
    nombre = input.nextLine();
    System.out.print("Edad: ");
    edad = input.nextInt();
    System.out.print("Estatura en metros: ");
    estatura = input.nextFloat();
    System.out.print("Peso en kg: ");
    peso = input.nextFloat();
    System.out.print("Sexo (H/M): ");
    sexo = input.next();

    imc = peso / (estatura * estatura);
    tmb = sexo.toLowerCase().equals("h")
            ? 10 * peso + 6.25 * estatura - 5 * edad + 5
            : 10 * peso + 6.25 * estatura - 5 * edad - 161;
    clasificacion = darClasificacion(imc);
    estado = clasificacion[0];
    recomendacion = clasificacion[1];
    
    mensaje = """
              Estimado nombre %s, tu índice de masa corporal es de %2.2f, 
              por lo tanto tu estado de salud nutricional es "%s". Considerando 
              que tu tasa metabólica basal es de %2.2f, te recomiendo %s. 
              """.formatted(nombre, imc, estado, tmb, recomendacion);
    System.out.println(mensaje);

  }

  public static String[] darClasificacion(double imc) {
    String[] clasificacion = new String[2];
    if (imc < 18.5) {
      clasificacion[0] = "Bajo peso";
      clasificacion[1] = """
                      Aumentar la ingesta diaria de calorias de
                      calidad nutricional. """;
    } else if (imc >= 18.5 && imc < 25) {
      clasificacion[0] = "Peso normal";
      clasificacion[1] = """
                      Mantener la ingesta de calorías igual y
                      realizar ejercicio de forma constante.""";
    } else if (imc >= 25 && imc < 30) {
      clasificacion[0] = "Sobrepeso";
      clasificacion[1] = """
                      Reducir la ingesta de calorías en 10% para
                      reducir el imc y hacer ejercicio.""";
    } else if (imc >= 30 && imc < 35) {
      clasificacion[0] = "Obesidad tipo I ";
      clasificacion[1] = """
                      Reducir la ingesta de calorías en 30% y seguir
                      un plan de ejercicio.""";
    } else if (imc >= 35 && imc < 40) {
      clasificacion[0] = "Obesidad tipo II";
      clasificacion[1] = """
                      Seguimiento manejado por
                      medicos especialistas.""";
    } else if(imc > 40){
      clasificacion[0] =  "Obesidad tipo III";
      clasificacion[1] = """
                      Seguimiento manejado por
                      medicos especialistas.""";
    }
    return clasificacion;
  }
}
