package coreJavaTraining;

public class typesofconstructor {
	
	//Default Constructor
	
	public typesofconstructor()
	{
		System.out.println("I am default constructor");
	}

	//Parameterized constructor
	public typesofconstructor(int a , int b)
	{
		System.out.println("I am parameterized");
		int c = a+b;
		System.out.println(c);
	}
	
	public typesofconstructor(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {

		typesofconstructor tc = new typesofconstructor("hello");
		typesofconstructor tc1 = new typesofconstructor(2 ,4);
		typesofconstructor tc2 = new typesofconstructor();

	}

}
