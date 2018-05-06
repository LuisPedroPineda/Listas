/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Scanner;

/**
 *
 * @author luisp
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        lista lista1=new lista();
        int opcion=0;
       do{
           System.out.println("Elija una opcion");
           System.out.println("1. Ingresar un nodo");
           System.out.println("2. Mostrar la lista");
           System.out.println("3. Buscar en la lista");
           System.out.println("4. Modificar");
           System.out.println("5. Tamaño");
           System.out.println("6. Salir");
           opcion=teclado.nextInt();
          switch(opcion){
              case 1:
                  System.out.println("Ingrese un nodo");
                  int dato=teclado.nextInt();
                  lista1.ingresar(dato);
                  break;
                 
              case 2:
                  System.out.println("Mostar lista");
                  lista1.mostrar();
                  break;
              case 3:
                  System.out.println("Buscar"); 
                  System.out.println("Ingrese un ndato a buscar");
                  int dato3=teclado.nextInt();
                  lista1.buscar(dato3);
                  break;
                  case 5:
                  System.out.println("Tamaño"); 
                  lista1.tamaño();
                  
                  break;
              case 4:
                  System.out.println("Ingrese el dato a modificar");
                  int dato4=teclado.nextInt();
                  lista1.modificar(dato4);
          }
       } 
           while(opcion!=6);
       
    }
    
}
