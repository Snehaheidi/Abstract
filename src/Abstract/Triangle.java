package Abstract;

import java.util.Scanner;

public class Triangle extends Shapes 
{
	int area;
	int height = 0,base = 0;
	public void DataGet(Scanner scanner)
	{
		//Scanner scanner=new Scanner(System.in);
		System.out.println("iii). Triangle..");
		System.out.println("Enter the Triangle Height = ");
		height = scanner.nextInt();
		System.out.println("Enter the Triangle Base =");
		base = scanner.nextInt();
		//scanner.close();
	}
	public void area()
	{ 
		area = height* base / 2;
		System.out.println("The area of Triangle =" +area);
	}
	public void shape()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}	
	}
}
