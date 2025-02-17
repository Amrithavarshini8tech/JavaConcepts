package ThisKeyword;

public class ThisKeyword {
	  int x;

	  // Constructor with a parameter
	  public ThisKeyword(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
		  ThisKeyword myObj = new ThisKeyword(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
}


/*
 * Notes Definition and Usage The this keyword refers to the current object in a
 * method or constructor.
 * 
 * The most common use of the this keyword is to eliminate the confusion between
 * class attributes and parameters with the same name (because a class attribute
 * is shadowed by a method or constructor parameter). If you omit the keyword in
 * the example above, the output would be "0" instead of "5".
 * 
 * this can also be used to:
 * 
 * Invoke current class constructor
 *  Invoke current class method 
 *  Return the current class object
 *  Pass an argument in the method call 
 *  Pass an argument in the constructor call
 */