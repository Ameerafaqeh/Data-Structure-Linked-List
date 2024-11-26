public class LinkedList {
	private Node front;
	private Node back;
	private int size;

	public LinkedList() {
		front = back = null;
		size = 0;
	}

	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (size == 0) {
			front = back = newNode;
		} else {
			newNode.setNext(front);
			front = newNode;
		}
		size++;
	}

	public Object getFirst() {
		if (size == 0) {
			return null;
		} else {
			return front.getData();
		}
	}

	public void addLast(Object data) {
		Node newNode = new Node(data);
		if (size == 0) {
			front = back = newNode;
		} else {
			back.setNext(newNode);
			back = newNode;
		}
		size++;
	}

	public Object getLast() {
		if (size == 0)
			return null;
		else
			return back.getData();
	}

	public void printList() {
		if (size == 0) {
			System.out.println("The list is empty.");
		} else {
			Node current = front;
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.println();
		}
	}

	public void removeFirst() {
		if (size == 0) {
			System.out.println("The list is empty.");
		} else if (size == 1) {
			front = back = null;
			size--;
			System.out.println("The list is now empty.");
		} else {
			front = front.getNext();
			size--;
		}
	}

	public int getSize() {
		return size;
	}

	public Object get(int index) {
		if (size == 0)
			return null;
		else if (index == 0)
			return getFirst();
		else if (index == size - 1)
			return getLast();
		else if (index > 0 && index < size - 1) {
			Node current = front;
			for (int i = 0; i < index; i++)
				current = current.getNext();
			return current.getData();
		} else
			return null;
	}

	public void add(int index, Object data) {
		if (index == 0)
			addFirst(data);
		else if (index >= getSize())
			addLast(data);
		else {
			Node newNode = new Node(data);
			Node current = front; // used to advance to proper position
			for (int i = 0; i < index - 1; i++)
				current = current.getNext();
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			size++; // update size
		}
	}

	public boolean removeLast() {
		if (size == 0) {
			return false;
		} else if (size == 1) {
			front = back = null;
		} else {
			Node current = front;
			for (int i = 0; i < size - 2; i++) {
				current = current.getNext();
			}
			current.setNext(null);
			back = current;
		}
		size--;
		return true;
	}

	public void traverse(Node current) {
		if (current != null) {
			System.out.println(current.getData());
			traverse(current.getNext());
		}
	}

	public void clear() {
		front = back = null;
		size = 0;
	}

	public int find(Object o) {
		Node current = front;
		int index = 0;
		while (current != null) {
			if (current.getData().equals(o)) {
				System.out.println("index " + index);
				return index;

			}
			current = current.getNext();
			index++;
		}
		return -1;
	}

	

	public boolean remove(int index) {
		if (index >= size) {
			return false;
		}
		if (index < 0) {
			return false;
		}
		if (index == 0) {
			removeFirst();
			return true;
		}
		Node current = front;
		for (int i = 0; i < index - 1; i++) {
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		if (index == size - 1) {
			back = current;
		}
		size--;
		return true;
	}
}
