
public class G extends F{

    protected String g;
	
	public G(String a, String b, String c, String d, String e, String f, String g, X x) {
		super(a, b, c, d, e, f, x);
		this.g = g;
	}
	
	    public void printclas() {
	    System.out.println("--------------=--------VII.----------------------");
		System.out.println("Clasa G:");
		System.out.println(g);
		System.out.println(x.getX());
		System.out.println("-------------------------------------------------");
		super.printclas();
		
}
}
