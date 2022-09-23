package star_Pattern;

public class problem_1 {
	public static void main(String[] args) {
		pattern7(5);

	}

	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int j = 1; j <= row; j++) {
				System.out.print("* ");

			}
			System.out.println("  ");

		}

	}

	static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int j = 1; j <= n - row + 1; j++) {
				System.out.print("* ");

			}
			System.out.println("  ");

		}

	}

	static void pattern3(int n) {
		{
			for (int i = 0; i < n; i++) {
				System.out.print(" ");
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");
				}

				System.out.println(); // ending line after each row
			}
		}
	}
	
	static void pattern2a(int n) {
		for (int row = n; row >= 1; --row) {
			for (int j = 1; j <= row; ++j) {
				System.out.print("* ");

			}
			System.out.println("  ");

		}

	}
	
	
	static void pattern4(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i ;j++) {
				System.out.print(j);
				
			}
			System.out.println(" ");
			
		}
	}
	static void pattern5 (int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.print("*");
			for(int j = 1 ;j <= n-1 ; j++)
			{
				if (i == n)
					System.out.print(" * ");
				
			}
			System.out.println(" ");
		}
	}
	
	static void pattern6 (int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.print("*");
			for(int j = 1 ;j <= n-1 ; j++)
			{
				if (i == 1 || i == 3)
					System.out.print(" * ");
				
			}
			System.out.println(" ");
		}
	}
	static void pattern7(int n )
	{
		for (int i = 1; i<= n ; i++)
		{
			for (int j = n-1 ; j >= i; j--) {
				System.out.print(" ");
				
			}
			for (int k = 1; k<= i ; k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
}
