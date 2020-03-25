/*    Leer los datos correspondientes a dos series de 12 elementos numéricos, y
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3
de la B, etc.*/
import java.util.*;

public class P1E6 {

    public static void main(final String[] args) {
        int arr[] =new int [12];
        int arr2[] =new int[12];
        int arr3[] =new int[24]; 
        int aux1 = 0;
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<12; i++){
            System.out.println("Escriba un numero para la primera tabla: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<12; i++){
            System.out.println("Escriba un numero para la segunda tabla: ");
            arr2[i]=sc.nextInt();
        }
        sc.close();  
        
        for(int i=0;i<4; i++){

            for(int j=i*3;j<=i*3+2;j++){
                arr3[aux1]= arr[j];
                aux1++;
            }
            
            for(int j= i*3;j<=i*3+2;j++){
                arr3[aux1]= arr2[j];
                aux1++;
                
            }
            
        }
       for(int i=0; i<24; i++){
        System.out.println(arr3[i]);
       }
        
    }

}        