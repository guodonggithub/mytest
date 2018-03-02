package test;

public class xing {
	public static void main(String[] args) {
		System.out.println("     *");
		for (int i = 4; i > 0 ; i--) {
			for (int ii = 0; ii < i; ii++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			for (int iii = 1; iii < 2*(5-i); iii++) {
				System.out.print(" ");
				}
			System.out.println("*");
			}
		for (int i = 0; i <4 ; i++) {
			for (int ii = 0; ii < i; ii++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			for (int iii = 1; iii < 2*(5-i); iii++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		System.out.println("     *");
	}
}

