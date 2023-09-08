package Day1;

public class Person {

	String name; int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void display_detail() {
		System.out.println("Name is "+name+" Age is "+age);
	}

	public static void main(String[] args) {
		
		Person p = new Person("Amit", 26);
		p.display_detail();

	}

}
