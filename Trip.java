package trip;

public class Trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int trip=0;trip<=3;trip++)
		{
			for(int red=3;red>trip;red--)
			{
				System.out.print(" ");
			}
			for(int blue=0;blue<=trip;blue++)
			{
				System.out.print(" *");
							
			}
			for(int green=0;green<trip;green++)
			{
				System.out.print(" *");
				
			}
			for(int black=3;black>trip;black--)
			{
				System.out.print(" ");
				
			}
			
			System.out.println();
		}

	}

}
