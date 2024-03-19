package emp;
import java.util.Scanner;
public class Employee{
         short empId;
		 public int expYears;
		 String empName;
		 public float salary;
		 public Employee(){
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter employee number....");
		   empId=Short.parseShort(sc.next());
		   System.out.println("Enter employee Name...");
		   empName = sc.next();
		   System.out.println("Enter employee Gross salary...");
		   salary=Float.parseFloat(sc.next());
		   System.out.println(sc.next());
		   empYears=Integer.parseInt(sc.next());
	}
    public void getEmployee() {
	    System.out.println(empId+"\t"+empName+"\t"+expYEars+"\t"+salary);
	}
}



package bonus;
import emp.Employee;
public class issueBonus {
    public static void main(String args[]){
        if(emp.expYears > 10)
            emp.salary = emp.salary + (emp.salary * 0.15f);
		else
			emp.salary =emp.salary + (emp.salary * 0.05f);
	}
}


import bonus.issueBonus;
public class demoPackage {
		public static void main(String[] args){
		   System.out.println("This program illustrates use of packages...");
		   Employee list[]=new Employee[3];
		   /*Intialize array of objects individually*/
		   for(byte i=0;i<list.lenght;i++)
		      list[i]=new Employee();
		    System.out.println("\n*********************************************************");
			System.out.println("empId\tempName\texpYears\tsalary");
			System.out.println("************************************************************");
			for(byte i=0;i<list.length;i++) {
					issueBonus.issueEmployeeBonus(list[i]);
					list[i].getEmployee();
		}
		System.out.println("*****************************************************************");
	}
}

		 
