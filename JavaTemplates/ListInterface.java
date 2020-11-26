package JavaTemplates;

public interface ListInterface<T> {
	public void add(T i);
	public void remove(T i);
	public void removeAll();
	public int getSize();
	//public MyIterator getIterator();
	//public void getIterator();

}

/*The Factory Design Pattern or Factory Method Design Pattern is one of the most used design patterns in Java.

Let's first create the Polygon interface:

public interface Polygon {
    String getType();
}

Next, we'll create a few implementations like Square, Triangle, etc. that implement this interface and return an object of Polygon type.

Now we can create a factory that takes the number of sides as an argument and returns the appropriate implementation of this interface:

public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            return new Triangle();
        }
        if(numberOfSides == 4) {
            return new Square();
        }
        if(numberOfSides == 5) {
            return new Pentagon();
        }
        if(numberOfSides == 7) {
            return new Heptagon();
        }
        else if(numberOfSides == 8) {
            return new Octagon();
        }
        return null;
    }
}

Notice how the client can rely on this factory to give us an appropriate Polygon, without having to initialize the object directly. */
