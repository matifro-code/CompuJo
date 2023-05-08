import java.util.Scanner;

public class Tipos_de_string {

	public static void main(String[] args) {
	
		Scanner miobjeto;
		
		byte edad; // Esto es un comentario		
		edad=28;
		
		String mi_nombre=("Matias");
		
		String mi_apellido=("Frosasco");
		
		int cadena=mi_nombre.length();
		
		int posicion=mi_nombre.charAt(3);
		
		char inicial=('F');
		
		int ultima_letra=mi_apellido.length();
		
		
		System.out.print("Mi nombre es "+ mi_nombre+ " y mi edad es de ");
		System.out.println(edad + " , mi apellido empieza con "+ inicial);
		System.out.println("Mi nombre tiene " + cadena + " caracteres y en la posicion 2 esta la letra " +posicion );
		
		//buenas practicas de length
		
		System.out.println("Mi nombre tiene " + mi_nombre.length() + " caracteres");
		System.out.println("Mi apellido empieza con " + mi_apellido.charAt(0));
		System.out.println("La penultima letra de mi apellido es la " + mi_apellido.charAt(ultima_letra-1));

		String frase="En este momento estoy aprendiendo Java";
		String frase_resumen=(String)frase.substring(0, 21) + " escuchando musica";
		
		System.out.println(frase_resumen);
		
		//verificar dos palabras o textos que sean iguales
		
		String alumno1, alumno2, alumno3;
		alumno1 = "Matias";
		alumno2 = "Lucas";
		alumno3 = "Lucas";
		
		System.out.println( "Matias y Lucas son iguales? " + alumno1.equals(alumno2));
		System.out.println( "Los nombres " + alumno2+  " y " + alumno3+ " son iguales? " + alumno2.equals(alumno3));
		
		// equalsIgnoreCase es lo mismo que equals, solo que no distingue mayusculas
		

		
	}

	
}
