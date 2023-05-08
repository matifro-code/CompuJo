import javax.swing.*;
public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad por favor");
	
		System.out.println("Hola " + nombre_usuario + ".El año que viene tendras " + (edad+1) + " años.");
	
	}

	

}
