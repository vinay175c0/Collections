package userlist;

public class A{
	public static void main( String[] args )
    {
    	Integer[] array = new Integer[] {1,2,3,4,5};
    	
    	userList<Integer> userList = new userList<Integer>(array);
    	
    	System.out.print("Initial List: ");
    	userList.printAllElements();
    	
    	userList.addElementAtEnd(69);
    	System.out.print("After adding 69 to list: ");
    	userList.printAllElements();
    	
    	userList.replaceElementAtIndex(4, 112);
    	System.out.print("After replacing 4th index element with 112: ");
    	userList.printAllElements();
    	
    	System.out.println("Fetching element at index 2: "+userList.fetchElementAtIndex(2));
    	
    	userList.removeElementAtIndex(2);
    	System.out.print("After removing 2th index element: ");
    	userList.printAllElements();
    }
}
