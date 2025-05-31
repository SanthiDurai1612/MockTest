
public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {24,78,90,100};
		int firstmax=Integer.MIN_VALUE;
		int secondmax=firstmax;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>firstmax)
			{
				int temp=firstmax;
				firstmax=arr[i];
				secondmax=temp;
			}
			if(arr[i]<firstmax && arr[i]>secondmax)
			{
				secondmax=arr[i];
			}
			
		}
		
		System.out.print(secondmax);

	}

}
