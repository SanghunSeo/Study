package solved.ac;

import java.util.Scanner;

public class Solution2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		long answer = Math.abs(N-M);
		System.out.print(answer);
	}

}
