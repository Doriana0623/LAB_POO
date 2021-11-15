
public class A {
	protected String a;
	protected X x;

	
	public A(String a, X x) {
		this.a = a;
		this.x = x;
	}

	public void printclas() {
    System.out.println("-----------------------I.------------------------");
	System.out.println("Clasa A:");
	System.out.println(a);
	System.out.println(x.getX());
	System.out.println("-------------------------------------------------");
	
	}
}
