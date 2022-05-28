package StringcharDelete;

import java.util.Scanner;

public class DeleteChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.nextLine();
		
		System.out.println("enter a character you want to delete from a given string");
		String strchar=sc.next();
		
		str=str.replace(strchar,"");
		System.out.println("The new string after removing the char is="+str);

	}

}
