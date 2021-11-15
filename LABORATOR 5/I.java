
public class I extends H{

    protected String i;
	
	public I(String a, String b, String c, String d, String e, String f, String g, String h, String i, X x) {
		super(a, b, c, d, e, f, g, h, x);
		this.i = i;
	}
	
	    public void printclas() {
	    System.out.println("-----------------------IX.-----------------------");
		System.out.println("Clasa I:");
		System.out.println(i);
		System.out.println(x.getX());
		System.out.println("-------------------------------------------------");
		super.printclas();
		
}
}