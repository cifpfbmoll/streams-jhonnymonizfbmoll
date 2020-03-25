/*  Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
último, el segundo, el penúltimo, el tercero, etc.*/
import java.util.Scanner;

public class P1E4 {

    public static void main(final String[] args) {
        final int arr[]=new int [10]; 
        final Scanner sc=new Scanner(System.in); /* fINAL para Constantes */
        
        for(int i=0;i<10; i++){
            System.out.println("Escriba un numero: ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<10; i++){
            System.out.println(arr[i]);
            System.out.println(arr[9-i]);
        }
    }
}        
    
