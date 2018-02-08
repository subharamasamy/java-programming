package busticket;

import java.util.Scanner;

public class BusTicketStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner subha=new Scanner(System.in);
		System.out.println("Enter the kilometres");
		int kilometre=subha.nextInt();
		System.out.println("Enter the Previous bus ticket amount");
		int ticket=subha.nextInt();
		int kiloperlitre=3;
		int totalpetrol=kilometre/kiloperlitre;
		int totalpetcost=totalpetrol*70;
		int wholebusamount=ticket*45;
		int profit=wholebusamount-totalpetcost;
		System.out.println("Previous bus ticket profit  "+profit);
		int newtickamo=ticket+(ticket*55/100);
		int newwholebusamount=newtickamo*45;
		int profit1=newwholebusamount-totalpetcost;
		System.out.println("new bus ticket profit  "+profit1);
	
		
		

	}

	
}
