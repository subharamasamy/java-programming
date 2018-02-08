package routewhile;

public class RouteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iv=0;
		
		while(iv<3)
		{
			int buscount=0;
			while(buscount<=iv)
			{
				System.out.print(" bus");
				buscount=buscount+1;
				
			}
			System.out.println();
			iv=iv+1;
		}
		
		
		
	}

}
