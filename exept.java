import java.util.Scanner;
class Except
{
   int a,b,c;
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a");
    int a=sc.nextInt();
    System.out.println("enter the value of b");
    int b=sc.nextInt();

    try
     {
       System.out.println("the sum of these two numbers:");
       int c= a/(a-b);
       System.out.println("sum c="+c);
     }
     catch(ArithmeticException e)
     {
       System.out.println("ArithymeticException:----"+e);
     }
    finally
     {
     System.out.println("finally block");
     }
   }
}
