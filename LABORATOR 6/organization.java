import java.util.*;



public class organization {
	
	public class Person
	{
		public String title;
		public String givenName;
		public String familyName;
		public String name;
		public Date birthdate;
		public boolean gender;
		public String phone;
		public String homeAdress;
		
		public String fullName() {
			return title + givenName + name + familyName;
		}
	}
	
	public class Patient extends Person
	{
	    public String id;
	    public Date accepted;
	    public String[] sickness;
	    public String[] prescriptions;
	    public String[] allergies;
	    public String[] specialReqs;

	   
	}
	
	public class Hospital 
	{
	    public String id;
	    public String address;
	    public String phone;
	    public Department[] departments;
	}
	
	public class Department
	{
	    public Staff[] staff;
	}
	
	public class Staff extends Person
	{
	    public Date joined;
	    public String[] education;
	    public String[] certifications;
	    public String[] languages;
	}
	
	public  class OperationsStaff extends Staff {

	}
	
	public  class AdministrativeStaff extends Staff {

	}
	
	public  class TechnicalStaff extends Staff {

	}
	
	public class Technician extends TechnicalStaff {

	}
	
	public class Technologist extends TechnicalStaff {

	}
	
	public class SurgicalTechnologist extends Technologist {

	}
	
	public class FrontDeskStuff extends AdministrativeStaff {

	}
	
	public class Receptionist extends FrontDeskStuff {

	}
	
	public class Nurse extends OperationsStaff {

	}
	
	public class Doctor extends OperationsStaff {

	    public String[] specialty;
	    public String[] locations;
	}
	
	public class Surgeon extends Doctor {
	}
	
	static public void main(String[] args)
    {
        organization org = new organization();
        organization org1 = new organization();

        System.out.println(org);
        System.out.println(org1);
    }
	
}
