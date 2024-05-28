package coreJavaTraining;

public class exceptionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 0;
		
		try {
			//int k = a/b;
			
			int arr[] = new int[5];
			System.out.println(arr[7]);
		}
		
		/*catch(ArithmeticException et)
		{
			System.out.println("I catched Arithmeticexception");
		}
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("I catched IndexBoundexception");
		}
		catch(Exception e)
		{
			System.out.println("I catched error/exception");
		}*/
		finally
		{
			System.out.println("delet cookies");
		}

	}

}