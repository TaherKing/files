import java.util.Scanner;
class  FebonacciP3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n1=0;
		int n2=0;
		int n3=1;
		if(num>0)
		{
			for(int i=1;i<num;i++)
			{
				System.out.println(n3+ "  ");
				n1=n2;
				n2=n3;
				n3=n1+n2;
			}
			
		}
	}
}