import java.util.*;
import java.util.Scanner;


public class text {

	    String Text;
	    char[] textArr;
	    int propozitii = 0;
	    int vocale = 0;
	    int consoane = 0;
	    int litere = 0;
	    
	    
public text(String Text)
{
	this.Text = Text;
	this.textArr = this.Text.toCharArray();
}


//-------------NR de Cuvinte-------------------
	public int nrCuv()
	 {
		 int count = 1;
		 for(int i = 0; i< Text.length()-1; i++)
		 {
			 if(Text.charAt(i) == ' ' && Text.charAt(i + 1) != ' ')
			 {
				 count++;
			 }
			    
		 }
		 return count;
	 }

	
//-------------NR de Propozitii-------------------
	 public int nrProp()
	 {
		 for(int i = 0; i< this.textArr.length; i++)
		 {
			 if(Text.charAt(i) == '.' || Text.charAt(i) == '!' || Text.charAt(i) == '?')
			 {
				 propozitii++;
		     }
	 }
	 return propozitii;
     }
	 
	 
//-------------NR de Litere-------------------	 
	 public int nrLit()
	 {
		 for(int i = 0; i < Text.length(); i++)
		 {
			 if(Character.isLetter(Text.charAt(i)))
					 litere++;
		 }
		 return litere;
	 }
	
	 
//-------------NR de Vocale-------------------	
	 public int nrVoc()
	 {
		 for(int i = 0; i < this.textArr.length; i++)
		 {
			 if(Text.charAt(i) == 'A' || Text.charAt(i) == 'a' || Text.charAt(i) == 'E' || Text.charAt(i) == 'e'|| Text.charAt(i) == 'I' || Text.charAt(i) == 'i' || Text.charAt(i) == 'O'|| Text.charAt(i) == 'o' || Text.charAt(i) == 'U' || Text.charAt(i) == 'u')
			 {
				 vocale++;
			 }
		 }
		 return vocale;
	 }
	 
	 
//-------------NR de Consoane-------------------	 
	 public int nrCons() 
	 {
		 Text = Text.toLowerCase();
		 for(int i = 0; i < this.textArr.length; i++)
		 {
			 if(Text.charAt(i) == 'a' || Text.charAt(i) == 'e' || Text.charAt(i) == 'i' || Text.charAt(i) == 'o' || Text.charAt(i) == 'u' || Text.charAt(i) == '.')
			 {
				 System.out.println(" ");
				 
			 }
			 else if(Text.charAt(i) != ' ')
			 {
				 consoane++;
			 }
		 }
		 return consoane;
	 }
		 
	 
//-------------Cel mai lung cuvant-------------------	
	 public String cuvLung()
	 {
		String cuv_lung = "";
		String[] cuv  = this.Text.split(" ");
		for(int i = 0; i < cuv.length; i++)
		
			if(cuv[i].length() >= cuv_lung.length()) 
			{
				cuv_lung = cuv[i];
			}
		return cuv_lung;
	 }
	 
	 
//-------------Cel mai frecvent cuvant-------------------
	 public String freCuv()
	 {
		 
		 String[] arr = this.Text.split("\\s+");
	        HashMap<String, Integer> hs = new HashMap<String, Integer>();

	        for (int i = 0; i < arr.length; i++) {

	            if (hs.containsKey(arr[i])) {
	                hs.put(arr[i], hs.get(arr[i]) + 1);
	            } else {
	                hs.put(arr[i], 1);
	            }
	        }

	        Set<Map.Entry<String, Integer>> set = hs.entrySet();
	        String key = "";
	        int value = 0;

	        for (Map.Entry<String, Integer> me : set) {
	            if (me.getValue() > value) {
	                value = me.getValue();
	                key = me.getKey();
	            }
	        }
	        return key;
	    }
	 
	 
	public static void main(String[] arg) {
		
		System.out.println("DAti un text aici:");
		Scanner input = new Scanner(System.in);
        String Text = input.nextLine();
        text TextInput = new text(Text);
        System.out.println("==========================================");
        System.out.println("Num de Propozitii: " + TextInput.nrProp());
        System.out.println("==========================================");
        System.out.println("Num de Cuvinte:" + TextInput.nrCuv());
        System.out.println("==========================================");
        System.out.println("Litere: " + TextInput.nrLit());
        System.out.println("==========================================");
        System.out.println("Vocale: " + TextInput.nrVoc());
        System.out.println("==========================================");
        System.out.println("Consoane: " + TextInput.nrCons());
        System.out.println("==========================================");
        System.out.println("CEl mai frecvent cuvantt: " + TextInput.freCuv());
        System.out.println("==========================================");
        System.out.println("Cel mai lung cuvant: " + TextInput.cuvLung());
        System.out.println("==========================================");
        

	}
}
