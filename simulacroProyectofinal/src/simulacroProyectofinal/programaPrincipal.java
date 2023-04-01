package simulacroProyectofinal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class programaPrincipal {

	public static void main(String[] args) throws IOException {
		
	
		ArrayList<Partido>listaPartidos=new ArrayList<Partido>();
		
		Partido unPartido;  // crea estos objetos para guardar los atributos del archivos txt
		
		Equipo unEquipo1;
		
		Equipo unEquipo2;
		
		String archivo= "C:\\Users\\BaGui\\eclipse-workspace\\simulacroProyectofinal\\archivos\\resultados.txt";
		
		for(String linea:Files.readAllLines(Paths.get(archivo))){
			
		String lineas[]= linea.split(" ");    //desde String archivo crea codigo para leer linea por linea los archivos txt  y el string lineas es un arreglo que sirve para marcar las posiciones de los datos del txt 
		
		unPartido=new Partido();   // creacion de objetos 
		
		unEquipo1=new Equipo();
		
		unEquipo2=new Equipo();
		
		
		
		unEquipo1.nombre=(lineas[0]);
		unEquipo2.nombre=(lineas[3]);
		unPartido.equipo1=(unEquipo1);
		unPartido.equipo2=(unEquipo2);
		unPartido.golesEquipo1=Integer.parseInt(lineas[1]);
		unPartido.golesEquipo2=Integer.parseInt(lineas[2]);
		
		

		
		
		
		listaPartidos.add(unPartido);
		
		}
		
		for(int i=0;i<listaPartidos.size();i++)	{
			
			JOptionPane.showMessageDialog(null,listaPartidos.get(i).equipo1.nombre+" "+listaPartidos.get(i).golesEquipo1+" "+listaPartidos.get(i).golesEquipo2+" "+listaPartidos.get(i).equipo2.nombre);
			
			
			
			
		
		
		
		
		
		
			
			
		}
		
		 // Aca vuelvo a repetir todo lo mismo para cargar los datos del archivo pronostico 
		
		ArrayList<Pronostico>listaPronosticos=new ArrayList<Pronostico>();   
		
       Pronostico unPronostico;
		
		Equipo Equipo1;
		
		Equipo Equipo2;
		
       String archivo2="C:\\Users\\BaGui\\eclipse-workspace\\simulacroProyectofinal\\archivos\\pronostico.txt";
		
		for(String linea:Files.readAllLines(Paths.get(archivo2))){
			
		String lineas[]= linea.split(" ");
		
        unPronostico=new Pronostico();
		
		Equipo1=new Equipo();
		
		Equipo2=new Equipo();
		
		
		Equipo1.nombre=(lineas[0]);
		Equipo2.nombre=(lineas[4]);
		unPronostico.equipo1=(Equipo1);
		unPronostico.equipo2=(Equipo2);
		unPronostico.ganaEquipo1=Integer.parseInt(lineas[1]);
		unPronostico.empate=Integer.parseInt(lineas[2]);
		unPronostico.ganaEquipo2=Integer.parseInt(lineas[3]);
		
		
		

		
		listaPronosticos.add(unPronostico);
		
		}
		
		for(int i=0;i<listaPronosticos.size();i++)	{
			
			JOptionPane.showMessageDialog(null,listaPronosticos.get(i).equipo1.nombre+" "+listaPronosticos.get(i).ganaEquipo1+" "+listaPronosticos.get(i).empate+" "+listaPronosticos.get(i).ganaEquipo2+" "+listaPronosticos.get(i).equipo2.nombre);
	
			
			
			listaPronosticos.get(i).equipo1.nombre = listaPartidos.get(i).equipo1.nombre;
			
			listaPronosticos.get(i).equipo2.nombre = listaPartidos.get(i).equipo2.nombre;
			
			//no se si se puede utilizar así para decirle por ejemplo que Argentina de ambos arraylist son lo mismo 
			
		
		
		
	}
		// El profesor dice que finalmente hay que comparar los datos de los dos archivos txt mediante los arrays list para lograr finalmente se muestre el puntaje obtenido segun los pronosticos de la persona 
		
		
		// me imagino que se compara con las estructuras IF y else pero no se como poner los archivos en el if para compararlos ya que son objetos del arrays list 
		
		
			
			
			
			
			
			
			
			
			
			}
		
	
	
}

