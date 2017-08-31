class A{
	void m(){
		System.out.println("Hello m");
	}
	
	void n(){
		System.out.println("Hello n");
		this.m(); // if I don't use this keyword compiler automatic use this keyword 
	}
}

class TestThis4{
	public static void main(String[] args){
		A a = new A();
		a.n();
	}
}