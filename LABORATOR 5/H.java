
public class H extends G{

    protected String h;
	
	public H(String a, String b, String c, String d, String e, String f, String g, String h, X x) {
		super(a, b, c, d, e, f, g, x);
		this.h = h;
	}
	
	    public void printclas() {
	    System.out.println("----------------------VIII.----------------------");
		System.out.println("Clasa H:");
		System.out.println(h);
		System.out.println(x.getX());
		System.out.println("-------------------------------------------------");
		super.printclas();
		
}
}
