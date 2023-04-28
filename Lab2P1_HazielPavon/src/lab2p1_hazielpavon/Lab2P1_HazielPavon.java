/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_hazielpavon;

import java.util.Scanner;

/**
 *
 * @author hapav
 */
public class Lab2P1_HazielPavon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean seguir = true;
        while (seguir) {

            System.out.println("1. Clasificando numeros");
            System.out.println("2. Aproximando PI");
            System.out.println("3. MCD");
            System.out.println("4. salir");
            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("ingrese un numero");
                    int numero = leer.nextInt();

                    int contador = 0;
                    int contador2 = 1;
                    boolean primo = false;
                    boolean par = false;
                    boolean impar = false;

                    if (numero > 0) {

                        while (contador2 <= numero) {
                            if (numero % contador2 == 0) {
                                contador = contador + 1;
                            }
                            contador2 = contador2 + 1;
                        }

                        if (contador == 2 && numero % 2 == 0) {
                            primo = true;
                            par = true;
                            impar = false;
                        }

                        if (contador != 2 && numero % 2 != 0) {
                            impar = true;
                            par = false;
                            primo = false;
                        }
                        if (contador == 2 && numero % 2 != 0) {
                            impar = true;
                            par = false;
                            primo = true;
                        }
                        if (contador != 2 && numero % 2 == 0) {
                            impar = false;
                            par = true;
                            primo = false;
                        }

                        if (par == true && primo == true) {
                            System.out.println("El numero es par y primo");
                        }
                        if (impar == true && primo == false) {
                            System.out.println("El numero es impar");
                        }
                        if (impar == true && primo == true) {
                            System.out.println("El numero es impar y primo");
                        }
                        if (par == true && primo == false) {
                            System.out.println("El numero es par ");
                        }
                    }
                    break;

                case 2:

                    System.out.println("Ingrese la precision del calculo");
                    double numero2 = leer.nextInt();

                    double i = 1;
                    double total = 1;

                    while (i <= numero2) {
                        double num = (4 * (i * i)) - 1;
                        double denom = (4 * (i * i));
                        total = total * (denom / num);
                        i = i + 1;

                    }

                    System.out.println("PI:" + total * 2);
                    break;

                case 3:
                    System.out.println("ingrese un numero A");
                    int numeroA = leer.nextInt();
                    System.out.println("ingrese un numero B");
                    int numeroB = leer.nextInt();
                    int numA = numeroA;
                    int numB = numeroB;

                    while (numeroA != numeroB) {
                        if (numeroA < 0 && numeroB < 0) {
                            System.out.println("Los numeros ingresados deben ser positivos");
                        }
                        if (numeroA > numeroB) {
                            numeroA = numeroA - numeroB;
                        } else {
                            numeroB = numeroB - numeroA;
                        }
                    }

                    System.out.println(" El MCD de " + numA + " Y " + numB + " es " + numeroA);

                    break;

                case 4:
                    seguir = false;

            }
        }
    }

}
