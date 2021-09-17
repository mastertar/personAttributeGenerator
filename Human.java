import java.lang.Math;

public class Human {
	
	private String name;
	private int age;
	private String isCool;
	private double rand;
	
	public Human(String hName, int hAge) 
	{
		name = hName;
		age = hAge;
		rand = ((int) (Math.random() + 0.5));
		
		if (rand == 1) 
		{
			isCool = "is cool.";
		}
		else 
		{
			isCool = "is not cool.";
		}
	}
	
	public Human()
	{
		name = "Tarun";
		age = 15;
		
		isCool = "is cool.";
				
	}
	public String toString() 
	{
		return name + " is " + age + " years old, and " + isCool;
	}
	
}
