
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[] arr= {0,1,3,4,5};
		int total=(n*(n+1)) / 2;
		int sum=0;
		for(int num:arr)
		{
			sum+=num;
		}
		
		int miss=total-sum;
		
		if(miss==0 && arr.length<n)
		{
			System.out.println("0");
		}
		else
		{
		System.out.println(miss);
		}

	}

}
