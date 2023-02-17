package Proyecto5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALUMNO07
 */
import java.util.Scanner;

public class ArregloNombres {

  public static void main(String[] args) {
//    String[] names = new String[8];
//    for (int i = 0; i < names.length; i++) {
//      names[i] = ArreglosOperaciones.readString();
//    }
    String[] names = new String[]{"Aldair","Avalos", "Lopez","Amy", "Maximiliano" , "Camilo"};

    ArreglosOperaciones.printArray(names);
    System.out.println("Mas chico: " + ArreglosOperaciones.shortest(names));
    System.out.println("Mas largo: " + ArreglosOperaciones.longest(names));
    System.out.println("ANTES");
    ArreglosOperaciones.printArray(names);
    ArreglosOperaciones.ordena(names);
    System.out.println("DESPUES");
    ArreglosOperaciones.printArray(names);
    
  }
}
