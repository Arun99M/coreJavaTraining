package coreJavaTraining;

public class SuperchildClass extends SuperparentClass{
	String name = "QAclickAcademy";
	
	public SuperchildClass()
	{
		super();//this should be always be at first line 
		System.out.println("child class Constructor");
	}
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperchildClass cd = new SuperchildClass();
		cd.getStringdata();
		cd.getData();
		

	}

}
