package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] math = new int[m][n]; 		
		
		for(int i=0 ; i<math.length ; i++) {
			for(int j=0 ; j<math[i].length ; j++) {
				math[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter the number want to find: ");
		int find = sc.nextInt();
		
		for(Integer i=0 ; i<math.length ; i++) {
			for(int j=0 ; j<math[i].length ; j++) {
				if(math[i][j] == find) {
					System.out.println("Position " + i +"," + j +":");
					if(j>0) {
						System.out.println("Left: "+ math[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up : "+ math[i-1][j]);
					}
					if(j<math[i].length-1) {
						System.out.println("Right: "+ math[i][j+1]);
					}
					if(i<math.length-1) {
						System.out.println("Down: "+ math[i+1][j]);
					}
					System.out.println();
				}				
			}
		}
		
		sc.close();
	}

}
