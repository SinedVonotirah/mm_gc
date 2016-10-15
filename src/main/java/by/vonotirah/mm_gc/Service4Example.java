package by.vonotirah.mm_gc;

public class Service4Example {

	public void passByRefNewObjExample(Class4Example clazz) {
		clazz = new Class4Example("This is message from method");
		clazz.say();
	}

	public void passByRefChangeObjExample(Class4Example clazz) {
		clazz.setMessage("This message was chaged in method");
		clazz.say();
	}
}
