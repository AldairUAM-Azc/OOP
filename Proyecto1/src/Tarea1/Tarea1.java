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
    //Obten los datos que el usuario ingresa con el teclado y guardalos en 
    //las variables correspondientes
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

    //Calcula el imc y tmb
    //El calculo de tmb cambia dependiendo si se es "h"ombre o "m"ujer
    imc = peso / (estatura * estatura);
    tmb = sexo.toLowerCase().equals("h")
            ? 10*peso + 6.25*estatura*100 - 5*edad + 5
            : 10*peso + 6.25*estatura*100 - 5*edad - 161;
    //darClasificacion regresa un String[] con el estado de salud y 
    //la recomendacion de acuerdo al imc del usuario
    clasificacion = darClasificacion(imc);
    estado = clasificacion[0];
    recomendacion = clasificacion[1];
    
    //Imprime el analisis del estado de salud
    mensaje = """
              Estimado %s, tu indice de masa corporal es de %2.2f, 
              por lo tanto tu estado de salud nutricional es "%s". Considerando 
              que tu tasa metabolica basal es de %2.2f, te recomiendo "%s". 
              """.formatted(nombre, imc, estado, tmb, recomendacion);
    System.out.println(mensaje);

  }

  public static String[] darClasificacion(double imc) {
    String[] clasificacion = new String[2];
    //Dependiendo del intervalo donde este el imc, 
    //se clasifica el estado de salud y se da una recomendacion
    if (imc < 18.5) {
      clasificacion[0] = "Bajo peso";
      clasificacion[1] = """
                      Aumentar la ingesta diaria de calorias de
                      calidad nutricional. """;
    } else if (imc >= 18.5 && imc < 25) {
      clasificacion[0] = "Peso normal";
      clasificacion[1] = """
                      Mantener la ingesta de calorias igual y
                      realizar ejercicio de forma constante.""";
    } else if (imc >= 25 && imc < 30) {
      clasificacion[0] = "Sobrepeso";
      clasificacion[1] = """
                      Reducir la ingesta de calorias en 10% para
                      reducir el imc y hacer ejercicio.""";
    } else if (imc >= 30 && imc < 35) {
      clasificacion[0] = "Obesidad tipo I ";
      clasificacion[1] = """
                      Reducir la ingesta de calorias en 30% y seguir
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