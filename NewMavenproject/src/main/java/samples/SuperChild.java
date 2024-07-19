package samples;

public class SuperChild extends Super {
	int sum=55;
	public SuperChild(){
		 super();                                              
		 System.out.println("Constructor 2");
		 super.dis();                                       
		 System.out.println(super.sum);                                                                                                   
	}
	

	public void dis(){
		System.out.println("Method 2");                                                                                                                           
	   }

	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.dis();
	}
}
