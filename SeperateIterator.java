package Iteraor;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SeperateIterator <T> implements Iterator<T>{
	private ListInterface<T> list;
	private int nextPosition;
	private boolean wasNextCalled;
	
	public SeparateIterator(ListInterface<T> myList){
		list = myList;
		nextPosition = 0;
		wasNextCalled = false;
	}
	
	public boolean hasNext(){
		return nextPosition < list.getLength();
	}
	
	public T next(){
		if (hasNext()){	
			wasNextCalled = true;
			nextPosition++;
			return list.getEntry(nextPosition);
		}
	
		else
			throw new NoSuchElementException("Illegal call to next(): " +
		"iterator is after end of list.");
	}
	
	public void remove(){
		if(wasNextCalled){
			list.remove(nextPosition);
			nextPosition--;
			wasNextCalled = false;
		}
		else
			throw new IllegalStateException("Illegal call to remove(); " +
						"next() was not called.");
	}
	
}


