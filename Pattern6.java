package pattern6;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int start=3;start>=1;start--)
		{
			for(int space=1;space<start;space++)
			{
				System.out.print(" ");
			}
			for(int fst=3;fst>=start;fst--)
			{
				System.out.print(start);
			}
			System.out.println();
		}


	}

}
