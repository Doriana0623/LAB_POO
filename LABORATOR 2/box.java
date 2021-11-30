public class box {

    int height;
    int width;
    int depth;

    public box(){
        height = 1;
        width = 1;
        depth = 1;
    }

    public box(int value){
        height = value;
        width = value;
        depth = value;
    }

    public box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double aria(){
        return (2*depth*width + 2*depth*height + 2*height*width);
    }

    double volum(){
        return (height*width*depth);
    }

    public String showResult() {
        return ("\nInaltimea: " + height+"\nLatime: " + width + "\nAdancime: " + depth);
    }

}



//----------------fisier 'coada.java'------------------------


public class coada{
    int arr[], front, rear, cap, n1;

    public coada(int n) {
    	arr = new int[n];
		cap = n;
		front = 0;
		rear = -1;
		n = 0;
  
    }

    public coada(){
    	 cap = 20;
    	 arr = new int[20];
    	 front = 0;
         rear = 0;
    }

    public void pop()
	{
		if (isEmpty())
		{
			System.out.println("Nu sunt elemente in coada, nu se poate sterge");
			System.exit(1);
		}

		System.out.println("Sterge " + arr[front]);

		front = (front + 1) % cap;
		n1--;
	}


    public void push(int val)
   	{
   		
   		if (isFull())
   		{
   			System.out.println("Ati ajuns la limita, nu se mai poate adauga elemente");
   			System.exit(1);
   		}

   		System.out.println("Elementul " + val);

   		rear = (rear + 1) % cap;
   		arr[rear] = val;
   		n1++;
   	}
 
    
    

    public int size()
	{
		return n1;
	}
    
    public Boolean isEmpty()
	{
		return (size() == 0);
	}

	
	public Boolean isFull()
	{
		return (size() == cap);
	}
    
    public static void main(String[] args){
        System.out.println("----------------------I boxa-------------------------");

        
        box b2 = new box(22);
        box b3 = new box(14, 3, 11);
        
        System.out.println("Marimea boxei este: "+ b3.showResult());
        System.out.println("Aria: " + b3.aria() + "cm2");
        System.out.println("Volumul: " + b3.volum() + "cm3");
        System.out.println("\n----------------------II boxa------------------------");
        System.out.println("Marimea boxei este: "+ b2.showResult());
        System.out.println("Aria: " + b2.aria() + "cm2");
        System.out.println("Volumul: " + b2.volum() + "cm3");

        System.out.println("\n---------------------------------------------");

        coada q1 = new coada();
        coada q2 = new coada();

        System.out.println("\nPrima coada:");
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);
        q1.push(4);
        

		System.out.println("Marimea cozii " + q1.size());
        
	    q1.pop();
	    q1.pop();
		
		
		System.out.println("Marimea cozii finale " + q1.size());
		
		if (q1.isEmpty())
			System.out.println("Coada fara elemente");
		else
			System.out.println("Coada nu este goala, contine elemente");
		 System.out.println("\n---------------------------------------------");
		System.out.println("\nA doua  coada:");
        q2.push(5);
       
		System.out.println("Marimea cozii " + q2.size());

	
		q2.pop();
		System.out.println("Marimea cozii finale " + q2.size());
		
		if (q2.isEmpty())
			System.out.println("Coada fara elemente");
		else
			System.out.println("Coada nu este goala, contine elemente");


    }

}
