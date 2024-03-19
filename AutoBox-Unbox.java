/*This program illustrates Autobox and Unbox of Data Type */
import java.util.Scanner;
public class calculateAverage {
	public static void main(String[]args) {
		float average =0.0f;
		Scanner sc= new Scanner(System.in);
		
	   /*This lines declares array Integer Wrapper Object */
	   Integer cie1,cie2,cie3;
	   /* -Autobox
	   *The parsed value of integer consonant is converted wrapper Object */
	   System.out.println("Enter the score of First Internal:");
	   cie1 = Integer.parseInt(sc.next());
	   Sytsem.out.println("Enter the score of second Internal:");
	   cie2 = Integer.parseInt(sc.next());
	   System.out.println("Enter the score of third Internal:");
	   cie3 =Integer.parseInt(Ssc.next());
	   
	   /*Unbox
	    *The wrapper Object value is converted into Primitive Data Type */
		average=(float)(cie1+cie2+cie3)/3;
		System.out.println("The average Internal Score is "+average);
		sc.close();
	}
}


/*This program illustrates Autobox and Unbox of Data Type */
import java.util.Scanner;
public class calculateAverage {
     public static void main(String[]args) {
	 float sum =0.0f;
	 Scanner sc= new Scanner(System.in);
	 /*This lines declares array Integer Wrapper Object */
	 Integer cie[]= new Integer[3];
	 
     for(int i=0;i<3 ;i++){
		System.out.println("Enter the score of Internal : "+(i+1));
		
	  /* -Autobox
	   *The parsed value of integer consonant is converted wrapper Object */
	   cie[i] = Integer.parseInt(sc.next());
	   
	   /*Unbox
	    *The wrapper Object value is converted into Primitive Data Type */
		sum=sum+cie[i];
	}
	System.out.println("The average Internal Score is "+(sum/3));
	sc.close();
	}

	   
	   
	   
	   