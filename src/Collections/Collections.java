package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections {
	public void collections() {
		/*
		 * Java collections are like super-powered containers for holding objects. They provide a set of data structures and algorithms to handle and manipulate
		 * groups of objects efficiently. Here are the main types of collections in Java:
		 * Interfaces: 
		 * List: An ordered collection (also known as a sequence). Examples
		 * include:
		 * ArrayList
		 * LinkedList
		 * Set: A collection that contains no duplicate elements. Examples include:
		 * HashSet
		 * TreeSet
		 * Queue: Typically used to hold elements prior to processing. Examples include:
		 * LinkedList
		 * PriorityQueue
		 * Map: An object that maps keys to values, with no duplicate keys allowed.
		 * Examples include:
		 * HashMap
		 * TreeMap
		 * Common Implementations: ArrayList: Resizable array implementation of the List
		 * interface.
		 * LinkedList: Doubly-linked list implementation of the List and Deque
		 * interfaces.
		 * HashSet: Hash table-backed implementation of the Set interface.
		 * TreeSet: Navigable set implementation based on a TreeMap.
		 * HashMap: Hash table-backed implementation of the Map interface.
		 * TreeMap: Red-black tree-based implementation of the Map interface.
		 * Basic Operations: Add: Add elements to the collection.
		 * Remove: Remove elements from the collection.
		 * Contains: Check if an element is in the collection.
		 * Size: Get the number of elements in the collection.
		 * Java collections are powerful tools that make it easier to manage and manipulate groups of objects
		 */
		// List example
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Set example
		Set<String> set = new HashSet<>();
		set.add("Cat");
		set.add("Dog");
		set.add("Bird");

		// Map example
		Map<String, Integer> map = new HashMap<>();
		map.put("Key1", 1);
		map.put("Key2", 2);
		map.put("Key3", 3);

		// Queue example
		Queue<String> queue = new LinkedList<>();
		queue.add("First");
		queue.add("Second");
		queue.add("Third");
	}
}
