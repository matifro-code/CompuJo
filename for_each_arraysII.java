import javax.swing.JOptionPane;
public class for_each_arraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String [] paises = {"España", "Cuba", "Brasil", "Portugal", "Mexico"};*/
		
		
		/*for (int i=0; i<paises.length; i++){
			
			System.out.println("Pais " + (i+1) + " "+ paises[i]);
		}*/
		
		String [] paises=new String[5];
		
		for( int i =0; i<5; i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce un pais "+ (i+1) );
			
		}
		
		for (String elemento:paises) {
			 System.out.println("El pais "  + elemento);	 
		}
		
	}

}
