import java.util.Scanner;
class Areac
{
	double area;
	Areac(double r)
	{
	 area= (22*r*r)/7;
	}
}
class Areat
{
	double area;
	Areat(int ht,int bs)
	{
	 area= 2*ht*bs;
	}
}
class p5a 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius,base and height:");
      double rad= s.nextDouble(); 
      int h=s.nextInt();
      int b=s.nextInt();   
      Areac a=new Areac(rad);
      Areat c=new Areat(h,b);
      System.out.println("Area of Circle is: " + a.area);
      System.out.println("Area of Triangle is: " + c.area);      
   }
 }