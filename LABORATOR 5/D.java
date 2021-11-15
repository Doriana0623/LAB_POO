
public class D extends C{

	protected String d;
	
	public D(String a, String b, String c, String d, X x) {
		super(a, b, c, x);
		this.d = d;
	}
	
	public void printclas() {
		System.out.println("-----------------------VI.-----------------------");
		System.out.println("Clasa D:");
		System.out.println(d);
		System.out.println(x.getX());
		System.out.println("-------------------------------------------------");
		super.printclas();
		
}
}
