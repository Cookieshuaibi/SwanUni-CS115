package Labs.Lab5;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<Integer>();
		integers.insertAt(0, 1);
		integers.insertAt(1, 3);
		integers.insertAt(1, 2);
		integers.insertAt(0, 0);
		
		System.out.print("First element: " + integers.elementAt(0) + "\n");
		System.out.print("Last element: " + integers.elementAt(3));
	}
}
