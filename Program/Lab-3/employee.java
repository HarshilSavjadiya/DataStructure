import java.util.*;

class emp{
	String Name;
	String Designation;
	double Employee_id;
	double Salary;


void getinfo(){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Your Name : ");
	Name = sc.nextLine();
	System.out.print("Enter Your Designation : ");
	Designation = sc.nextLine();
	System.out.print("Enter Your Employee_id : ");
	Employee_id = sc.nextDouble();
	System.out.print("Enter Your Salary : ");
	Salary = sc.nextDouble();
}

void putinfo(){
	System.out.println("Name Is : "+Name);
	System.out.println("Designation Is : "+Designation);
	System.out.println("Employee_id Is : "+Employee_id);
	System.out.println("Salary Is : "+Salary);
}
}
class employee{
	public static void main(String[] args) {
		emp s= new emp();
		s.getinfo();	
		s.putinfo();
	}
}