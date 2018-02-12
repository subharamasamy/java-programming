package arraypgm;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] student=new int[5];
		for(int studentcount=0;studentcount<student.length;studentcount++)
		{
		
		int[] marks=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int total=0;
		for(int count=0;count<marks.length;count++)
		{
			marks[count]=sc.nextInt();
			total=total+marks[count];
			
		}
		System.out.print(total);

	}
	}

}
