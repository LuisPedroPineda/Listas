
package listas;

import java.util.Scanner;

public class lista {
    nodo primero;
    nodo ultimo;
    int dato;
    Scanner teclado=new Scanner(System.in);
    public lista(){
        primero=null;
        ultimo=null;
    }
    public void ingresar(int x){
        nodo nuevo=new nodo();
        nuevo.datos=x;
        if(primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            primero.anterior=ultimo;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
    }
        
        public void  mostrar(){
            nodo actual=new nodo();
            actual=primero;
            do{
                System.out.println(actual.datos);
            actual=actual.siguiente;
            }while(actual!=primero);
        }
         public void  tamaño(){
            nodo actual=new nodo();
            actual=primero;
            int contador=0;                    
            do{
                contador++;
            
            actual=actual.siguiente;
            }while(actual!=primero);
            System.out.println(contador);
        }
        
        public void buscar(int x){
            nodo actual=new nodo();
            actual=ultimo;
            
            boolean encontrado=false;
            
            do{
                if(actual.datos==x){
                    encontrado=true;
                    dato=actual.datos;
                }
                actual=actual.anterior;
            }while(actual!=ultimo);
            if(encontrado==true){
                System.out.println("Nodo encontrado");
                System.out.println(dato);
            }else{
                System.out.println("Nodo no encontrado");
            }
        }
        
         public void modificar(int x){
        nodo actual=new nodo();
        actual=primero;
       do{
           if(actual.datos==x){
               System.out.println("Ingrese un nuevo valor");
               actual.datos=teclado.nextInt();
           }
           actual=actual.siguiente;
       }while(actual!=primero);
    }
        
    }

