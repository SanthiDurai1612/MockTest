package Game;
import java.util.*;
public class TraceAndFind {
	
	
	public static void finddestination(int[][] arr,List<Integer> obstacles,int start,int steps)
	{
		int startrow=0,startcol=0;
		
		for(int i=0;i<arr.length;i++)
		{
			boolean find=false;
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==start)
				{
					startrow=i;
					startcol=j;
					find=true;
					break;
				}
			}
			if(find)
				break;
		}
		
		
	
		int res=movesteps(arr,obstacles,startrow,startcol+1,steps,-1);
		
		
		if(steps>0)
			System.out.println("-1");
		else
			System.out.println(res);
	}
	
	public static int movesteps(int[][] arr,List<Integer> obstacles,int startrow,int startcol,int steps,int flg)
	{
		int nextrow=startrow;
		int nextcol=startcol;
		if(steps==0)
			
		{
			return arr[startrow][startcol];
		}
		
		while(issafe(arr,startrow,startcol) && !obstacles.contains(arr[startrow][startcol]))
		{
			nextrow=startrow;
			nextcol=startcol;
			steps--;
			if(steps==0)
			{
				return arr[startrow][startcol];
			}
			if(flg==0 || flg==-1)
			{
				startcol++;
			}
			else if(flg==1)
			{
				startcol--;
			}
			
		}
		 if(issafe(arr,nextrow+1,nextcol) && !obstacles.contains(arr[nextrow+1][nextcol]))
				return movesteps(arr,obstacles,nextrow+1,nextcol,steps,0);
		 else if(issafe(arr,nextrow-1,nextcol) && !obstacles.contains(arr[nextrow-1][nextcol]))
			return movesteps(arr,obstacles,nextrow-1,nextcol,steps,1);
	
		else
			return 0;
		
	
       
       
    
		
	}
	
	public static boolean issafe(int[][] arr,int row,int col)
	{
		if(row>=0 && row<arr.length && col>=0 && col<arr[0].length)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= { {1,2,3,4,5,6,7,8,9,10},
				{20,19,18,17,16,15,14,13,12,11},
				{21,22,23,24,25,26,27,28,29,30},
				{40,39,38,37,36,35,34,33,32,31},
				{41,42,43,44,45,46,47,48,49,50},
				{60,59,58,57,56,55,54,53,52,51},
				{61,62,63,64,65,66,67,68,69,70},
				{80,79,78,77,76,75,74,73,72,71},
				{81,82,83,84,85,86,87,88,89,90},
				{100,99,98,97,96,95,94,93,92,91}
				
		};
		List<Integer> obstacles=Arrays.asList(4,58,17,63,23,39,29);
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Starting Point & No of Steps: ");
		int start=in.nextInt();
		int steps=in.nextInt();
		
		finddestination(arr,obstacles,start,steps);
        
	}

}
