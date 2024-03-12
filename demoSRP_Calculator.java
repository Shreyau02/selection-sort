import java.util.Scanner;
public class demoSRPCalculator{
	public static void main(String args[]){
		double result=0;
		readInput Values input=new readInput Values();
		Switch(input.operation){
		case'+';
			result=Addition.sum(input);break;
		case'-';
			result=Subtraction.difference(input);break;
		case'*';
			result= Multiplication.product(input);break;
		case'%';
			result=Division.quotient(input);break;
		case'%';
			result=moduls.remainder(input);break;
		default;
		System.out.println("Enter valid choice...");break;
	}
	if(result>0)System.out.println("the result is...."+result);
	class readInput Values{
		double num1,num2;
		char operations;
		readInput Values()
		{
		Scanner sc.new Scanner(System.in);
		System.out.println("Enter any non zero number");
		num1=sc.nextDouble();
		System.out.println("Enter any non integer number...");
		num2=sc.nextDouble();
		System.out.println("Enter your choice");
		operatin=sc.next().charAt(0);
		sc.close();
	}
}
class Addition{
public static double sum(readInput values ip){
return(ip num1+ip num2);
   }
}
class Subtraction{
public static double diffrence(readInput Values ip){
return(ip num1-ip num2);
	}
}
class Multiplication{
public static double product(readInput Values ip){
return(ip num1*ip num2);
	}
}
class Division{
public static double quotient(readInput Values){
return(ip num1/ip num2);
	}
}
class Modules{
public static double remainder(readInput Values){
return(ip num1%ip num2);
	}
}