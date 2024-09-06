class plate
{
	double length,width;
	plate(double length,double width)
	{
	 this.length=length;
	 this.width=width;
	 System.out.println("Length and width has been set from plate constructor");
	}
    }
    class box extends plate
    {
     double height;
     box(double length,double width,double height)
     {
      super(length,width);
      this.height=height;
      System.out.println("Height has been set from box constructor");
     }
  }
  class woodbox extends box 
 {
  double thick;
  woodbox(double length,double width,double height,double thick)
  {
   super(length,width,height);
   this.thick=thick;
   System.out.println("Thick has been set from woodbox constructor");
  }
  public void display()
  {
   System.out.println("Length: "+length);
   System.out.println("Width: "+width);
   System.out.println("Height: "+height);
   System.out.println("Thick: "+thick);
  }
}
public class Q2
{
	public static void main(String[] args)
	{
	 woodbox wb=new woodbox(2.4,5.6,7.8,8.8);
         wb.display();
	}
    }
