package AlgoCalisma6;

public class Calisma52 
{

	public static void main(String[] args) 
	{
		int [][] a = { {1, 2 , 3} , {4 , 5 , 6 } , {7 , 8 , 9} , {10 , 11 , 12} };
		int [][] b = { {1, 2 , 3} , {4 , 5 , 6 } , {7 , 8 , 9} , {10 , 11 , 12} };
		int [][] c = new int [4][3] ;
		for(int i = 0 ; i < 4 ; i++)
		{
			
			for(int j = 0 ; j < 3 ; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
