package coreJavaTraining;

public class thiskeywordpractice {
	int a = 5;
	
	public void getData()
	{
		int a = 6;
		int b = a+this.a;
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeywordpractice tk = new thiskeywordpractice();
		tk.getData();

	}

}
