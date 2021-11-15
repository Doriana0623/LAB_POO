
public class B extends A{
 
	protected String b;
	
	
	
	public B(String a, String b, X x) {
		super(a, x);
		this.b = b;
	}
	
	public void printclas() {
		System.out.println("------------------------II.----------------------");
		System.out.println("Clasa B:");
		System.out.println(b);
		System.out.println(x.getX());
		System.out.println("-------------------------------------------------");
		super.printclas();
		
	}
}
