import java.io.*;

public class Palin {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Enter any String:\nTo Terminate the program enter GSCRnsit:");
			String str=br.readLine();
			if(str.equals("GSCRnsit")){
				System.out.println("Program Terminated!!");
				return;
			}
			else {
				if(palin(str)==1) System.out.println("The String you entered is a Palindrome");
				else System.out.println("The String you entered is not a Palindrome");
			}
		}
	}
	static int palin(String str) {
		int l=str.length();
		for(int i=0;i<l/2;i++) {
			if(str.charAt(i)!=str.charAt(l-1-i)){
				return 0;
			}
		}
		return 1;
	}
}	
