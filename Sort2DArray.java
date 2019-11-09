import java.util.Scanner;
class Sort2DArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of row and colum: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		
		System.out.println("Enter the value of array Now");
		//by this two loop we take a input from user
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {				
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Now print our 2D array: ");
		//by the help of this two arraya we print two out 2D array
		System.out.println("My matrix");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}