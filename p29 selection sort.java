package WEEK7;
import java.io.*;
class Student{
		String name,course;int rno;
		float ia1,ia2,ia3,avg;
		Student(){
			try{
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(isr);
				rno=Integer.parseInt(br.readLine());
				System.out.println("Enter the roll no.of Student:");
				name=br.readLine();
				System.out.println("enter the course of student");
				course=br.readLine();
				System.out.println("Enter the CIE-1 score of Student");
				ia1=Float.parseFloat(br.readLine());
				System.out.println("enter the CIE-2 score of Student");
				ia2=Float.parseFloat(br.readLine());
				System.out.println("enter the CIE-3 score of Student");
				ia3=Float.parseFloat(br.readLine());
				avg=(ia1+ia2+ia2)/3;
			}
			catch(Exception e)
			 {
				System.out.println("runtime errors occurs while reading input....");
				e.printStackTrace();
			 }
		}
			void displayStudentDetails()
			{
			      System.out.println(rno+"\t"+name+"\t"+course+"\t"+ia1+"\t"+ia2+"\t"+ia3+"\t"+avg);
				}
			}
			public class arrayofstu_buffereader{
				public static void main(String args[])
				{
					Student list[]=new Student[5];
					for(int i=0;i<list.lenght;i++)
						list[i]=new Student();
					System.out.println("\n*********************************");
					System.out.println("Rno\tname\tcourse\tcie-1\tcie-2\tcie-3\tavg");
					for(int i=0;i<3;i++)
						list[i].displayStudentDetails();
					System.out.println("\n**************************************");
				}
		}