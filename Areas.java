import java.util.Scanner;
import javax.swing.JOptionPane;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Elige la figura para obtener su area : \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		int figura=s.nextInt();
		
		switch (figura){
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El area del cuadrado es "+ Math.pow(lado, 2));
			
			break;
			
		case 2:
			int base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
			int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
			
			System.out.println("El area del rectangulo es " + base*altura);
			
			break;
			
		case 3:
			 base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base ")); 
			 altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
			 
			 System.out.println("El area del triangulo es " + (base*altura)/2);
			
			 break;
			 
		case 4:
			 double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio "));
			 
			 System.out.print("El area del circulo es de ");
			 System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			 
			 break;
			 
		default:
	        System.out.println("La opcion no es correcta");
			
			
		}
	}

}
