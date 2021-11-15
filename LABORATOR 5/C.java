
public class C extends B {
 
	protected String c;
	
	public C(String a, String b, String c, X x) {
		super(a, b, x);
		this.c = c;
	}
	
	public void printclas() {
		System.out.println("-------------------------III.--------------------");
		System.out.println("Clasa C:");
		System.out.println(c);
		System.out.println(x.getX());
		System.out.println("-------------------------------------------------");
		super.printclas();
		
	}
}
