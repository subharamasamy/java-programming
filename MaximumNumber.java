package maximumnumber;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int[] no={6,8,3,9,13,12,34};
		int max=no[0];
		while(i<no.length)
		{
			if(max<no[i])
			{
				max=no[i];
				
			}
			i++;
		}
		System.out.print(max);

	}

}
