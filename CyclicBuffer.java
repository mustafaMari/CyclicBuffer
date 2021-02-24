
public class CyclicBuffer<E> {
	private E [] array ; 
	private int size=0;  
	private int currentsize=0; 
	private int get = 0 ; 
	@SuppressWarnings("unchecked")
	public CyclicBuffer(int size) { 
		this.size=size; 
		array = (E[]) new Object [size];
		}
	public void add(E ele) { 
		if (isFull()) return; 
			array[currentsize]= ele; 
			currentsize++;
 	}
	public boolean isEmpty() { 
		if(get>=size) return true; 
		return false; 
	}
	public boolean isFull() {
		if (currentsize==size) return true; 
		return false; 
	}
	public E get() { 
		if(isEmpty()) return null;   
		E currele = array[get]; 
		get++; 
		return currele; 
	}
	public String toString() {
		String s="";
		for (E x : array) {
			s+=" "+x;
		}
		return s; 
	}
}
