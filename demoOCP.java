import java.util.Scanner;
interface OrderDelivery
{
	public void deliverOrder();
	}
	class Swiggy implements OrderDelivery
	{
	String cust_name;
	byte OrderID;
	Swiggy(){
	Scanner inScanner=new Scanner(System.in);
	System.out.println("Enter the order ID....");
	OrderID=inScanner.nextByte();
	}
	public void deliverOrder(){
	System.out.println("Delivering food order of Mr. "+cust_name+"with order number number"+order ID+".");
	}
}
class SwiggyInstaMart implements orderDelivery
{
    String cust_name;
	byte orderID;
	int product_qty;
	Swiggy Instamart(){
	  Scanner inScanner=new Scanner(System.in);
	  System.out.println("Enter the customer Name.....");
	  cust name=inScanner.next();
	  System.out.println("Enter the order ID....");
	  order ID=inScanner.nextbyte();
	  System.out.println("Enter product quantity...");
	  product_qty=inScanner.nextInt();
}
     public void deliverOrder(){
     System.out.println("Delivering food order of Mr. "+cust_name+"with order number number"+order ID+"\nThe total no of products delivered are"+product_qty);
	 }
}
class Delivery
{
     public void deliverToCustomer(Order Delivery 0d){
     0d.deliverorder();
	 }
}
     public class demoOCP{
     public static void main(String args[]){
	 Delivery order= new Delivery();
	 Swiggy sw = new Swiggy();
	 order.deliverToCustomer(sw);
	 SwiggyInstaMart Insta=new Swiggy Instamart();
	 order.deliverToCustomer(insta);
	}
}
