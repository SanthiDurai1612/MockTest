import java.util.ArrayList;
import java.util.List;

public class RottenOranges {
	
	public static int findrotten(int[][] grid,int time)
	{
		
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				if(grid[i][j]==2)
				{
					if(changefreshtorotten(i,j,grid))
					{
					time++;
					}
				}
			}
		}
		
		
	return time;
		
		
	}
	
	public static boolean changefreshtorotten(int row,int col,int[][] grid)
	{
		int flg=0;
		if(issafe(row,col+1,grid))
		{
			if(grid[row][col+1]==1)
			{
				grid[row][col+1]=2;
				flg=1;
			}
		}
		
		if(issafe(row,col-1,grid))
		{
			if(grid[row][col-1]==1)
			{
				grid[row][col-1]=2;
				flg=1;
				
			}
		}
		if(issafe(row+1,col,grid))
		{
			if(grid[row+1][col]==1)
			{
				grid[row+1][col]=2;
				flg=1;
			}
		}
		if(issafe(row-1,col,grid))
		{
			if(grid[row-1][col]==1)
			{
				grid[row-1][col]=2;
				flg=1;
			}
		}
		
		if(flg==1)
			return true;
		return false;
	}
	
	public static boolean issafe(int row,int col,int[][] grid)
	{
		if(row>=0 && row<grid.length && col>=0 && col<grid[0].length )
		{
			return true;
		}
		return false;
	}
	
	
	public static int isvalid(int[][] grid)
	{
		List<Integer> valid=new ArrayList<>();
		for(int[] rows:grid)
		{
			for(int val:rows)
			{
				valid.add(val);
			}
		}
		
		if(valid.contains(1))
		{
			return -1;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= { {2,1,1},
				{1,1,0},
				{0,1,1}
		};
		
		int time=0;
		int res1=findrotten(grid,time);
		int res=isvalid(grid);
		
		if(res==1)
		{
			System.out.print(res1);
		}
		else
		{
			System.out.print(res);
		}
	
		

	}

}
