package ej1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


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
				case 3:
					lecturaEscrituraBuffer();
					break;
				default:
					break;
				}
	    }
	 
	 }
	 
	 public static void lecturaEscrituraByte() {

		  int i;
		  int posi=1;
		  String inicio;
		  String destino;
		  String[] posicion = {"Titulo: ","Año: ","Director: ","Duracion: ","Sinopsis: ","Reparto: ","Sesion: "};
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
		        	String primer = "Titulo: ";
		        	byte[] titu = titulo.getBytes();
		        	byte[] mybytes=text.getBytes();
		        	byte[] salto=saltolinea.getBytes();
		        	byte[] pri = primer.getBytes();
                	fout.write(mybytes);
                	fout.write(salto);
                	fout.write(titu);
                	fout.write(salto);
                	fout.write(mybytes);
                	fout.write(salto);
                	fout.write(pri);
		            do {
		                i = fin.read();
		                if (i != -1) {		
		                	if(i==35 || i == 123 ) {
		                		if(i==123) {
		                			posi=0;
		                		}
		                		fout.write(salto);
		                		byte[] parte = posicion[posi].getBytes();
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
		 int texto;
		 int i=1;
		  String inicio;
		  String destino;
		  String[] posicion = {"Titulo: ","Año: ","Director: ","Duracion: ","Sinopsis: ","Reparto: ","Sesion: "};
		  Scanner entradas=new Scanner(System.in);
		  System.out.println("Direccion del archivo de entrada: ");
		  inicio = entradas.nextLine();
		  System.out.println("Direccion del archivo de destino: ");
		  destino = entradas.nextLine();
		  File entrada = new File(inicio);
		  File salida = new File(destino);
		  
		  try (FileReader fin = new FileReader(entrada);
	                FileWriter fout = new FileWriter(salida)) {	
			String text = "==========================";
	        String saltolinea = "\r\n";
	        String titulo = "Cartelera de CineFBMoll";
		  	  fout.write(text);
		  	  fout.write(saltolinea);
		  	  fout.write(titulo);
		  	  fout.write(saltolinea);
		  	  fout.write("Titulo: ");
			do {
	                texto = fin.read();
	                if (texto != -1) {
	     
	                	System.out.println(texto);
	                    if (Character.toString((char) texto).equals("#") || Character.toString((char) texto).equals("{")) {
	                    	if (Character.toString((char) texto).equals("{")) {
	                    		fout.write(System.getProperty( "line.separator" ));
	                    		i = 0;
	                    	}
	                        fout.write(System.getProperty( "line.separator" ));
	                        if (i >= 0 && i < 7) {
	                            for (int j = 0; j < posicion[i].length(); j++) {
	                                fout.write(posicion[i].charAt(j));
	                            }
	                        }
	                        i++;
	                    } else {
	                        fout.write(texto);
	                    }
	                }
	            } while (texto != -1);
	        } catch (IOException exc) {
	            System.out.println("Error al fin el archivo");
	            System.out.println(exc.getMessage());
	        }
	    }	  
		  	
		  	
		 public static void lecturaEscrituraBuffer(){
			  String inicio;
			  String destino;
			  String[] posicion = {"Titulo: ","Año: ","Director: ","Duracion: ","Sinopsis: ","Reparto: ","Sesion: "};
			  Scanner entradas=new Scanner(System.in);
			  System.out.println("Direccion del archivo de entrada: ");
			  inicio = entradas.nextLine();
			  System.out.println("Direccion del archivo de destino: ");
			  destino = entradas.nextLine();
			  File entrada = new File(inicio);
			  File salida = new File(destino);
			  
			        try (BufferedReader fin = new BufferedReader(new FileReader(entrada));
			                BufferedWriter fout = new BufferedWriter(new FileWriter(salida))) {
			        	boolean eof = false;
			            String lineaLeida; 
			            String[] peliculas; 
			            String[] texto; 
			            int i = 0; 
			            fout.append(posicion[i]); 
			            do {
			                lineaLeida = fin.readLine(); 
			                if (lineaLeida != null) {
			                    peliculas = lineaLeida.split("\\{");
			                    for (int j = 0; j < peliculas.length; j++) {
			                        texto = peliculas[j].split("#");
			                        for (int k = 0; k < texto.length; k++) {
			                            fout.append(texto[k]);
			                            fout.append(" ");
			                            if (k < texto.length - 1) {
			                                if (i == 3) {
			                      
			                                    fout.append("minutos");
			                                }
			                                fout.newLine();
			                                fout.append(posicion[i = (i + 1) % 7]);
			                            }
			                        }
			                        if (j < peliculas.length - 1) {
			                            fout.newLine();
			                            fout.newLine();
			                            fout.append(posicion[i = (i + 1) % 7]);
			                        }
			                    }
			                } else {
			                    eof = true;
			                }
			            } while (!eof);
			        }  catch (IOException ex) {
			            System.out.println("Error de lectura/escritura");
			        }
			    }

		 
	}


