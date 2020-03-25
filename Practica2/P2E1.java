import java.util.*; 
//Crea un proyecto Java, y en el programa principal incluye un menú (con switch) que llame a los siguiente métodos. 
//Este menú debe permitir al usuario seleccionar el método que desea ejecutar, por tanto, 
//los siguientes ejercicios se incluirán en métodos (recuerda que el nombrado del método debe ser 
//representativo sobre la función que realiza).


public class P2E1 {
//Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: 
//la posición T[n,m] debe contener n+m. Después se debe mostrar su contenido
		public static void tablaBidimensional() {
			int arr[][] = new int[5][5];
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					arr[i][j]=i+j;
				}
			}
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.println(arr[i][j]);;
				}
			}

		    
		}
		
		public static void tablaSimetrica_o_no() {
//Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, 
//es decir, si se obtiene la misma tabla al cambiar filas por columnas.	
			int arr[][] = new int[4][4];
			int contador=0;
			int contador2=0;
			Scanner sc=new Scanner(System.in);
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					System.out.println("Escriba un numero para la tabla: ");
					arr[i][j]=sc.nextInt();
				}
			}
			boolean esSimetrica=true;
			while (esSimetrica == true && contador < arr.length ) {
				
				while(esSimetrica == true && contador2 < arr[contador].length) {
					if (arr[contador][contador2] !=  arr[contador2][contador])  {
						esSimetrica=false;
						
						}
					contador2++;
					}
				contador++;
				}
			if(esSimetrica==true) {
				System.out.println("Es simetrica");
			}
			else {
				System.out.println("No simetrica");
			}
		}
			
		
		
		
		public static void metodo3() {

		    
	    }
		
		public static void metodo4() {
		
		    
		}
		
		public static void metodo5() {
		
		     
		}
		
		
		    public static void main(String[] args) {
		
	            System.out.println("1.-Ejercicio 1.");
	            System.out.println("2.-Ejercicio 2.");
	            System.out.println("3.-Ejercicio 3.");
	            System.out.println("4.-Ejercicio 4.");
	            System.out.println("5.-Ejercicio 5.");
	            Scanner options = new Scanner(System.in);
	            
	            int option = options.nextInt();
	            switch (option) {
	            	case 1:
	            	tablaBidimensional();
	            	case 2:
	                tablaSimetrica_o_no();;
	                case 3:
	                metodo3();
	                case 4:
	                metodo4();
	                case 5:
	                metodo5();
	                
	            }


	            options.close();
	          
	        
	        }   
	            
	      
	}

