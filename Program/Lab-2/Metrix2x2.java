import java.util.*;
class Metrix2x2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a [][] = new int [2][2];
		int b [][] = new int [2][2];



		System.out.println("Enter First Metrix Elements : ");

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				a [i][j] = sc.nextInt();
			}
			System.out.print("");
		}


		
		System.out.println("Enter Second Metrix Elements : ");

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				b [i][j] = sc.nextInt();
			}
			System.out.print("");
		}



		int sum [][] = new int [2][2];

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				sum [i][j] = a [i][j] + b [i][j];
			}
		}



		System.out.println("Sum Of 2 Metrix");

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				System.out.print(sum [i][j]+"");
				System.out.print("  ");
			}
			System.out.println("  ");
		}

	}
}