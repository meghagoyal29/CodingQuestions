package DesignPattern;

public class ChildClass implements ParentInterface{

	@Override
	public void makesound() {
		System.out.println(ChildClass.class);
	}
	
	public static void main(String[] args) {
		ParentInterface child = new ChildClass();
		child.makesound();
	}
	
}
