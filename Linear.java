package linear;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] id={12,5,6,7,8};
		int searchingid=7;
		int i=0;
		while(i<id.length)
		{
			if(id[i]==searchingid)
			{
				System.out.print("i got the number 7");
				break;
			}
			i++;
		}

	}

}
