import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a width: ");
		double widthBox = Double.parseDouble(reader.readLine());

		System.out.println("Enter a length: ");
		double lengthBox = Double.parseDouble(reader.readLine());
		
		System.out.println("Enter a height: ");
		double heightBox = Double.parseDouble(reader.readLine());
		

		Box box1 = new Box();
		
		box1.setWidth(widthBox);
		box1.setLength(lengthBox);
		box1.setHeight(heightBox);;
		box1.showResult();
	
	}
}
