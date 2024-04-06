package clase03_04_2024;

import java.util.Scanner;

import clase03_04_2024.model.Alumno;
import clase03_04_2024.model.Materia;
import clase03_04_2024.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese el Legajo del Alumno: ");
		Integer legajo = scanner.nextInt();
		
		System.out.println("Ingrese el Apellido del Alumno");
		String apellido = scanner.next();
		
		System.out.println("Ingrese el Nombre del Alumno");
		String nombre = scanner.next();		
		
		
		alumno1.setLegajo(legajo);
		alumno1.setApellido(apellido);
		alumno1.setNombre(nombre);
		
		System.out.println(alumno1.toString());
		
		int numMaterias = 1;
		
		while(numMaterias<=2) {
			System.out.println("Ingrese el Codigo de la Materia");
			String codigoMateria = scanner.next();
			
			
			System.out.println("Ingrese el Nombre de la Materia");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el Codigo del Registro de Nota");
			String codigoNota = scanner.next();
			
			
			System.out.println("Ingrese la Nota Final");
			Float notaFinal = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno1, materia, notaFinal);
			
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
		}
		System.out.println("Programa Finalizado");
		
	}

}
