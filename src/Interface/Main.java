package Interface;

public class Main {

	public static void main(String[] args) {
		Audiocall obj1= new Audiocall();
		mute obj2=new mute();
		disconnect obj3=new disconnect();
		
		obj1.calls();
		obj2.calls();
		obj3.calls();

	}

}
