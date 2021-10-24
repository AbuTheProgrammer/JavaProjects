// Author: Abu Bakar Siddique
// Date: October 25,2021
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("What is the radius of the circle in cm?");
	    double radius = myObj.nextInt();
	    final double pi = 3.14159265359;
	    double area = pi*Math.pow(radius,2);
		System.out.println("Area of the circle is: " + area);
	}
}
