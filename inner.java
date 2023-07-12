import java.util.Scanner;
class Student
{
int roll,mark;
String name;
void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name:");
name=sc.next();
System.out.println("Enter roll number:");
roll=sc.nextInt();
System.out.println("Enter Mark:");
mark=sc.nextInt();
}
class Sports
{
String spname;
int point;
void gets()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Sports name:");
spname=sc.next();
System.out.println("Enter Activity point:");
point=sc.nextInt();
}
void dis()
{
System.out.println("Student name:"+name);
System.out.println("Roll number:"+roll);
System.out.println("Mark:"+mark);
System.out.println("Sports Name:"+spname);
System.out.println("Activity point:"+point);
}
}
}
class Main
{
public static void main(String args[])
{
Student s1=new Student();
Student.Sports s2=s1.new Sports();
s1.get();
s2.gets();
s2.dis();
}
}
