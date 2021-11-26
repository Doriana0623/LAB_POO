import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public  class GeometricBody {
	
	 public float getSurface() {
		return 0;
	}
	 public float getVolume() {
		return 0;
	}
	
//---------------Clasa copil Cub------------	 
 static class cub extends GeometricBody{
	  private float latura;
	  public cub(float latura) {
	  this.latura = latura;
	 }
	 
  public float getSurface() {
	  return 6 * (latura * latura);
	}
  public float getVolume() {
	  return latura * latura * latura;
  }
 }
//---------------Clasa copil Sfera------------ 
static class sfera extends GeometricBody{
	  private float raza;
	  public sfera(float raza) {
	  this.raza = raza;
	 }
	 
 public float getSurface() {
	  return (float) ((Math.PI* raza* raza));
	}
 public float getVolume() {
	  return (float) ((4.0 / 3) * Math.PI * Math.pow(raza, 3));
 }
}
 //---------------Clasa copil paralelipiped------------
static class paral extends GeometricBody{
	  private float l;
	  private float h;
	  private float b;
	  
public paral(float l , float h, float b) {
		  this.b = b;
		  this.h = h;
		  this.l = l;
	  }
public float getSurface() {
	
	return 2 * (l * b + b * h + h * l);
	}
public float getVolume() {
	  return l * b * h;
}
}
//--------------clasa geometribodycontroler(returneaza cea mai mare arie si suprafata)------------
public class geometricBodyControler{
	
static public GeometricBody getVolMax(ArrayList<GeometricBody> vector) {
		 float max = 0 ;
		 GeometricBody max_value = null;
		 for(GeometricBody i : vector) {
			 float max_vol = i.getVolume();
			 if(max_vol > max) {
				 max = max_vol;
				 max_value = i;
				 
			 }
		 }
		return max_value ;
	}

static public GeometricBody getSufMax(ArrayList<GeometricBody> vector) {
		 float max = 0 ;
		 GeometricBody max_value = null;
		 for(GeometricBody i : vector) {
			 float max_vol = i.getSurface();
			 if(max_vol > max) {
				 max = max_vol;
				 max_value = i;
				 
			 }
		 }
		return max_value ;
	}
}

 public static void main(String[] args) {
	 GeometricBody cub1; 
	 cub1 = new cub(5);
	 GeometricBody sfera1;
	 sfera1 = new sfera(5);
	 GeometricBody paral1 = new paral(5, 5, 5);
	 
	 ArrayList<GeometricBody> vector = new ArrayList<GeometricBody>();
	 System.out.println("\n>>>CUBUL");
	 System.out.println("Suparfata:  "+ cub1.getSurface());
	 System.out.println("Volumul:    "+ cub1.getVolume());
	 
	 System.out.println("\n>>>SFERA");
	 System.out.println("Suparfata:  "+ sfera1.getSurface());
	 System.out.println("Volumul:    "+ sfera1.getVolume());
	 
	 System.out.println("\n>>>PARALEPIPED");
	 System.out.println("Suparfata:  "+ paral1.getSurface());
	 System.out.println("Volumul:    "+ paral1.getVolume());
	 
	 vector.add(sfera1);
	 vector.add(cub1);
	 vector.add(paral1);
	 System.out.println("\n\n>>>");
	 System.out.println("Cel mai mare volum:  " + geometricBodyControler.getVolMax(vector).getVolume());
	 System.out.println("Cea mai mare suprafata:  " + geometricBodyControler.getSufMax(vector).getSurface());
	
	 
	 
	 
 }
}

		 
	
	
