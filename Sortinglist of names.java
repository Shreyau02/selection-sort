import java.util.Scanner;
public class sortString{
	public static void main(String[]args){
		String list[]=new String[10];
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter list of names one by one...");
		for(int i=0;i<10;i++)
			list[i]=inScanner.next();
		for(int i=0;i<10-i;j++)
			if(lsit[j-1].compareTo(list[j])>0)
			{
				String str=list[j];
				list[j]=list[j-1];
				list[j-1]=str;
			}
	}
	for(int i=0;i<10;i++)
		System.out.println(list[i]);
	inScanner.close();
	}
}