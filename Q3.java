import java.util.*;
interface salary
{
void earning();
void deduction();
void bonus();
}
abstract class manager implements salary
{
double basic_sal;
manager(double basic_sal)
{
this.basic_sal=basic_sal;
}
public void earning()
{
System.out.println("Earning: Rs. "+String.format("%.2f",basic_sal+(basic_sal*0.95)));
}
public void deduction()
{
System.out.println("Deduction: Rs. "+String.format("%.2f",(basic_sal*0.12)));
}
abstract public void bonus();
}
class substaff extends manager
{
substaff(double basic_sal)
{
super(basic_sal);
}
public void bonus()
{
System.out.println("Bonus: Rs. "+String.format("%.2f",(basic_sal*0.5)));
}
}
public class Q3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the basic salary of the substaff: ");
double basic = sc.nextDouble();
sc.close();
substaff s=new substaff(basic);
s.earning();
s.deduction();
s.bonus();
}
}