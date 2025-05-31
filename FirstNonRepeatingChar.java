
import java.util.*;
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="santhiselvam";
		
		Map<Character,Integer> map=new HashMap<>();
		
       for(int i=0;i<str.length();i++)
       {
    	   if(!map.containsKey(str.charAt(i)))
    	   {
    		   map.put(str.charAt(i), 1);
    	   }
    	   else
    	   {
    		   int count=map.get(str.charAt(i));
    		   map.put(str.charAt(i), count+1);
    	   }
    		   
       }
       boolean flg=false;
       for(int i=0;i<str.length();i++)
       {
    	   if(map.containsKey(str.charAt(i)))
    	   {
    		   if(map.get(str.charAt(i))==1)
    		   {
    			   System.out.print(str.charAt(i));
    			   flg=true;
    			   break;
    		   }
    	   }
       }
       if(!flg)
       {
    	   System.out.println("-1");
       }
	}

}
