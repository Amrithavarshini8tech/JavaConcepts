package Interface;

public interface WatsAppCalls {
	void calls();

}

class Audiocall implements WatsAppCalls {

	public void calls() {
		System.out.println("Audiocall");

	}
}

class mute implements WatsAppCalls {

	public void calls() {

		System.out.println("mute");
	}
}

class disconnect implements WatsAppCalls {

	public void calls() {

		System.out.println("disconnect");
	}
}