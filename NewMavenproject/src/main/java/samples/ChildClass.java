package samples;

public class ChildClass extends Parent {

	public void add(int a, int b) {
		System.out.println((a+b));
	}

	public static void main(String[] args) {
		Parent obj = new ChildClass();
		
        obj.add(10, 20);
	

	}

}
