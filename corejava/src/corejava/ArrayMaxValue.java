package corejava;

public class ArrayMaxValue {
   
	
	public static void main(String args[])
	{
		int a[]={35,49,45,459};
		int b[]={15,7,5};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if (a[i]%b[j]==0)
				{
					System.out.println(a[i]+ "is divisible with" +b[j] );
				}
			}
		}
		
		
	}
}
