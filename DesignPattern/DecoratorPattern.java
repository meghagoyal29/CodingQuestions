package DesignPattern;

public class DecoratorPattern {
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
		System.out.println(c.getCost()+ "  " + c.getIngredients());
		c = new WithHazelNut(c);
		System.out.println(c.getCost()+ "  " + c.getIngredients());
		c = new WithMilk(c);
		System.out.println(c.getCost()+ "  " + c.getIngredients());
		
	}
}

interface Coffee{
	int getCost();
	String getIngredients();
}

class SimpleCoffee implements Coffee{
	public int getCost() {
		return 1;
	}
	public String getIngredients() {
		return "Coffee";
	}
	
}

 abstract class CoffeeDecorator implements Coffee {
	
	 Coffee decoratedCoffee;
}
 
 class WithMilk extends CoffeeDecorator{

	 public WithMilk(Coffee c) {
		 this.decoratedCoffee = c;
	 }
	@Override
	public int getCost() {
		
		return decoratedCoffee.getCost()+2;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getIngredients()+" Milk";
	}
 }
	 class WithHazelNut extends CoffeeDecorator{

		 public WithHazelNut(Coffee c) {
			 this.decoratedCoffee = c;
		 }
		@Override
		public int getCost() {
			
			return decoratedCoffee.getCost()+3;
		}

		@Override
		public String getIngredients() {
			// TODO Auto-generated method stub
			return decoratedCoffee.getIngredients()+" HazelNut";
		}
	 
 }