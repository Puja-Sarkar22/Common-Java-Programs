class twodimension
{
	public double x,y,cost;
	twodimension(double x,double y)
	{
	 this.x=x;
	 this.y=y;
	}
	public void setcost(double cost)
	{
	 this.cost=cost;
	}
	public double calculatearea()
	{
	 setcost(40*x*y);
	 return x*y;
	}
	public void showcost()
	{
	 System.out.println("The cost of the plastic is: Rs. "+cost);
	}
    }
    class threedimension extends twodimension
    {
     double z;
     threedimension(double x,double y,double z)
     {
      super(x,y);
      this.z=z;
     }
     public double calculatearea()
     {
      setcost(60*x*y*z);
      return x*y*z;
     }
  }
  public class l1
  {
   public static void main(String[]args)
   {
    twodimension obj1 = new twodimension(2,4);
    obj1.calculatearea();
    obj1.showcost();
    threedimension obj2 = new threedimension(4,6,8);
    obj2.calculatearea();
    obj2.showcost();
   }
 }