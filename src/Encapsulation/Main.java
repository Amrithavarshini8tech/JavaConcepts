package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setName("Arya");
		e.setSalary(1000);
		
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}

}
