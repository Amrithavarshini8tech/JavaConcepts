package String;

import org.testng.annotations.Test;

public class String {
	

	@Test(enabled = true)
	public void strings() {
		/*
		 * differences between String, StringBuffer, and StringBuilder in Java:
		 * 
		 * 1. String Immutability: Strings are immutable, meaning once a String object
		 * is created, it cannot be changed. Any modification results in the creation of
		 * a new String object. Usage: Suitable for scenarios where the string value
		 * does not change frequently. Example:
		 */
		java.lang.String str = "Hello";
		str = str + " World"; // Creates a new String object
		System.out.println("string" + str);
		/*
		 * 2. StringBuffer Mutability: StringBuffer objects are mutable, meaning they
		 * can be modified after creation without creating new objects. Thread-Safety:
		 * StringBuffer is synchronized, making it thread-safe. This means it is safe to
		 * use in a multi-threaded environment. Usage: Suitable for scenarios where the
		 * string value changes frequently and thread safety is required. Example:
		 */
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World"); // Modifies the existing object
		System.out.println("string buffer" + sb);
		/*
		 * 3. StringBuilder Mutability: Like StringBuffer, StringBuilder objects are
		 * mutable. Thread-Safety: StringBuilder is not synchronized, making it not
		 * thread-safe. However, it is faster than StringBuffer due to the lack of
		 * synchronization. Usage: Suitable for scenarios where the string value changes
		 * frequently and thread safety is not a concern. Example:
		 */
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append(" World"); // Modifies the existing object
		System.out.println("string builder" + sb1);
		/*
		 * Summary String: Immutable, not thread-safe, suitable for constant strings.
		 * StringBuffer: Mutable, thread-safe, suitable for multi-threaded environments.
		 * StringBuilder: Mutable, not thread-safe, suitable for single-threaded
		 * environments.
		 */

	}
}
