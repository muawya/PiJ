//package bubble_sort;

public class ListUtilitiesDriver
{
	public static void main(String[] arges)
	{
		IntegerList listToSort = new IntegerList();

		/*listToSort.add(10);
		listToSort.add(2);
		listToSort.add(23);
		listToSort.add(211);
		listToSort.add(20);*/

		/*listToSort.add(54);
		listToSort.add(25);
		listToSort.add(5);
		listToSort.add(74);
		listToSort.add(23);*/

		listToSort.add(54);
		listToSort.add(2);
		listToSort.add(23);
		listToSort.add(211);
		listToSort.add(56);
		listToSort.add(5);
		
		System.out.println("List before sorting: ");
		listToSort.prettyPrint(); // print list before being sorted.

		System.out.println("List after sorting with ListUtilities1 - without dealing with first node situation: ");
		listToSort = ListUtilities1.bubbleSort(listToSort);
		listToSort.prettyPrint();

		System.out.println("List after sorting with ListUtilities2 - first node situation resolved ");
		listToSort = ListUtilities2.bubbleSort(listToSort);
		listToSort.prettyPrint();

		System.out.println("List after sorting with ListUtilities3 - repeat the process multiple times until the list is sorted ");
		listToSort = ListUtilities3.bubbleSort(listToSort);
		listToSort.prettyPrint();

	}
}
