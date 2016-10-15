package by.vonotirah.mm_gc;

public class App {
	public static void main(String[] args) {

		Service4Example changeClass = new Service4Example();
		Class4Example firstClass = new Class4Example("This is first class message");

		firstClass.say();
		changeClass.passByRefNewObjExample(firstClass);
		firstClass.say();

		changeClass.passByRefChangeObjExample(firstClass);
		firstClass.say();

		int x = 0;
		int y = x;
		System.out.println("x = " + x + ", y = " + y);
		x++;
		System.out.println("x = " + x + ", y = " + y);
		y = 9;
		System.out.println("x = " + x + ", y = " + y);
		changeClass.passByRefPrimType(x);
		System.out.println("x = " + x + ", y = " + y);
	}
}
