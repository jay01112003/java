import java.util.Scanner;
class Rev
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter number : ");
int num=a.nextInt();
int reversed = 0;
System.out.println("Original Number: " + num);
while(num != 0)
{
int digit = num % 10;
reversed = reversed * 10 + digit;
num /= 10;
}
System.out.println("Reversed Number: " + reversed);
}
}