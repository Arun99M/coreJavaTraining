package coreJavaTraining;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		a[3] = 6;
		a[4] = 7;
		
		int b[] = { 1,2,4,5,7,8,0};
		for (int i =0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}
