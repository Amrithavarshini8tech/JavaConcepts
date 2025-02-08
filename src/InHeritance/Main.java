package InHeritance;

public class Main {

	public static void main(String[] args) {
		Teachers T1= new Teachers();
		System.out.println("Teachers Address");
		T1.name="John";
		T1.phone=1456;
		T1.showAddress();
		
		System.out.println("Students Address");
		Students T2= new Students();
		T1.name="Hari";
		T1.phone=453;
		T1.showAddress();
		
		System.out.println("Staffs Address");
		Staff T3= new Staff();
		T1.name="Asif";
		T1.phone=167878;
		T1.showAddress();
		

	}

}
