package JavaTemplates;
import java.util.*;

public class Vetor {
	private Vector<Integer> vetor;
	private Iterator<Integer> it;
	
	public Vetor() {
		vetor = new Vector<Integer>();
	}
	
	public void add(int i) {
		vetor.add(i);
	}
	
	public void remove(int i) {
		vetor.removeElement(i);
	}
	
	public void removeAll() {
		vetor.removeAllElements();
	}
	
	public int getIndexOf(int i) {
		return vetor.indexOf(i);
	}
	
	public int getSize(int i) {
		return vetor.size();
	}
	
	public int get(int i) {
		return vetor.elementAt(i);
	}
	
	public void initializeIterator() {
		it = vetor.iterator();
	}
	
	public Iterator<Integer> getIterator() {
		return it;
	}
	
	public boolean iteratorHasNext() {
		return it.hasNext();
	}
	
}
