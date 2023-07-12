import java.util.Scanner;
class Complex
{
int i,r;
Complex(int r,int i)
{
this.r=r;
this.i=i;
}
Complex add(Complex c1,Complex c2)
{
Complex sum=new Complex(0,0);
sum.r=c1.r+c2.r;
sum.i=c1.i+c2.i;
return sum;
}}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of r1:");
int r1=sc.nextInt();
System.out.println("Enter value of r2:");
int r2=sc.nextInt();
System.out.println("Enter value of i1:");
int i1=sc.nextInt();
System.out.println("Enter value of i2:");
int i2=sc.nextInt();
Complex c1=new Complex(r1,i1);
Complex c2=new Complex(r2,i2);
Complex sum=new Complex(0,0);
sum=sum.add(c1,c2);
System.out.println("sum:"+sum.r+"+"+sum.i+"i");
}
}
