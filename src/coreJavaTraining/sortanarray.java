package coreJavaTraining;

public class sortanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,3,7,5,9};
		int temp;
		
		for (int i=0; i<5; i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		//print the sorted array
		for (int i=0; i<5 ; i++)
		{
			System.out.println(a[i]);
		}

	}
}
