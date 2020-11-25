package JavaTemplates;

public interface ListInterface<T> {
	public void add(T i);
	public void remove(T i);
	public void removeAll();
	public int getSize();
	//public MyIterator getIterator();
	//public void getIterator();

}
