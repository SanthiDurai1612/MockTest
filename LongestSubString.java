import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubString {
	
	public static void longestsubstring(String s,List<Character> list)
	{
		List<List<Character>> res=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			if(!list.contains(s.charAt(i)))
	        {
				list.add(s.charAt(i));
			}
			else
			{
			
				if(list.size()>max)
				{
					max=list.size();
					res=Arrays.asList(list);
				}
				list=new ArrayList<>();
				list.add(s.charAt(i));
			}
			
		}
		if(list.size()>max)
		{
			max=list.size();
			res=Arrays.asList(list);
		}
		System.out.print(max+" "+res.get(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aaabcde";
		List<Character> list=new ArrayList<>();
		longestsubstring(s,list);

	}

}
