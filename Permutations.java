import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	public static void permutation(StringBuilder str,int index,List<String> res)
	{
		if(index==str.length())
		{
			if(!res.contains(str.toString()))
			{
				res.add(str.toString());
			}

			return;
		}
		
		for(int i=index;i<str.length();i++)
		{
			swap(str,index,i);
			
			permutation(str,index+1,res);
			swap(str,index,i);
		}
	}
	
	public static void swap(StringBuilder str,int index,int i)
	{
	    char temp=str.charAt(index);
	    str.setCharAt(index, str.charAt(i));
	    str.setCharAt(i, temp);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="XY";
		StringBuilder str=new StringBuilder(s);
		List<String> res=new ArrayList<>();
       permutation(str,0,res);		
       
       for(String k:res)
       {
    	   System.out.print(k+" ");
       }

	}

}
