import java.util.Scanner;
class Maxofthree
{
	public static void main(String []args)
	{
		int a,b,c,Max,largest;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the three number:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Max=a>b?a:b;
		largest=c>Max?c:Max;
		
		System.out.println(Max+"is Max");
}
}