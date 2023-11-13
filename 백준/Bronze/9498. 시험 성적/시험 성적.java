import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		if(90 <= T) {
			System.out.println("A");
		}
		else if(80 <= T) {
			System.out.println("B");
		}
		else if(70 <= T) {
			System.out.println("C");
		}
		else if(60 <= T) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		sc.close();
	}

}