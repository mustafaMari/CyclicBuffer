
public class Main{
	public static void main(String[] args) { 
		CyclicBuffer<Character> test= new CyclicBuffer<>(35);
		String s="2 fihsuhf 43t3 3r3th"; 
		for (char x :  s.toCharArray()) {
			test.add(x);
		}
		while (!test.isEmpty()) {
			System.out.println(test.get());
		}
	}
}
