package impl;

import intf.SecondInterface;

/**
 * 
 * @author shiqing
 *
 * This is the end impl class.
 * It will give all the real type both for interface and implementation like {@link SecondInterface} and {@link Second}
 * 
 */
public class Second extends First<Second, SecondInterface> implements SecondInterface {
	
	public static void mani(String[] args) {
		Second s = new Second();
		/**
		 * This get is from the BaseInterface with the Generic Type T and here we give it as SecondInterface 
		 * (Actuall we can also declare s2 type as FirstInterface and BaseInterface which are the parent of SecondInterface)
		 */
		// This is important!!!!
		// Cause here we don't need to do any cast, THIS IS WHAT WE REALLY WANT!
		// This is also what we did in real code, declare the interface and return the implementation.
		SecondInterface s2 = s.get();
		// Then you can call any method on s2 that you define in the all interface here to do the work
	}
}
