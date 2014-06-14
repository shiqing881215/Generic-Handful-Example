package impl;

import intf.FirstInterface;

/**
 * 
 * @author shiqing
 *
 * @param <U>
 * @param <T>
 * 
 * Follow the same pattern form Base class
 */
public class First<U extends First<U, T>, T extends FirstInterface<T>> extends Base<U, T> implements FirstInterface<T> {
}
