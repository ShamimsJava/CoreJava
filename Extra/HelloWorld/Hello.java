/**
@Md. Shamim Sarker. shamimsjava@gmail.com
*/

public class Hello{
	public static void main(String[] args){
		System.out.println("Hello, World!");
	}
}


/* General Discussion
* class is a keyword, it is compulsory when we create a class.
* Hello is a class name. The first letter of a class should be capital letter. It does not mandatory but recommended.
* We should use same name as file name and class name. If we do not use public access modifier then it is not mandatory to use same name. that time we can use different name. But after compilation we can see that className.class file automatically create. And after compilation we have to use the .class file name without extension. So if we use the same name as file and class then it is better. Now if we use public access modifier at the time of creating class then file name and class name must be same name. 
* public is an access modifier. protected, private and default are also access modifier.
* static is a non-access modifier. final, transient, synchronized and volatile are also non-access modifier.
* void is a return type. If we use void return type that means the method does not return any value. String, int etc. are some other return type. 
* main is a name of main method. Every java program has only one main method. Without main mehtod no java program can execute. 
* args is a String type array. args is user define name, but everybody use args in main method.
* System is a class name. out is an object name and println is a method name.
*/

/* cmd command
* open cmd in home directory after jdk installation and setting the path
* javac Hello.java (for compilation, if the program is correct then create a class file automatically which file contain bytecode)
* java Hello (for execute the program. this Hello is not the java file, it is .class file)

*/