/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_hazielpavon;

import java.util.Scanner; 

public class Lab3P1_HazielPavon {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in); 
       
            boolean seguir = true;
        
                while (seguir) { 

                    System.out.println (" 1.Serie Euclidiana");
                    System.out.println (" 2.pokebola "); 
                    System.out.println (" 3.ok boomer ");
                    System.out.println (" 4.Salir ");
                    int opcion = leer.nextInt(); 
                
                switch (opcion) { 
                    
                    case 1: 
                       
                        System.out.println ("cuantos puntos desea ingresar");
                        int puntos = leer.nextInt();
                        
                           double total = 0;
                           
                           int cont = 0; 
                           
                           while (puntos > 0 && cont < puntos ){ 
                            
                                if (opcion < 0){
                                System.out.println ("valor menor a 0"); 
                                seguir = false; 
                            }
                            
                                for (cont = 1; cont <= puntos; cont++) {  
                                   System.out.println ("Ingrese el valor de x"); 
                                   int x = leer.nextInt (); 
                                   System.out.println ("Ingrese el valor de y"); 
                                   int y = leer.nextInt ();

                                   
                                   int resta = x - y; 
                                   double totalg = Math.pow (resta, 2);   
                                    
                                   total = totalg + total;
                                  }
                                   double totalz = 0; 
                                   
                                   totalz = Math.sqrt (total); 
                                  
                                   System.out.println ("La distanmcia euclicidiana es: "+ totalz);
                                   
                           }


                        break; 
                        
                    case 2: 
                        
                    System.out.println ("Ingrese el valor de n"); 
                    int cuadrado = leer.nextInt ();
                      
                        for (int n = 0; n< cuadrado/2-1; n++){
                            for (int x=0; x<= cuadrado * 2 - 1; x++){
                                System.out.print (" * "); 
                            }  
                                if (n <= cuadrado/2+1) {
                                    System.out.print (" * "); 
                                }
                                
                                if (n <= cuadrado/2 + 2) {
                                    System.out.print (" # ");
                                }
                        }
                        
  
                        break; 
                    
                    case 3:
                        
                        System.out.println ("Ingrese su ano de nacimiento"); 
                        int edad = leer.nextInt(); 
                            
                            if (edad >= 1946 && edad <= 1959){ 
                                System.out.println ("Felicidades usted es un baby boomer");
                                
                            } else 
                            
                            if (edad >= 1960 && edad <= 1974){
                                System.out.println ("Felicidades usted es de la genereacion x");
                                
                            } else 
                                
                            if (edad >= 1975 && edad <= 1979){
                                System.out.println ("Felicidades usted es de la generacion de los xilenials");    
                                
                            } else 
                            
                            if (edad >= 1980 && edad <= 1989){
                            System.out.println ("Felicidades usted es de la generacion de los milenials");
                           
                            } else 
                                
                            if (edad >= 1990 && edad <= 2012){
                            System.out.println ("Felicidades usted es de la generacion de los gen z");
                            
                            } else 
                            if (edad >= 2012 && edad <= 2025){
                            System.out.println ("Felicidades usted es de la generacion de los gen z");
                            
                            } else 

                            System.out.println ("ingrese una edad valida");
                            
                    break; 
                        
                        
                    default: 
                           if (opcion > 3){ 
                            System.out.println ("salio del algoritmo"); 
                            seguir = false; 
                           } 
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }

            
        
            
            
            
        }
        
    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
