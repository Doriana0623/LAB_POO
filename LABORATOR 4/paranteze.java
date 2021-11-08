package LAB4;

import java.util.Stack;
import java.io.File;
import java.util.Scanner;

public class paranteze {
	
	static boolean verParanteze(String expresie)
	{
		Stack<Character> stack = new Stack();
		for(int i = 0; i<expresie.length(); i++)
		{
			if(expresie.charAt(i) == '(')
			{
				stack.push(expresie.charAt(i));
			}
			
			if(expresie.charAt(i) == ')')
			{
				if(stack.empty()) {
					return false;
				}
				
				Character top = stack.pop();
				if((top == '(' && expresie.charAt(i) != ')' ))
				{
					return false;
				}
			}
		}
		return stack.empty();
		
	}

	public static void main(String[] args) throws Exception 
	{
		File file = new File("D:\\GICU  SALVARE\\a anul 2\\POO\\LABORATOR 4\\LAB4\\src\\LAB4\\one_expression.txt");
		Scanner sc = new Scanner(file);
		System.out.println("Expresia din fisier:");
		while(sc.hasNextLine())
		{
			String expresie = sc.nextLine();
			String expresiewithoutSpaces = expresie.replaceAll("\\s+", "");
			System.out.println(expresie);
			
			if(paranteze.verParanteze((expresiewithoutSpaces)))
			{
				System.out.println("Expresia este adevarata!"); 
			}
			else
			{
				System.out.println("Expresia este falsa!");
			}
		}
		sc.close(); 
	}

}
