/* Leer 5 números y mostrarlos en orden inverso al introducido. */
import java.util.Scanner;

public class P1E2 {

    public static void main(String[] args) {
        int arr[]=new int [5]; 
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            System.out.println("Escriba un numero: ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=arr.length-1;i>=0; i--){
        System.out.println(arr[i]);
        }
        

    }

}