class Animal{
	String color = "white";
}

class Dog extends Animal{
	String color = "black";
	
	void printColor(){
		System.out.println(color); // color of Dog class
		System.out.println(super.color); // color of Animal class
	}
}

class TestSuper1{
	public static void main(String[] args){
		Dog d = new Dog();
		d.printColor();
	}
}