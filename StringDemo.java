package Week7;
import java.lang.String;
import java.lang.StringBuffer;
public class StringDemo{
	private static StringBuffer strbuf;

	public static void main(String args[]) {
		System.out.println("This code illustrates use of String class and its methods");
		System.out.println("*********************************************************");
		String str=new String("Train your mind to see the Good in Everything.");
		System.out.println("The intial Strings is:\t"+str);
		System.out.println("After replacing 'o' with 'O' :\t"+str.replace('o','O'));
		System.out.println("The lenght of the given string is:\t"+str.length());
		System.out.println("The occurrence of character G is at position:\t"+str.indexOf('G'));
		System.out.println("The lower case of String is:\t"+str.toLowerCase());
		System.out.println("The upper case of String is:\t"+str.toUpperCase());
		System.out.println("The extracted sub string is:\t"+str.substring(27));
		String s="			Hello World          ";
		System.out.println("The string with spaces: "+s);
		System.out.println("The string with leading & trailing spaces:\t"+s);
		System.out.println("The string without spaces:"+s.trim());
		if(s.isEmpty())
			System.out.println("The string is Empty");
		else
			System.out.println("The String is not empty.It contains "+s);
		s=null;
		System.out.println("The String is after modifying...\t"+s);
		System.out.println("**************************************");
		System.out.println("This code illustrates use of string buffer class and its methods");
		System.out.println("***********************************************");
		System.out.println("The intial capacity of String buffer is "+strbuf.capacity());
		strbuf.append("Hello");
		System.out.println("The Stringbuffer is:\t"+strbuf);
		strbuf.setLength(20);
		strbuf.insert(5, "welcome to the world of java");
		System.out.println("The Stringbuffer is:\t"+strbuf);
		System.out.println("The capacity of String buffer after appending "+strbuf.capacity());
		System.out.println("The reverse of given Stringbuffer is:\n"+strbuf.reverse());
		System.out.println("The Stringbuffer after deleting\t"+strbuf.delete(5, 43));
		System.out.println("******************************************************");
	}
}