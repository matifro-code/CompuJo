import java.util.Scanner;

public class entrada_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre ");
		
		String nombre= entrada.nextLine();
		
		System.out.println("Bienvendi@ "+ nombre + " ahora introduce tu edad ");
		
		int edad = entrada.nextInt();
		
		System.out.println("De aca a 10 años tendras "+ (edad+10) +" años");
	}

}
