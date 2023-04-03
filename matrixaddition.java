import java.util.Scanner;

class Matrixadd{
	public static void main(String[] args){
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the two matrices:");
		int m=t.nextInt();
		int n=t.nextInt();
		int[][]	matrix1=new int[m][n];
		System.out.println("Enter the elements to the first matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int element=t.nextInt();
				matrix1[i][j]=element;
			}
		}

		int[][] matrix2=new int[m][n];
		System.out.println("Enter the elements to the second matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int element1=t.nextInt();
				matrix2[i][j]=element1;
			}
		}
		int[][] sum=new int[m][n];
		System.out.println("The sum of the two matrices are:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
	}
}
