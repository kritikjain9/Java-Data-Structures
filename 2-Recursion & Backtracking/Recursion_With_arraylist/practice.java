import java.io.*;
import java.util.*;

public class practice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of jumbled character array");
		int n = scn.nextInt();
		if(!(n >= 5 && n <= 9)){
		    System.out.println("Invalid Array Size");
		    return;
		}
		System.out.println("Enter "+ n+ " characters");
		char[] codes = new char[n];
		for(int i = 0; i < n; i++){
		    codes[i] = scn.next().charAt(0);
		}
		
		System.out.println("Enter the hint code");
		int decpt = scn.nextInt();
		String decString = Integer.toString(decpt); 
		
		String ans = "";
		for(int i = 0; i < decString.length(); i++){
		    int val = Integer.parseInt(decString.charAt(i)+"");
		    ans = ans + codes[val]; 
		}
		
		System.out.println(ans);
		
	}

}