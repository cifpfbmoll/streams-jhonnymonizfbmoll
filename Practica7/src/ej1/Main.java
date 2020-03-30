package ej1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.*;

public class Main {
	 public static void main(String[] args) {
		 Scanner option=new Scanner(System.in);
			int opcion = 0;
			while(opcion !=4) {
				System.out.println("==============================================");
				System.out.println("1) Lectura y escritura del fichero de cartelera byte a byte (byte Streams).");
				System.out.println("2) Lectura y escritura de fichero de cartelera carácter a carácter (character Streams).");
				System.out.println("3) Lectura y escritura de fichero línea a línea con buffers (character Streams).");
				System.out.println("4) Salir.");
				opcion=option.nextInt();
				switch (opcion) {
				case 1:
					lecturaEscrituraByte();
					break;
				case 2:
					lecturaEscrituraCaracter();
					break;

				default:
					break;
				}
	    }
	 
	 }
	 
	 public static void lecturaEscrituraByte() {

		  int i;
		  int posi=0;
		  String inicio;
		  String destino;
		  ArrayList<String> posicion = new ArrayList<>();
		  posicion.add("Titulo: ");
		  posicion.add("Año: ");
		  posicion.add("Director: ");
		  posicion.add("Duracion: ");
		  posicion.add("Sinopsis: ");
		  posicion.add("Reparto: ");
		  posicion.add("Sesion: ");
		  Scanner entrada=new Scanner(System.in);
		  System.out.println("Direccion del archivo de entrada: ");
		  inicio = entrada.nextLine();
		  System.out.println("Direccion del archivo de destino: ");
		  destino = entrada.nextLine();
		  
		  
		        try (FileInputStream fin = new FileInputStream(inicio);
		                FileOutputStream fout = new FileOutputStream(destino)) {
		        	String text = "==========================";
		        	String saltolinea = "\r\n";
		        	String titulo = "Cartelera de CineFBMoll";
		        	byte[] titu = titulo.getBytes();
		        	byte[] mybytes=text.getBytes();
		        	byte[] salto=saltolinea.getBytes();
                	fout.write(mybytes);
                	fout.write(salto);
                	fout.write(titu);
                	fout.write(salto);
                	fout.write(mybytes);
                	fout.write(salto);
		            do {
		                i = fin.read();
		                if (i != -1) {		
		                	if(i==35 || i == 123 ) {
		                		if(i==123) {
		                			posi=0;
		                		}
		                		fout.write(salto);
		                		byte[] parte = posicion.get(posi).getBytes();
		                		fout.write(parte);
		                		System.out.println(parte);
		                		++posi;
		                		
		                		
		                		
		                	}
		                	if(i != 35  && i != 123 ) {
				                System.out.println(i);
			                    fout.write(i);
		                	}
		                }
		            } while (i != -1); 
		            
		        } 
		        catch (IOException exc) {
		            System.out.println("Error al leer el archivo");
		            System.out.println(exc.getMessage());
		        }
	 }

	 public static void lecturaEscrituraCaracter() {
		 int i;
		  int posi=0;
		  String inicio;
		  String destino;
		  ArrayList<String> posicion = new ArrayList<>();
		  posicion.add("Titulo: ");
		  posicion.add("Año: ");
		  posicion.add("Director: ");
		  posicion.add("Duracion: ");
		  posicion.add("Sinopsis: ");
		  posicion.add("Reparto: ");
		  posicion.add("Sesion: ");
		  Scanner entrada=new Scanner(System.in);
		  System.out.println("Direccion del archivo de entrada: ");
		  inicio = entrada.nextLine();
		  System.out.println("Direccion del archivo de destino: ");
		  destino = entrada.nextLine();
		  	FileReader inputStream = null;
		  	FileWriter outputStream = null;
		  	
		  		  
		  	try {
		  		try {
					inputStream = new FileReader(inicio) ;
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		  		try {
					outputStream = new FileWriter(destino);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  	} finally {
		  		
				
			} 
		  	
		  	
		 
		 
		 
	 }
}
