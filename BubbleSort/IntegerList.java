//package bubble_sort;


public class IntegerList {

private IntegerNode first;
	
	
	public IntegerList() {
		this.first = null;
	}
	
	public IntegerNode getFirst() {
		return this.first;
	}
	
	public void setFirst(IntegerNode n) {
		this.first = n;
	}
	
	public void add(int n) 
	{
		IntegerNode newNumber = new IntegerNode(n);
		
		if (first == null) {
			this.first = newNumber;
			return;
		}
		
		IntegerNode aux = first;
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(newNumber);
	}
	
	public void prettyPrint() {
		IntegerNode current = first;
		while(current != null) {
			System.out.println(" " + current.getNumber());
			current = current.getNext();
		}
	}
	
}
