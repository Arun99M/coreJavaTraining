package coreJavaTraining;

public class swappingTwoNumbersorVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b =20;
		/*int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b); */
		
		//swap without variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
