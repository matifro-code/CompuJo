import java.util.Scanner;
import javax.swing.JOptionPane;
public class operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner s =new Scanner(System.in);
	 
	 int num1=20;
	 int num2=4;
	 
	 System.out.println("Elige una operacion: \n1 Suma \n2 Resta \n3 Multi \n4 Division");
	 
	 int operacion=s.nextInt();
	
	 switch(operacion) {
	 
	 case 1: 
		 System.out.println(" El resultado es " + (num1+num2)+".");
		 break;
		 
	 case 2:
		 System.out.println(" El resultado es " + (num1-num2)+".");
		 break;
		 
	 case 3:
		 
		 System.out.println(" El resultado es " + (num1*num2)+".");
		 break;
	 case 4:
		 
		 System.out.println(" El resultado es " + (num1/num2)+".");
		 break;
	 	
	}
	
	 if (operacion>4){
		 System.out.println("No es una opcion valida");
	 }
	
	}
}
