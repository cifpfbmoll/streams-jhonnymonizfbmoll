package Ej1;
import java.util.*;

public class menu {        
	            
	public static void main(String[] args) {
		ArrayList <Pelicula> peliculas = new ArrayList<Pelicula>();

		 int i=0;
		  int id=0;
		  while (i < peliculas.size()) {
			  id=i+1;
			  System.out.println("Id Pelicula: "+ id + peliculas.get(i).getPeliId());
			  System.out.println("Titulo de la pelicula: "+peliculas.get(i).getTitulo());
			  System.out.println("Director de la pelicula: "+peliculas.get(i).getDirector());
			  System.out.println("Duracion: "+peliculas.get(i).getDuracion());
			  System.out.println("Genero de la pelicula: "+peliculas.get(i).getGenero());
			  System.out.println("Año de estreno: "+peliculas.get(i).getAño());
			  System.out.println("Disponibilidad: "+peliculas.get(i).getDisponibilidad());
			  System.out.println("Copias: "+peliculas.get(i).getCopias());
			  System.out.println("Copias reservadas: "+peliculas.get(i).getReservadas());
			  System.out.println("====================================================");
			  i++;
		  }    
		  
		int numero=0;
		while(numero<1) {
			peliculas.add(Pelicula.agregarPelicula());
			Pelicula pelicula = peliculas.get(0);
			System.out.println(pelicula.getPeliId());

		int opcion = 0;
		while(opcion !=4) {
			System.out.println("==============================================");
			System.out.println("1) Añadir pelicula.");
			System.out.println("2) Reservar pelicula.");
			System.out.println("3) Buscar pelicula.");
			System.out.println("4) Salir.");
			Scanner option=new Scanner(System.in);
			opcion=option.nextInt();
			switch (opcion) {
			case 1:
				peliculas.add(Pelicula.agregarPelicula());
				break;
			case 2:
				listarPeliculas(peliculas);
				reservarPelicula(peliculas);
				break;	
			case 3:
				System.out.println("==============================================");
				System.out.println("1) Por Titulo.");
				System.out.println("2) Por Director.");
				System.out.println("3) Por Duracion.");
				System.out.println("4) por Genero.");
				System.out.println("5) por Año.");
				int busqueda;
					Scanner option2=new Scanner(System.in);
					busqueda=option2.nextInt();
					switch (busqueda) {
					case 1:
						String titulo;
						System.out.println("Dime el titulo de la pelicula que desea buscar: ");
						Scanner titulos=new Scanner(System.in);
						titulo=titulos.nextLine();
						//for(int i=0;i<peliculas.size();i++){
							
					      //  if(nom == nombres[n]){
					        //   System.out.println("dato encontrado");
					        //}else{
					         //System.out.println("no encontrado");
					        //}break;
					      //}
						//break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
	
	
	
	
					default:
						break;
					}
				break;
			default:
				
				break;
			}

	}
}
	
		public static void listarPeliculas(ArrayList<Pelicula> peliculas) {
		  int i=0;
		  int id=0;
		  while (i < peliculas.size()) {
			  id=i+1;
			  System.out.println("Id Pelicula: "+ id + " ");
			  System.out.println("Titulo de la pelicula: "+peliculas.get(i).getTitulo());
			  System.out.println("Director de la pelicula: "+peliculas.get(i).getDirector());
			  System.out.println("Duracion: "+peliculas.get(i).getDuracion());
			  System.out.println("Genero de la pelicula: "+peliculas.get(i).getGenero());
			  System.out.println("Año de estreno: "+peliculas.get(i).getAño());
			  System.out.println("Disponibilidad: "+peliculas.get(i).getDisponibilidad());
			  System.out.println("Copias: "+peliculas.get(i).getCopias());
			  System.out.println("Copias reservadas: "+peliculas.get(i).getReservadas());
			  System.out.println("====================================================");
			  i++;
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