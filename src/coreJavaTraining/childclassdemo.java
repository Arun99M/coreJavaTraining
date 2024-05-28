package coreJavaTraining;

public class childclassdemo extends parentClassdemo{
	
	public void engine()
	{
		System.out.println("new engine");
	}
	public void colour()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childclassdemo a = new childclassdemo();
		
		a.colour();
		a.brakes();
		a.Audiosystem();
		a.engine();

	}

}
