package star_Pattern;

public class problem_2 {


static void Sol1(int n) 
{
	for (int i = 1; i <= n; i++)
		{
		for (int j = 1; j < n; j++) 
		{
			System.out.print(" *");
		}
		System.out.println(" ");
		}
	
}
static void Sol2(int n)
{
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
static void Sol3(int n)
{
	for (int i = 1; i <= n; i++) {
		for (int j = n; j >= i; j--) {
			System.out.print("*");
			
		}
		System.out.println(" ");
		
	}
}

static void sol4(int n) {
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j);
		}
		System.out.println(" ");
	}
	
}


static void sol5(int n )
{

	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	for (int i = 2; i <= n; i++) {
		for (int j = n; j >= i; j--) {
			System.out.print("*");
			
		}
		System.out.println(" ");
		
	}
	
}
static void sol6(int n )
{
	for (int i = 1; i <= n; i++) {
		for (int j = n-1; j >= i; j--) {
			System.out.print(" ");}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				
			}
				System.out.println(" ");
		}
		
	}
static void sol7(int n )
{
	for (int i = n; i >= 1; i--) {
		for (int j = n-1; j >= i; j--) {
			System.out.print(" ");}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				
			}
				System.out.println(" ");
		}
		
	}
static void sol8(int n )
{
	for (int i = 1; i <= n; i++) {
		for (int j = n-1; j >= i; j--) {
			System.out.print(" ");}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
				
			}
				System.out.println(" ");
		}
}	
static void sol9(int n )
{
	for (int i = n; i >= 1; i--) {
		for (int j = n-1; j >= i; j--) {
			System.out.print(" ");}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
				
			}
				System.out.println(" ");
		}
		
	}

public static void main(String[] args) {
	sol9(5);
	
}
}
