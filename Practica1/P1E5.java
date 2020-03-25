/*   Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de
la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.*/
import java.util.Scanner;

public class P1E5 {

    public static void main(final String[] args) {
        int arr[]=new int [10]; 
        int arr2[]=new int [10];
        int arr3[]=new int [20]; 
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<10; i++){
            System.out.println("Escriba un numero para la primera tabla: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10; i++){
            System.out.println("Escriba un numero para la segunda tabla: ");
            arr2[i]=sc.nextInt();
        }
        sc.close();  
        
        for(int i=0;i<arr3.length / 2; i++){
            arr3[i*2]= arr[i];
            arr3[i*2+1]= arr2[i];   
        }
        for(int i=0;i<arr3.length; i++){
            System.out.println(arr3[i]);
        }  
    }

}        