package impl;

import intf.BaseInterface;


public class First<T extends First<T>> extends Base<T> implements BaseInterface<T>{
}
