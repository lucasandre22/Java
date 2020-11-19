package JavaTemplates;


public class  MyListTemplate<T> implements ListInferface<T>{
	
	private class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;
		
		Node() {
			data = null;
			next = null;
			prev = null;
		}
		
		Node(T data) {
			this.data = data;
			next = null;
			prev = null;
		}
		
		public Node<T> getNext() { return next; }
		public void setNext(Node<T> n) { next = n; }
		public Node<T> getPrev() { return prev; }
		public void setPrev(Node<T> n) { prev = n; }
		public T getData() { return data; }
		public void setData(T data) { this.data = data; }
		
	}
	
	private Node<T> first;
	private Node<T> last;
	private int size;
	
	public MyListTemplate() {  //pq ser public se a classe já é public
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public void add(T i) {
		Node<T> n = new Node<T>(i);
		if(first == null) {
			last = n;
		}
		else {
			first.setPrev(n);
			n.setNext(first);
		}
		first = n;
		size++;
	}
	
	public void remove(T i) {
		
	}
	public void removeAll() {
		
	}
	public int getSize() {
		return size;
	}
	public void print() {
		Node<T> it = first;
		while(it != null) {
			System.out.println(it.getData());
			it = it.getNext();
		}
	}
}
