package Polymorphism_Overriding;

public class India {
	public void speaking() {
		System.out.println("I can speak Indian languages");
	}

}

class Delhi extends India {
	// Method Overriding - Inheritence applied
	public void speaking() {
		System.out.println("I can speak Hindi");
	}
}

class Kerala extends India {
	public void speaking() {
		System.out.println("I can speak Malayalam");
	}
}

class TamilNadu extends India {
	public void speaking() {
		System.out.println("I can speak Tamil");
	}
}
