import java.util*;
public class demoSingleResponsibility
{
  public static void main(String args[])
  {
   Student sony=new Student();
   sony.setName=("sony mathew");
   sony.setregisterno=('119CS20001');
   requestBook rb=new requestBook();
   rb.setbookName("Java Programming");
   rb.setduration(2);
   rb.setStudent(sony);
   IssueBook ibOrder=new IssueBook(rb);
   iborder.issueBook();
   }
}
class Student {
     private String name;
	 private String registerno;
	 public String getName()return name;
	 public void setName(String name){this.name=name;}
	 public string getegisterNo(){return registerNo;}
	 public void set registerNo(String rno)
	{
		this.registerNo=rno;
	}
}
class requestBook{
     private Student student;
	 private String requestID;
	 private String bookName;
	 privatient duration;
	 
	 public student get Student()&
	        return Student;}
	 {
	 this.student.student;
	 }
	 public String getrequestID()&
			return requestID;}
	 public void set request ID(String book Name}
	{
	Random random=new Random();
	this.requestID=(book Name"+"-+random nextInt(500));
	}
	public string get book Name(){
		    return book Name;}
	public void search Book{}
	{
	System.out.println("Searching booking for student-" "+this get.Student().get.Name()+"Who has requested"+this get.bookName());
	}
}
class Issue Book{
	private requestBook rb;
	public Issue Book(request Book rb){this.rb=rb;}
    public void Issue Book()
	{
		System.out.println("Issusing the book");
		System.outprintln("With request id as"+this.rb get request To()+"being issused to"+this rb.getStudent().get.Name());
		System.out.println("Book is to be deliverd to:"+this rb.getStudent()get register No());
	}
}