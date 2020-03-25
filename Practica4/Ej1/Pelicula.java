package Ej1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Pelicula {
	private static final int maximo_peliculas=3000;
	private static final AtomicInteger count = new AtomicInteger(0);
	private static int peliId;

	private String titulo;
	private String director;
	private int duracion;
	private String genero;
	private int año;
	private int disponibilidad;
	private int copias;
	private int reservadas;

	private static int total_peliculas=0;


	public Pelicula(String titulo, String director, int duracion, String genero, int año,
			int disponibilidad, int copias, int reservadas) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.año = año;
		this.disponibilidad = disponibilidad;
		this.copias = copias;
		this.reservadas = reservadas;
	}
	
	public Pelicula() {
		
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		año = año;
	}

	public int getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getCopias() {
		return copias;
	}

	public void setCopias(int copias) {
		this.copias = copias;
	}

	public int getReservadas() {
		return reservadas;
	}

	public void setReservadas(int reservadas) {
		this.reservadas = reservadas;
	}

	public static Pelicula agregarPelicula() {
		Scanner lector=new Scanner(System.in);

		peliId=count.incrementAndGet();

		System.out.println("Titulo de la pelicula: ");
		String Titulo=lector.nextLine();
    	System.out.println("Director de la pelicula: ");
		String Director=lector.nextLine();
		System.out.println("Duracion: ");
		int Duracion=Integer.parseInt(lector.nextLine());
		System.out.println("Genero de la pelicula: ");
		String Genero=lector.nextLine();
		System.out.println("Año de estreno: ");
		int año=lector.nextInt();
		System.out.println("Disponibilidad: ");
		int Disponibilidad=lector.nextInt();
		System.out.println("Copias: ");
		int Copias=lector.nextInt();
		System.out.println("Copias reservadas: ");
		int Reservadas=lector.nextInt();

		return new Pelicula(peliId,Titulo,Director,Duracion,Genero,año,Disponibilidad,Copias,Reservadas);
		
		if(total_peliculas+Copias<maximo_peliculas) {
			
			total_peliculas=total_peliculas+Copias;
			return new Pelicula(Titulo,Director,Duracion,Genero,año,Disponibilidad,Copias,Reservadas);
			
		}
		else{
			System.out.println("No puedes agregar esta cantidad de peliculas");
			System.out.println("==============================================");
			System.out.println("Vuelve a intentarlo");
			return null;
		}
	}
	public static void reservarPelicula(ArrayList<Pelicula> peliculas) {
		int numero;
		int numeroid;
		System.out.println("Id de la pelicula que desea reservar: ");
		Scanner lector=new Scanner(System.in);    
		numero=lector.nextInt();
		numeroid=numero-1;
		if ((numeroid>0) & (numeroid<peliculas.size())) {
			
			Pelicula pelicula = peliculas.get(numeroid);	
			if (pelicula.getDisponibilidad()-1>=0) {
				pelicula.setDisponibilidad(pelicula.getDisponibilidad()-1);
				System.out.println("Quedan "+ pelicula.getDisponibilidad() + " peliculas.");
				pelicula.setReservadas(pelicula.getReservadas()+1);
				System.out.println("Hay "+ pelicula.getReservadas() + " peliculas reservadas.");
			}
			else {
				System.out.println("No quedan peliculas con este Id.");
			}
			
		}
		else {
			System.out.println("La pelicula que busca no se encuentra disponible.");
		
	}
	
	}
}
