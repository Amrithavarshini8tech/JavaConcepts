package Constructors;

//You can have as many parameters as you want:
public class ManyParametersConstructor {
	int modelYear;
	String modelName;

	public ManyParametersConstructor(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		ManyParametersConstructor myCar = new ManyParametersConstructor(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
}
