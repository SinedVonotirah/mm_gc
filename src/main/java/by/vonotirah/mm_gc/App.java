package by.vonotirah.mm_gc;

public class App {
	public static void main(String[] args) {

		Service4Example changeClass = new Service4Example();
		Class4Example firstClass = new Class4Example("This is first class message");

		firstClass.say();

		changeClass.passByRefExample(firstClass);

		firstClass.say();

	}
}
