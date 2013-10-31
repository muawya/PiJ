//package bubble_sort;

public class ListUtilities1 {
	
	public static IntegerList bubbleSort(IntegerList list) 
	{
		IntegerList listToSort = list;
		IntegerNode currentNode = listToSort.getFirst();
						
		while(currentNode.getNext().getNext() != null) 
		{	
			IntegerNode temp1 = currentNode;
			IntegerNode temp2 = temp1.getNext();
			IntegerNode temp3 = temp2.getNext();

			if(temp2.getNumber() > temp3.getNumber()) 
			{
				temp2.setNext(temp3.getNext());
				temp3.setNext(temp2);
				temp1.setNext(temp3);
			} 

			currentNode = currentNode.getNext();

			//listToSort.prettyPrint();
			//System.out.println("///////");
		}

		return listToSort;
	}
	
}
