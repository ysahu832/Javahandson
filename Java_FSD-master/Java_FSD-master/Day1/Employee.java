package Day1;

public class Employee {

	String name; String jtitle; int sal;
	
	public Employee(String name, String jtitle, int sal) {
		super();
		this.name = name;
		this.jtitle = jtitle;
		this.sal = sal;
	}
	void display() {
		System.out.println("Name is "+name+" Job Title "+jtitle+" Update Salary "+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Amit", "Manager", 4000);
		e.display();
	}

}
