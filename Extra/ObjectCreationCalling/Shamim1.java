/**
@Md. Shamim Sarker. shamimsjava@gmail.com
*/

public class Shamim1{
	public static void main(String[] args){
		Shamim2 sm = new Shamim2();
		sm.shamim();
		Shamim2.shamim2();
		shamim3();
		shamim4();
	}
	
	public static void shamim3(){
		System.out.println("I come from method shamim3()");
	}
	
	static void shamim4(){
		System.out.println("I come from mehtod shamim4()");
	}
}

/* General discussion
* We can not call any non-static method from a static method.
* If we want to call any method which is stand in a different file then we need to create Object. But if the caller method and called method are both static method then Object ceation is no need. Then we can use ClassName.methodName();
*/