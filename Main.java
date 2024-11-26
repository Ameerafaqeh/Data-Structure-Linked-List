
public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(8);
		list.addFirst(10);
		list.addFirst(0);
		list.printList();
		list.add(3, 12);
		list.printList();
//		list.removeFirst();
//		list.printList();
//		list.removeLast();
//		list.printList();
//		System.out.println(list.get(0));
//		list.clear();
//		list.printList();
//	
////		list.remove(1);
//		list.printList();
		
//		list.find(3);
		System.out.println("size " + list.getSize());
	}

}
