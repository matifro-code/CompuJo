import javax.swing.*;
public class Bucles {

	public static void main(String[] args) {
		
		String clave="Mati";
		String paswo="";
		int intentos=0;
		
		while (clave.equals(paswo)==false){
			intentos++;
			paswo=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (clave.equals(paswo)==false); {
				System.out.println("La contraseña es incorrecta, vuelve a ingresar");
			}
			
		}
		System.out.println("Contraseña correcta, acceso permitido despues de " + intentos + " intentos.");
	}
		
}	
		