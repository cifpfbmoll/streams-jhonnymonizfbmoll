import java.util.*;

public class P1E3 {

    public static void main(String[] args) {
        int arrPositivos[]=new int [5]; 
        int arrNegativos[]=new int [5]; 
        int arrCeros[]=new int [5]; 
        int aux=0, aux2=0, aux3=0;
        Scanner sc=new Scanner(System.in); // Antes de la variable el tipo. System.in como puente entre la terminal y el programa
        for(int i=0;i<5; i++){
            System.out.println("Escriba un numero: ");
            int num = sc.nextInt();
            if (num > 0){
                arrPositivos[aux]=num;
                aux++;
            }
            else if (num < 0){
                arrNegativos[aux2]=num;
                aux2++;
            }
            else {
                arrCeros[aux3]=num;
                aux3++;
            }
            
        }
        sc.close();
        for(int i=0; i < arrPositivos.length; i++){
            if (arrPositivos[i] != 0){
                System.out.print(arrPositivos[i]);
            }
        }
        System.out.println();
        for(int i=0; i < arrNegativos.length; i++){
            if (arrNegativos[i] != 0){
                System.out.print(arrNegativos[i]);
            }
        }
        System.out.println();
        for(int i=0; i < arrCeros.length; i++){
            System.out.print(arrCeros[i]);
        }

    }

}