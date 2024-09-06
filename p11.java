import java.util.*;
public class p11
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	int i,j,row,col,s=0;
	System.out.printf("Enter the number of rows : ");
	row = sc.nextInt();
	System.out.printf("Enter the number of columns : ");
	col = sc.nextInt();
	int[][] m = new int[row][col];
	System.out.println("Enter the elements of the matrix : ");
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
	  {
	   m[i][j] = sc.nextInt();
	  }
	}
	System.out.println("The elements of the matrix : ");
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
	  {
	   System.out.print(m[i][j]+"\t");
	  }
	 System.out.println(" ");
        }	
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
	  {
	   if(i==j)
	   {
	    s = s + m[i][j];
	   }
	 }
       }
	System.out.printf("Sum of Diagonal elements of the matrix = "+s);
     }
  }