import java.util.*;
class AreaCircle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Double radius,area;
		System.out.println("Enter the radius:");
		radius=sc.nextDouble();
		area=3.14*(radius*radius);
		System.out.println("Area of circle: "+area);
	}
}

