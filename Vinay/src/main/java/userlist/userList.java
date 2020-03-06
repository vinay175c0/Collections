package userlist;

public class userList<T> {
	private T[] array;

	userList(T[] userArray) {
        array = userArray;
    }
	
	@SuppressWarnings("unchecked")
	public void removeElementAtIndex(int index) {	
		if (index > size()) {
			throw new ArrayIndexOutOfBoundsException("Index out of bound");
		}
		int tempArrayIndex = 0;
		Object[] tempArray = new Object[size()-1];
		for ( int i = 0 ; i < size() ; i++ ) {
			if ( i != index ) {
				tempArray[tempArrayIndex++] = array[i];
			}
		}
		array =(T[]) tempArray;
	}
	

    public T replaceElementAtIndex(int index, T element) {
        T oldValue = array[index];
        array[index] = element;
        return oldValue;
    }
	
	@SuppressWarnings("unchecked")
	public void addElementAtEnd(T element) {
		Object[] tempArray = new Object[size()+1];
		int i = 0;
		for ( i = 0 ; i < size() ; i++ ) {
			tempArray[i] = array[i]; 
		}
		tempArray[i] = element;
		array = (T[]) tempArray;
	}

	public T fetchElementAtIndex(int index) {
		return array[index];
	}

	public int size() {
		return array.length;
	}
	
	@SuppressWarnings("unchecked")
	public void removeLastElement() {
		Object[] tempArray = new Object[size()-1];
		int i = 0;
		for ( i = 0 ; i < size()-1 ; i++ ) {
			tempArray[i] = array[i]; 
		}
		array = (T[]) tempArray;
	}
	
	public void printAllElements() {
		for (int i= 0 ; i < size() ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	
	

}
