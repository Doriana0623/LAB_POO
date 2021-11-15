
public class E extends D{

    protected String e;
	
	public E(String a, String b, String c, String d, String e, X x) {
		super(a, b, c, d, x);
		this.e = e;
	}
	
	public void printclas() {
		System.out.println("-------------------------V.----------------------");
		System.out.println("Clasa E:");
		System.out.println(e);
		System.out.println(x.getX());
		System.out.println("-------------------------------------------------");
		super.printclas();
		
}
}
