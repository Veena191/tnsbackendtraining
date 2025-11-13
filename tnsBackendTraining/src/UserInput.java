

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("enter the following details");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name = sc.nextLine();
		
		System.out.println("enter the id:");
		int id = sc.nextInt();
		System.out.println("enter the details");
		System.out.println("enter the name:"+name);
		System.out.println("enter the id:"+id);
		
		
		

	}

}
