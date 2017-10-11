package shapes;

public abstract class Shape implements Comparable<Shape> {
	/*
	 * Implement compareTo such that shapes are compared by their areas. Follow
	 * the canonical expectations of compareTo interface. See Java API for
	 * expected behavior.
	 * 
	 * Also you need to finish implementing the Square and Circle classes.
	 */
	double area;
	public Shape(){	
	}
	
	public int compareTo(Shape shape) {
		int result = this.compareTo(shape);
		return result;
	}

	public abstract double calculateArea();
}
