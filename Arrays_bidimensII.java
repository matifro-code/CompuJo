
public class Arrays_bidimensII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = {
				{10,45,86,45,54},
				{1,55,75,23,4},
				{50,65,54,43,65},
				{15,65,78,89,78},
				
				
		};
		
		for (int[]fila:matrix){
			System.out.println();
			
			for (int z: fila) {
				
				System.out.print( z + " " );
			}
		}
	}

}
