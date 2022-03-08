package Abstract;
import java.util.Scanner;
public class Square extends Shapes {
	int area,side;
	public void GetData(Scanner scanner) 
	{
		System.out.println("i)Square..");
		//Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the side of square value = ");
		side=scanner.nextInt();
		scanner.nextLine();
		//scanner.close();
	}
	public void area()
	{
		area=side*side;
		System.out.println("The area of square is = "+area);
	}
	public void shape() 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=8; j++)
			{
				if(i==1 || i==5 || j==1 || j==8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}