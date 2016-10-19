package by.vonotirah.mm_gc;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class RefercesService {

	public void runExample() {

		Class4Example obj = new Class4Example();
		System.out.println("Created object is " + obj);

		ReferenceQueue refQueue = new ReferenceQueue();

		WeakReference weakRef = new WeakReference(obj, refQueue);

		System.out.println("The weak reference is " + weakRef);

		// GC doesn't consider "obj" for delete
		System.out.println("refQueue.poll() return - " + refQueue.poll());
		System.out.println("weakRef.get() return -  " + weakRef.get());

		System.out.println("Set the obj reference to null and call GC");
		obj = null;
		System.gc();
		System.out.println("refQueue.poll() return - " + refQueue.poll());
		System.out.println("weakRef.get() return -  " + weakRef.get());

	}
}
