package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int[] marks=new int[5];
		int total=0;
		for(int count=0;count<marks.length;count++)
		{
			marks[count]=sc.nextInt();
			total=total+marks[count];
			
		}
		System.out.print(total);
		

	}

}
