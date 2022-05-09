package 이구역의승자는;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		String[] tArr = text.split(" ");
		int[] nArr = new int[tArr.length];
		
		int i;
		for(i=0; i<tArr.length; i++) {
			switch(tArr[i]) {
				case "C","I", "J", "L", "O", "S", "U", "V", "Z":
					nArr[i] = Integer.parseInt(tArr[i]);
					break;
				case "B", "D", "P", "Q", "R", "T", "W", "X", "Y":
					nArr[i] = Integer.parseInt(tArr[i]);
					break;
				case "A", "E", "F", "G", "H", "K", "M", "N":
					nArr[i] = Integer.parseInt(tArr[i]);
			}
		}
		
		/*int n; //문자수가 홀수일 경우를 대비하여 
		int j;
		for(j=0; )
		if(nArr.length%2==0) {
			n = nArr.length;
		}else {
			n = nArr.length -1;
		}
		
		for(i=0; i<n; i=i+j) {
			nArr[i] = nArr[i]+nArr[i+1];
			if(nArr[i]>10) {
				nArr[i]=nArr[i]%10;
			}
			
		}
		
		
		
		int sum = 0;
		for(i=0; i<nArr.length; i=i+2) {
			sum += nArr[i];
			if(sum>10) {
				sum = sum%10;
			}
		}
		
		
		if(sum%2!=0) {
			System.out.println("I'm a winner!");
		}else {
			System.out.println("You're the winner?");
		}*/
		
		
		

		
		sc.close();
		
	}

}
