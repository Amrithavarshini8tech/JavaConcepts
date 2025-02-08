package InHeritance;

public class Person {
	String name;
	int phone;

	public void showAddress() {
		System.out.println("Name is " + name);
		System.out.println("Phone is " + phone);
	}
}

class Teachers extends Person {

}

class Students extends Person {

}

class Staff extends Person {

}
