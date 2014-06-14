package factory;

import impl.Second;
import intf.SecondInterface;

public class Factory implements FactoryInterface{
	private static Factory factory;
	
	private Factory() {
		
	}
	
	public static Factory get() {
		if (factory == null) {
			factory = new Factory();
		}
		return factory;
	}

	@Override
	public SecondInterface getSecond() {
		return new Second();
	}
	
	
}
