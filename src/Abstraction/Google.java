package Abstraction;

abstract class Google {
	abstract void search();
	
	void message() {
		System.out.println("NonAbstract Method");
	}	
}

class searchAll extends Google{

	
	void search() {
	System.out.println("All results");	
	}
	}
class image extends Google{

	
	void search() {
		System.out.println("images");
	}
	}
class video extends Google{

	
	void search() {
	System.out.println("videos");	
	}
	}