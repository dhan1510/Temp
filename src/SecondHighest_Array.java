
public class SecondHighest_Array {

	public static void main(String[] args) 
	{
		int array[]= {1,5,9,3,2};
		
		int len=array.length;
		
		int i,high=array[0];
		
		for( i=0;i<len;i++)
		{
			
				if(array[i]>high)
				{
					high=array[i];
				}
			
			
			//System.out.println("Highest num="+array[i]);
		}
		System.out.println("Highest num="+high);
		
	//	System.out.println("Second Highest num=");
		
		secondhigh();
	}
	
	public static void secondhigh()
	{
		int temp,i;
		int a[]= {1,5,9,3,2};
		int len=a.length;
				
		for ( i=0;i<=len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if (a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("Second Highest number = "+a[len-2]);
	}
	
	
	
	
	

}
