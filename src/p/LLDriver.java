package p;

public class LLDriver {

	public static void main(String[] args) {
		LinkedList<Integer> test = new LinkedList<>("Testing");
		test.insert(5);
		test.insert(4);
		test.insert(3);
		test.insert(2);
		//test.insert(5);
		System.out.println("first list");
		System.out.println(test);
		//System.out.println(test.size());
		//test.clear();
		
		LinkedList<Integer> test2 = new LinkedList<>("Tfjj");
		test2.insert(1);
		test2.insert(0);
		System.out.println("sec list");
		System.out.println(test2);
		System.out.println("joined");
		join(test, test2);
		System.out.println(test);
	}
	
//	public static void join(LinkedList<Integer>l1, LinkedList<Integer>l2) {
//		LLNode<Integer> currNode = l1.getFirst();
//		LLNode<Integer> beginning = l2.getFirst();
//		LLNode<Integer> last=l1.getFirst();
//		while (currNode!= null) {
//			last = currNode;
//			currNode = currNode.getLink();
//		}
//		last.setLink(beginning);
//	}
	public static void join(LinkedList l1, LinkedList l2) {
//		LLNode<Integer> currNode = l1.getFirst();
//		LLNode<Integer> beginning = l2.getFirst();
//		LLNode<Integer> last=l1.getFirst();
//		while (currNode!= null) {
//			last = currNode;
//			currNode = currNode.getLink();
//		}
//		last.setLink(beginning);
		l1.insertBack(l2);
	}
	

}
