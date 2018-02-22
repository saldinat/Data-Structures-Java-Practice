package p;



public class LinkedList<T>{
    private LLNode<T> first;
    protected String name; 
    
    public LinkedList(String name) {
		setFirst(null);
		this.name = name;
    }
    
    	public void insert(T element) {
    		LLNode<T> newNode = new LLNode<>(element); 
    		newNode.setLink(getFirst());
    		setFirst(newNode);
    	}
    	
    public boolean isFull() {
		return false;
	}
    
	public int size() {
		int size = 0;
		LLNode<T> currNode = getFirst();
		while(currNode != null) {
			size += 1;
			currNode = currNode.getLink();
			}
		return size;
		}
    
    public void insertBack(T element) {
    	
	    	LLNode<T> currNode = this.getFirst();
	    	LLNode<T> newNode = new LLNode<>(element);
		
		if(this.getFirst()==null) {
			setFirst(newNode);
			return;
		}
		
		while(currNode.getLink() != null){
			currNode = currNode.getLink();
		}
		currNode.setLink(newNode);
    }
    
    public String toString() {
    		LLNode<T> currNode = this.getFirst();
		String result = "Nodes:" + "\n";
		while (currNode != null) {
			result += currNode.getInfo() + "\n";
			currNode = currNode.getLink();
		}
		return result; 
		} 
    public void clear() {
		this.setFirst(null);
	}
	
	public void insertMiddle(T element) {
		LLNode<T> currNode = this.getFirst();
		LLNode<T> old = null;
		if (currNode != null) {
			int middle = this.size() / 2;
			
			for (int i = 0; i < middle - 1; i++) 
				currNode = currNode.getLink();
			old = currNode.getLink();
			currNode.setLink(new LLNode<>(element));
			currNode.getLink().setLink(old);
		} 
		else 
			this.setFirst(new LLNode<>(element));
	}

	public LLNode<T> getFirst() {
		return first;
	}

	public void setFirst(LLNode<T> first) {
		this.first = first;
	}
}
    	