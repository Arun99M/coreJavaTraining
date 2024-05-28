package coreJavaTraining;

public class staticvar {
	
	String name; // instance variables
	String address ;
	static String city = "bangalore";
	static int i = 0;
	
	staticvar(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	public void getAddress()
	{
		System.out.println(address+ " " + city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticvar sv = new staticvar("arun", "marathalli");
		staticvar sv1 = new staticvar("arun", "BTM");
		staticvar sv2 = new staticvar("kumar", "HSR");
		sv.getAddress();
		sv1.getAddress();
		sv2.getAddress();
		//staticvar.getcity();
		//staticvar.i=4;


	}

}
