package by.vonotirah.mm_gc;

public class Class4Example {

	private String message;

	public Class4Example() {
		super();
	}

	public Class4Example(String message) {
		this.message = message;
	}

	public void say() {
		System.out.println(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	protected void finalize() throws Throwable {
		System.out.println("finalize method 4 object - " + this);
	}

}
