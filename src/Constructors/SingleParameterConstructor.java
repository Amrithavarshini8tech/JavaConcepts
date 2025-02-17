package Constructors;

public class SingleParameterConstructor {
	int x;

	public SingleParameterConstructor(int y) {
		x = y;
	}

	public static void main(String[] args) {
		SingleParameterConstructor myObj = new SingleParameterConstructor(5);
		System.out.println(myObj.x);
	}

}

/*
 * Notes Constructor Parameters Constructors can also take parameters, which is
 * used to initialize attributes.
 * 
 * The following example adds an int y parameter to the constructor. Inside the
 * constructor we set x to y (x=y). When we call the constructor, we pass a
 * parameter to the constructor (5), which will set the value of x to 5:
 */

/*
 * parameters def add(x, y): # Here, x and y are parameters return x + y
 * Arguments Arguments, also known as actual arguments, are the values supplied
 * to a function when it is called. These values serve as inputs to the function
 * during its execution. result = add(5, 3) # Here, 5 and 3 are arguments
 */