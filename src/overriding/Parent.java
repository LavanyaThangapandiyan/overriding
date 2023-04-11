package overriding;

public class Parent 
{
		   public void doYoga()
		   {
		      System.out.println("good for health");
		   }
		   public void newsreading()
		   {
			   System.out.println("Reading newspapers will improve your knowledge");
		   }
		}

		class son extends Parent
		{
		   
		   public void doYoga() 
		   {
		      System.out.println("Yoga is good for Health");
		   }
		}

		class Main 
		{
		   public static void main(String[] args) 
		   {
		      son obj = new son();
		      obj.newsreading();
		      obj.doYoga();
		   }
		}



