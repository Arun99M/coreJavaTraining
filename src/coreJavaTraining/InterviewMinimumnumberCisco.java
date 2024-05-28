package coreJavaTraining;

public class InterviewMinimumnumberCisco {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{2,4,5},{3,1,7},{8,2,9}};
		int min = abc[1][2];
		int mincoloumn = 0;
		
		for(int i =0; i<3; i++)
		{
			for(int j =0; j<3;j++)
			{
				if(abc[i][j]< min)
				{
					min = abc[i][j];
					mincoloumn=j;
				}
			}
		}
		//System.out.println(min);
		int max= abc[0][mincoloumn];
		int k=0;
		
		while(k<3)
		{
			if(abc[k][mincoloumn]>max)
			{
				max = abc[k][mincoloumn];
			}
			k++;
		}
		System.out.println(max);

	}

}
