package 토너먼트;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String competition = sc.nextLine();
		String[] cpArr = competition.split(" ");
		int N = Integer.parseInt(cpArr[0]);
		int A = Integer.parseInt(cpArr[1]);
		int B = Integer.parseInt(cpArr[2]);
		int i = 0;
		
		while(true) {
			i++;
			if(A+1==B && B%2==0) {
				System.out.println(i);
				break;
			}else {
				if(N%2==0) {
					N = N/2;
				}else {
					N = (N+1)/2;
				}
				if(A%2==0) {
					A = A/2;
				}else if(A==1){
					A = 1;
				}else {
					A = (A+1)/2;
				}
				if(B%2==0) {
					B = B/2;
				}else {
					B = (B+1)/2;
				}
			}
		}
		
		sc.close();
		
	}

}
