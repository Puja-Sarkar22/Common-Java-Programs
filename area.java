import java.util.*;
class area
{
	void findarea(double a)
	{
	 double z = 3.14 * a * a;
	 System.out.println("Area of circle with radius "+a+" is : " +z);
	}
	void findarea(float a,float b,float c)
	{
	 double tmp = (a + b + c);
	 double s = tmp/2;
	 double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	 System.out.println("Area of triangle with length of sides "+a+" , " +b+ " and " +c+" is : "+triarea);
	}
	void findarea(float a)
	{
	 System.out.println("Area of sqaure with side "+a+" is : " + a*a);
	}
	public static void main(String args[])
	{
	 area d = new area();
	 Scanner sc = new Scanner(System.in);
	 System.out.print("\n Find area of \n 1. Circle \n 2. Triangle \n 3. Square \n\nSelect a choice : ");
 	 int choice = sc.nextInt();
	 switch(choice)
	 {
	  case 1:
	  System.out.print("\nEnter the Radius : ");
	  double a = sc.nextDouble();
	  d.findarea(a);
	  break;
	  case 2:
	  System.out.print("\nEnter the length of first side : ");
	  float x = sc.nextFloat();
	  System.out.print("\nEnter the length of second side : ");
	  float y = sc.nextFloat();
	  System.out.print("\nEnter the length of third side : ");
	  float z = sc.nextFloat();
	  d.findarea(x,y,z);
	  break;
	  case 3:
	  System.out.print("\n Enter the side : ");
	  float r = sc.nextFloat();
	  d.findarea(r);
	  break;
	  default:
	  System.out.println("Invalid choice");
	 }
      }
  }
	  
	  
