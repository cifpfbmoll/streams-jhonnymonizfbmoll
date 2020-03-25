import java.util.Scanner;

public class P1E1 {

    public static void main(String[] args) {
        int arr[]=new int [5]; // Los vectores necesitn  ser especificados, su tamaño y el tipo de var que almacena.
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            System.out.println("Escriba un numero: ");
            arr[i]=sc.nextInt();
        }
        sc.close(); // Para cerrar la variabla "sc" . (Soluciona el error "...Never is closed")
        for(int i=0;i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        

    }

}