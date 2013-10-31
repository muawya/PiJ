//package bubble_sort;

public class ListUtilities2 {
	
	public static IntegerList bubbleSort(IntegerList list) 
	{
		IntegerList listToSort = list;
		IntegerNode currentNode = listToSort.getFirst();
						
		while(currentNode.getNext().getNext() != null) 
		{	
			IntegerNode temp1 = currentNode;
			IntegerNode temp2 = temp1.getNext();
			IntegerNode temp3 = temp2.getNext();

			
			///////////// deal with first node ////////////
			if(listToSort.getFirst().getNumber() == temp1.getNumber()) 
			{
				if(temp1.getNumber() > temp2.getNumber())
				{
					temp1.setNext(temp2.getNext());
					temp2.setNext(temp1);
					listToSort.setFirst(temp2);
				} 
			}
			///////////// //////////////////// ////////////


			if(temp2.getNumber() > temp3.getNumber()) 
			{
				temp2.setNext(temp3.getNext());
				temp3.setNext(temp2);
				temp1.setNext(temp3);
			} 

			currentNode = currentNode.getNext();

			//listToSort.prettyPrint();// print list after every step of the sorting.
			//System.out.println("///////");
		}

		return listToSort;
	}
	
}
