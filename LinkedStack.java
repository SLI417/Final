
public final class LinkedStack<T> implements StackInterface<T> {
	private Node topNode;
	
	public LinkedStack(){
		topNode = null;
	}
	
	private class Node<T>{
		private T data;
		private Node Next;
		/**
		 * @param data
		 * @param next
		 */
		public Node(T data, Node next) {
			this.data = data;
			Next = next;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNextNode() {
			return Next;
		}
		public void setNode(Node next) {
			Next = next;
		}		
	}
	public void push(T newEntry){
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
	}
	
	public T peek(){
		if (isEmpty())
			throw new EmptyStackException();
		else
			return topNode.getData();
	}
	
	public T pop(){
		T top = peek ();
		assert topNode != null;
		topNode = topNode.getNextNode();
		return top;
	}
	
	public boolean isEmpty(){
		return topNode == null;
	}
	
	public void clear(){
		topNode = null;
	}
}
