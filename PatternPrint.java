import java.util.ArrayList;
import java.util.List;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		int noofrow=n/2;
		int noofcol=n;
		char[][] arr=new char[n][n+1];
		int finalrow=n-1;
		int finalcol=n;
		int noofstars=(n+1)/2;
		for(int i=0;i<=noofrow;i++)
		{
		    finalcol=n;
			for(int j=0;j<noofstars;j++)
			{
				
				arr[i][j]='*';
				arr[i][finalcol]='*';
				arr[finalrow][j]='*';
				arr[finalrow][finalcol]='*';
				
				finalcol--;
				
			}
			noofstars--;
			finalrow--;
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
