package Proyecto5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALUMNO07
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArreglosOperaciones {

  //metodo para imprimir el arreglo con cadenas
  public static void printArray(String[] arr) {
    System.out.println(Arrays.toString(arr));
  }

  public static String readString() {
    String input;
    try ( Scanner teclado = new Scanner(System.in)) {
      input = teclado.nextLine();
    }
    return input;
  }

  public static String shortest(String[] arr) {
    String shortest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].length() < arr[i - 1].length()) {
        shortest = arr[i];
      }
    }
    return shortest;
  }

  public static String longest(String[] arr) {
    String longest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].length() > arr[i - 1].length()) {
        longest = arr[i];
      }
    }
    return longest;
  }

  public static void ordena(String[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j < arr.length - i; j++) {
//        if (arr[j - 1].length() > arr[j].length()) { //comparar por el largo de la cadena
        if (arr[j - 1].compareToIgnoreCase(arr[j]) > 0) { //orden alfabetico
          String temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }
}
