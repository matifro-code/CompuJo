import java.util.Scanner;
public class Variables {

	public static void main(String[] args) {
		
		byte edad; // Esto es un comentario		
		edad=28;
		
		Scanner s=new Scanner(System.in);
		System.out.print("Introduce tu nombre" );
	
		String mi_nombre=s.nextLine(); 
		
		int cadena=mi_nombre.length();
		char posicion=mi_nombre.charAt(3);
		char inicial=('F');
		System.out.print("Mi nombre es "+ mi_nombre+ " y mi edad es de ");
		System.out.println(edad + " y mi apellido empieza con "+ inicial);
		System.out.println("Mi nombre tiene " + cadena + " caracteres y en la posicion 2 esta la letra " + posicion );
		
		int num1 = 15;
		// el signo de exclamacion significa que no utilice dicha variable
		final double pi= 3.144598;
		double num2 =460;
		int num3= 5;
		
		/* esto es un comnetario
		 * aca sigue el comentario y fianliza aca */
		
		double resultado=Math.pow(4,5);
	    double sum=(num1+num2+resultado);
	    double div=(num2/num1);
	    int redondeo=(int)Math.round(div);
	    int    mult= (num1*num3);
	    double raiz=Math.sqrt(144);
	    
	    System.out.println("4 elevado a la 5 es = "+ resultado);
	    System.out.println("La suma de 15 + 460 + "+resultado+ " es = "+ sum);
	    System.out.println("Si divido 460 y 15 me da = " + div);
	    System.out.println("El numero anterior redondeado es = "+redondeo);
	    System.out.println("Si multiplico 15 por 5 es = "+ mult);
	    System.out.println("La raiz cuadrada de 144 es = "+ raiz);
	    
	    
		
		
		
		
		
		

	}

}
