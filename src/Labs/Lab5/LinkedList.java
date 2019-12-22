package Labs.Lab5;

import java.util.NoSuchElementException;

public class LinkedList<T> {
	protected Link<T> head, tail;
	protected long count;

	public LinkedList() {

	}

	public boolean isEmpty() {
		return this.head == null & this.tail == null;
	}

	public T elementAt(int index) {
		if (index >= this.count)
			throw new NoSuchElementException();

		if (index == this.count - 1) {
			return this.tail.getElement();
		} else {
			Link<T> elem = this.head;

			for (int i = 0; i < index; i++) {
				elem = elem.getNext();
			}

			return elem.getElement();
		}
	}

	public void insertAt(int index, T element) {
		if (index > count) {
			throw new NoSuchElementException();
		}

		if (index == 0) { // Insert at the beginning
			if (this.count == 0) {
				this.head = new Link<T>(element, null);
				this.tail = head;
			} else {
				this.head = new Link<T>(element, this.head);
			}
		} else if (index == this.count) { // Insert at the end
			this.tail.setNext(new Link<T>(element, null));
			this.tail = this.tail.getNext();
		} else {
			Link<T> elem = this.head;

			// Get the element
			for (int i = 1; i < index; i++) {
				elem = elem.getNext();
			}

			elem.setNext(new Link<T>(element, elem.getNext()));
		}

		this.count++;
	}
}
