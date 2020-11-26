package JavaTemplates;

public class MyListTemplate<T> implements ListInterface<T> {

	private class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;

		Node(T data) {
			this.data = data;
			next = null;
			prev = null;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> n) {
			next = n;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> n) {
			prev = n;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

	}

	private Node<T> first;
	private Node<T> last;
	private int size;

	public MyListTemplate() { // pq ser public se a classe já é public
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public void add(T i) {
		Node<T> n = new Node<T>(i);
		if (first == null) {
			last = n;
		} else {
			first.setPrev(n);
			n.setNext(first);
		}
		first = n;
		size++;
	}

	public void remove(T toBeRemoved) { // not implemented yet
		if(first != null) {
			if (toBeRemoved == first.getData()) {
				if(first.getNext() != null)
				{
					first.getNext().setPrev(null);
				}
				first = first.getNext();
				last = null;
			}
			else if( toBeRemoved == last.getData()) {
				last = last.getPrev();
				last.setNext(null);
			}
			else {
				Node<T> aux = first;
				for(; aux != null && aux.getData() != toBeRemoved; aux = aux.getNext()) { }
				aux.getNext().setPrev(aux.getPrev());
				aux.getPrev().setNext(aux.getNext());
			}
			size--;
		}
	}

	public void removeAll() {
		first = null;
		last = null;
	}

	public int getSize() {
		return size;
	}

	public void print() {
		Node<T> it = first;
		while (it != null) {
			System.out.println(it.getData());
			it = it.getNext();
		}
	}
}
