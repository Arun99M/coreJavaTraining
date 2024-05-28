package coreJavaTraining;

public class stringclassdemo {
	
	public static void main (String [] args) {
		
		String a = " javatraining";
		System.out.println(a.charAt(2));    //character at index2 is v
		System.out.println(a.indexOf("e"));  //what is the index of e
		System.out.println(a.substring(3, 6)); // begining index, end index
		System.out.println(a.substring(5));    // end index
		System.out.println(a.concat("arun kumar"));  // 
		System.out.println(a.length());       // maximumlength of the string
		System.out.println(a.trim());         // white space will be removed
		System.out.println(a.toUpperCase());  //
		System.out.println(a.toLowerCase());
		
		String arr[] = a.split("t");   //split the entire string, there is a two string so we will store in 2 index
		System.out.println(arr[0]);     //
		System.out.println(arr[1]);
		
		
	}

}
