public class TestMultipleCatchBlock{
	public static void main(String[] args){
		try{
			int a[] = new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e){
			System.out.println("Task 1 is complete");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Task 2 is complete");
		}
		catch(Exception e){
			System.out.println("Task 3 is complete");
		}
		System.out.println("Rest of the code...");
	}
}