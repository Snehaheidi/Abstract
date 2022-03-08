package Abstract;
import java.util.Scanner;
public class Abstract {
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		Square squ = new Square();
		squ.shapes1();
		squ.GetData(scanner);
		squ.area();
		squ.shape();
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		Rectangle rect = new Rectangle();
		rect.getdata(scanner);
		rect.area();
		rect.shape();
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		Triangle tri = new Triangle();
		tri.DataGet(scanner);
		tri.area();
		tri.shape();
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		scanner.close();
	}
}
