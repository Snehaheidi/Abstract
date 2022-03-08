package Abstract;
import java.util.Scanner;
public class Rectangle extends Shapes {
	int area =0,width = 0,length = 0;
	public void getdata(Scanner scanner)
	{   
		System.out.println("_____RECTANGLE______");
		//Scanner scanner=new Scanner(System.in);
		System.out.println("Length of Rectangle = ");
		length=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Width of Rectangle = ");
		width=scanner.nextInt();
		scanner.nextLine();
		//scanner.close();
	}
	public void area()
	{
		System.out.println("ii). Rectangle..");
		area = length * width;
		System.out.println("The area of Rectangle is = "+ area);
	}
	public void shape() {

		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=8; j++)
			{
				if(i==1 || i==3 || j==1 || j==8)
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

