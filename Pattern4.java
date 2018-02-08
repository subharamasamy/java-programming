package pattern4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int start=1;start<=3;start++)
		{
			for(int fst=2;fst>=start;fst--)
			{
				System.out.print(" ");
				
			}
			for(int snd=start;snd>=1;snd--)
			{
				System.out.print(start);
				
							
			}
			System.out.println();
			
		}

	}

}
