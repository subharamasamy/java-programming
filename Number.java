package number;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no={5,6,7,4,10,8};
		int largest=0,second=0;
		for(int i=0;i<no.length;i++)
		{
			if(no[i]>largest)
			{
				second=largest;
				largest=no[i];
			}
			else if(no[i]>second)
			{
				second=no[i];
			}
			
		}
		System.out.println(largest);
		System.out.print(second);

	}

}
