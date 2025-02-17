package StaticKeyword;
//https://www.geeksforgeeks.org/static-keyword-java/
public class StaticMethod {
	// static method
    static void m1()
    {
        System.out.println("from m1");
    }

    public static void main(String[] args)
    {
          // calling m1 without creating
          // any object of class Test
           m1();
    }
}


/*
 * Notes static Keyword in Java Last Updated : 04 Jan, 2025 The static keyword
 * in Java is mainly used for memory management. The static keyword in Java is
 * used to share the same variable or method of a given class. The users can
 * apply static keywords with variables, methods, blocks, and nested classes.
 * The static keyword belongs to the class rather than an instance of the class.
 * The static keyword is used for a constant variable or a method that is the
 * same for every instance of a class.
 * 
 * The static keyword is a non-access modifier in Java that is applicable for
 * the following:
 * 
 * Blocks Variables Methods Classes Note: To create a static member(block,
 * variable, method, nested class), precede its declaration with the keyword
 * static.
 */

/*
 * Characteristics of static keyword: Here are some characteristics of the
 * static keyword in Java:
 * 
 * Shared memory allocation: Static variables and methods are allocated memory
 * space only once during the execution of the program. This memory space is
 * shared among all instances of the class, which makes static members useful
 * for maintaining global state or shared functionality. Accessible without
 * object instantiation: Static members can be accessed without the need to
 * create an instance of the class. This makes them useful for providing utility
 * functions and constants that can be used across the entire program.
 */