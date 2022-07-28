import java.util.*;
	class swap{
		public static void main(String[] args) {
			int a,b;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter A Number: ");
			a=sc.nextInt();
			System.out.print("Enter B Number: ");
			b=sc.nextInt();

			Swapnum(a,b);
		}
		public static void Swapnum (int a, int b){
			int temp=0;
			temp=a;
			a=0;
			a=b;
			b=temp;
			System.out.println("A:"+a);
			System.out.println("B:"+b);
		}
	}
 