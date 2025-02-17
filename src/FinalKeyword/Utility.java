package FinalKeyword;
//A class declared as final cannot be subclassed. This is useful when you want to prevent inheritance.
public final class Utility {
	
	//Final Method
	final void method() {
		
		//Final Variable
		final double PI = 3.14159;
		
		//Final variable cannot be reinitialized
		//final double PI=2; //This will throw error

	    // Print the value of PI
	    System.out.println("Value of PI: " + PI);
	}
	
}
/*
 * The final Keyword in Java is used as a non-access modifier applicable only to
 * a variable, a method, or a class. It is used to restrict a user in Java.
 * 
 * The following are different contexts where the final is used:
 * 
 * Variable Method Class
 * 
 * In Java, the final keyword is used to indicate that a variable, method, or
 * class cannot be modified or extended. Here are some of its characteristics:
 * 
 * Final variables: When a variable is declared as final, its value cannot be
 * changed once it has been initialized. This is useful for declaring constants
 * or other values that should not be modified. 
 * Final methods: When a method is
 * declared as final, it cannot be overridden by a subclass. This is useful for
 * methods that are part of a class’s public API and should not be modified by
 * subclasses. 
 * Final classes: When a class is declared as final, it cannot be
 * extended by a subclass. This is useful for classes that are intended to be
 * used as is and should not be modified or extended.
 */