package intf;

/**
 * 
 * @author shiqing
 *
 * @param <T> Here we want the T be FirstInterface itself or the subclass of FirstInterface
 * 
 * Attention, we need to pass the same generic type all along way to BaseInterface,
 * So during the compile time, we use this T as a placeholder/link to tell each interface
 * what's the real type of T.
 */
public interface FirstInterface<T extends FirstInterface<T>> extends BaseInterface<T> {

}
