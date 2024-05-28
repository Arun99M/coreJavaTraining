package coreJavaTraining;

public class childlevel {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(b);
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childlevel a = new childlevel();
		a.getData(2);
		a.getData("arun");
		a.getData(1, 2);
	
		

	}
}


