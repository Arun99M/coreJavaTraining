package coreJavaTraining;

public class thiskeyword {
	
	int a = 5;
	
	public void getData()
	{
		int a = 4;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskeyword tk = new thiskeyword();
		tk.getData();

	}

}
