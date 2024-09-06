import java.util.*;
abstract class student
{
int roll;
long reg;
String course_n;
student(int roll,long reg)
{
this.roll=roll;
this.reg=reg;
}
abstract public void course(String course_n);
}
class kiitian extends student
{
kiitian(int roll,long reg)
{
super(roll,reg);
}
public void course(String course_n)
{
this.course_n=course_n;
}
public void details()
{
System.out.println("Roll no: "+roll);
System.out.println("Registration no: "+reg);
System.out.println("Course enrolled in: "+course_n);
}
}
public class Q1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your roll.no: ");
int roll = sc.nextInt(); 
System.out.println("Enter your reg.no: ");
long reg = sc.nextLong();
kiitian m = new kiitian(roll,reg);
m.course("Computer and Communication Engineering.");
m.details();
}
}