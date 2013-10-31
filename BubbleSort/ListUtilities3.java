//package bubble_sort;

public class ListUtilities3 {
	
	public static IntegerList bubbleSort(IntegerList list) 
	{
		IntegerList listToSort = list;

		boolean sorted = false;	
		while(sorted == false) 
		{	
			IntegerNode currentNode = listToSort.getFirst();

			sorted = true; // let us assume that after the current iteration of the loop we will have a sorted list
			while(currentNode.getNext().getNext() != null) 
			{	
				IntegerNode temp1 = currentNode;
				IntegerNode temp2 = temp1.getNext();
				IntegerNode temp3 = temp2.getNext();

				if(listToSort.getFirst().getNumber() == temp1.getNumber()) 
				{
					if(temp1.getNumber() > temp2.getNumber())
					{
						temp1.setNext(temp2.getNext());
						temp2.setNext(temp1);
						listToSort.setFirst(temp2);
						sorted = false; // the assumption we made earlier has been proved wrong, hence we have to continue the sorting.
					} 
				}

				if(temp2.getNumber() > temp3.getNumber()) 
				{
					temp2.setNext(temp3.getNext());
					temp3.setNext(temp2);
					temp1.setNext(temp3);
					sorted = false; // the assumption we made earlier has been proved wrong, hence we have to continue the sorting.
				} 

				currentNode = currentNode.getNext();

				//listToSort.prettyPrint();// print list after every step of the sorting.
				//System.out.println("///////");

			} //end of inner while loop
		} //end of outer while loop

		return listToSort;
	}
	
}
