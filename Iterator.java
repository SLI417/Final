package Iteraor;

import java.util.Iterator;

public interface Iterator <T> {
	public boolean hasNext();
	
	public T next();
	
	public void remove();
}
