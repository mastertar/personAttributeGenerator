import java.util.*;
public class HumanTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String iName; 
		int iAge;	
		boolean iIsCool;
		boolean manual;
		
		System.out.println("Manual: ");
		manual = input.nextBoolean();
		input.nextLine();
		if (manual == true)
		{
			System.out.println("Name of the person: ");
			iName = input.nextLine();
			System.out.println("What is the age: ");
			iAge = input.nextInt();
			
			Human human1 = new Human(iName, iAge);
			
			System.out.println(human1);	
		}
		else  {
			Human human1 = new Human();
			
			System.out.println(human1);
		}
	}

}
