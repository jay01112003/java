import java.util.Scanner;
class Pal
{
	public static void main(String args[])
	{
	int n=1234, rev = 0, d;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number=");
	n = sc.nextInt();
	int n1 = n;
	while (n > 0)
	{
	d=n%10;
	rev=rev*10+d;
	n/=10;
	}
	if (n1==rev)
		System.out.println("Palindrom");
	else
		System.out.println("Not Palindrom");
}
}