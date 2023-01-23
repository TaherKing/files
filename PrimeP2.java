import java.util.Scanner;
class PrimeP2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number here");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=1;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
		
			if(count<=2)
			{
				System.out.println(i+"is prime number");
			}
			
		}
		
	
	}
}