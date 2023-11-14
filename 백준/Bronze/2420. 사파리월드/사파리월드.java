import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		long answer = Math.abs(N-M);
		System.out.print(answer);
	}

}