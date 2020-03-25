import java.util.*;

public class P1E7 {

    public static void metodo1() {

        int arr[]=new int [5]; 
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
                System.out.println("Escriba un numero: ");
                arr[i]=sc.nextInt();
            }
        sc.close();
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
            }
        }

    public static void metodo2() {

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
    public static void metodo3() {

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
        
    public static void metodo4() {

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
        public static void metodo5() {

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
            public static void metodo6() {

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

        public static void main(String[] args) {

            System.out.println("1.-Ejercicio 1.");
            System.out.println("2.-Ejercicio 2.");
            System.out.println("3.-Ejercicio 3.");
            System.out.println("4.-Ejercicio 4.");
            System.out.println("5.-Ejercicio 5.");
            System.out.println("6.-Ejercicio 6.");
            Scanner options = new Scanner(System.in);
            
            int option = options.nextInt();
            switch (option) {
                case 1:
                metodo1();
                break;
                case 2:
                metodo2();
                break;
                case 3:
                metodo3();
                break;
                case 4:
                metodo4();
                break;
                case 5:
                metodo5();
                break;
                case 6:
                metodo6();
                break;
                
            }


            options.close();
          
        
        }   
            
      
}
        