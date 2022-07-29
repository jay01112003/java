import java.util.Scanner;
class Fac
{  
public static void main(String args[])
{  
Scanner a=new Scanner(System.in);
System.out.println("Enter number : ");
int number=a.nextInt();
int i,fact=1;
for(i=1;i<=number;i++){    
fact=fact*i;    
}    
System.out.println("Factorial of "+number+" is: "+fact);    
}  
}  