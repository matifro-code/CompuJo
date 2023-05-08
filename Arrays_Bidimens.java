
public class Arrays_Bidimens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = new int [4] [5];
		
		matrix[0][0]=15;
		matrix[0][1]=43;
		matrix[0][2]=43;
		matrix[0][3]=65;
		matrix[0][4]=31;
		
		matrix[1][0]=18;
		matrix[1][1]=97;
		matrix[1][2]=54;
		matrix[1][3]=76;
		matrix[1][4]=32;
		
		matrix[2][0]=23;
		matrix[2][1]=35;
		matrix[2][2]=84;
		matrix[2][3]=86;
		matrix[2][4]=45;
		
		matrix[3][0]=46;
		matrix[3][1]=07;
		matrix[3][2]=86;
		matrix[3][3]=45;
		matrix[3][4]=12;
		
		/*System.out.print(matrix[2][3]);*/
		
		for (int i=0; i<4; i++ ) {
			System.out.println();
			for (int j=0; j<5; j++) {
				
				System.out.print(matrix[i][j]+"-");
			}
		}
	}
	

}
