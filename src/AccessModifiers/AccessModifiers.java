package AccessModifiers;

public class AccessModifiers {
	/*
	 * In Java, Access modifiers helps to restrict the scope of a class,
	 * constructor, variable, method, or data member. It provides security,
	 * accessibility, etc. to the user depending upon the access modifier used with
	 * the element. 
	 * Types of Access Modifiers There are 4 types of access modifiers available in
	 * Java:
	 * Default – No keyword required, Private, Protected ,Public
	 */

	// default access modifier
	// Class Geek is having
	// Default access modifier
	/*
	 * 1. Default Access Modifier When no access modifier is specified for a class,
	 * method, or data member, it is said to be having the default access modifier
	 * by default. The default access modifiers are accessible only within the same
	 * package.
	 */
	class Geek {
		void display() {
			System.out.println("Hello World!");
		}
	}


/*
 * 2. Private Access Modifier The private access modifier is specified using the
 * keyword private. The methods or data members declared as private are
 * accessible only within the class in which they are declared.
 * 
 * Any other class of the same package will not be able to access these members.
 * Top-level classes or interfaces can not be declared as private because,
 * private means “only visible within the enclosing class“.
 */

//error while using class from different package with
//private access modifier

//Class A
class A {
	private void display() {
		System.out.println("GeeksforGeeks");
	}
}

//Class B
class B {
	public static void main(String args[]) {
	//	A obj = new A();

		// Trying to access private method
		// of another class
		// obj.display();
		// The above code will show a compile-time error when trying to access a private
		// method from class B, even within the same package.
	}
}

/*
 * 3. Protected Access Modifier The protected access modifier is specified using
 * the keyword protected. The methods or data members declared as protected are
 * accessible within the same package or subclasses in different packages.
 */

//protected access modifier

//Class A

/*
 * public class D { 
 * protected void display() {
 * System.out.println("GeeksforGeeks"); }
 */

}