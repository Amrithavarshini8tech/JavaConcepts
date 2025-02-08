package Polymorphism_Overloading;

public class Main {
	//Method Overloading
 public void sum(int a, int b) {
	System.out.println(a+b);
 }
 public void sum(int c, int d, int e) {
		System.out.println(c+d+e);
	 }
	
 public void sum(double f, int g) {
		System.out.println(f+g);
	 }	
	
	public static void main(String[] args) {
	Main Obj=new Main();
	Obj.sum(2, 3);
	Obj.sum(2, 5, 6);
	Obj.sum(2.55, 6);

	}

}
