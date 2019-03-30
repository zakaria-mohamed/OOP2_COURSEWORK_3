

import java.util.ArrayList;
import java.util.Scanner;


public class zack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner d= new Scanner(System.in);
		ArrayList<stdIn> Students = new ArrayList<stdIn>();
		stdIn n = null; 
		System.out.println("Enter Students ");
			num=d.nextInt();
		int i = 0;
		while(true) {
			if(i>=num)
			   break;
			else
				n=new stdIn(); 
				n.setScores();
				Students.add(n);
	        while(true){
	            System.out.println("Pick a number between 1 and "+num+" to view the corresponding student's results or type '0' to Continue Adding the student in the System.");
	            int no = d.nextInt();
	            if(no==0)
	                break;
	            else if(no>0 && no<=num){
	                int index = no-1;
	                n.printStdInfo();
	                n.printScores();
	            }
	        }
	        i++;
		}
	}
	
}
