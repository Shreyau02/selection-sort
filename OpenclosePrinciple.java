package week8;
import java.io.InputStream;
import java.util.Scanner;
interface Shape
{
	public short calculateArea();
}
abstract class Rectangle implements Shape{
private short width;

{
	short length;
	short width;
	Rectangle()
	{
	Scanner inScanner= new Scanner(System.in);	
	System.out.println("Enter length of rectangle....");
	length=inScanner.nextShort();
	System.out.println("enter width of rectangle....");
	width=inScanner.nextShort();
	}
	  short calculateArea();
	  {
		  return(short)(length*width);
	  }
}
class circle implements shape
{
	public short radius;
	circle(){
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter radius of circle....");
		radius=inScanner.nextShort();
	}
	public short calculateArea() {
		return(short)(3.147*radius*radius);
	}
}
class square implements shape
{
	short side;
	square(){
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter side of square.....");
		side=inScanner.nextShort();
	}
public short calculateArea() {
		return(short)(side*side);
	}
class invokeshape{
		public short calculateArea(shape ishape) {
			return ishape.calculateArea();
	}
}
public class demoOpenClosePrinciple{
	public static void main(String args[]) {
		invokeshape is=new invokeshape();
		Rectangle rect=new Rectangle();
		circle cir=new circle();
		short rarea=is.calculateshapeArea(rect);
		short carea=is.claculatorShapeArea(cir);
		short sarea=is.calculateShapeArea(sqr);
		System.out.println("******OUTPUT********");
		System.out.println("Area of Rectangle is ="+rarea);
		System.out.println("Area of circle is ="+carea);
		System.out.println("Area of square is ="+sarea);
	}
}