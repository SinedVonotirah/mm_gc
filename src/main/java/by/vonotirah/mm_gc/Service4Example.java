package by.vonotirah.mm_gc;

public class Service4Example {

	public void passByRefExample(Class4Example clazz) {
		clazz = new Class4Example("This is message from method");
		clazz.say();
	}

}
