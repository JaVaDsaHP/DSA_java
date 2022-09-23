package Array_Solution;

public class sol1 {
	public static void main(String[] args) {
//		int[] a = new int[] { 6, 2, 8, 4, 5, 10, 9, 7 ,1};
		int[] a = new int[] {1,2,1,1,0,1,2,0,0,1,1,2};
		o1(a);
	}

	static void reverse(int a[]) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}

	static void maxi_min(int a[]) {
		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				System.out.print(max);
			} else if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println(max);
		System.out.println(min);
	}

	static void sortasc(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

			System.out.print("  " + a[i]+ " ");
		}

	}
	
	static void sortdec(int a[])
	{
		int temp ; 
		for (int i = 0 ; i < a.length;i++) {
			for (int j= i+1 ; j<a.length;j++) {
				if(a[i]> a[j])
				{
					temp =a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
			System.out.print(" "+a[i]+" ");
		}
	}
 
	static void kth(int a[],int k )
	{
		int temp ; 
		for (int i = 0 ; i < a.length;i++) {
			for (int j= i+1 ; j<a.length;j++) {
				if(a[i]< a[j])
				{
					temp =a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}System.out.print(" "+a[i]+" ");
			if (i == k-1 ) {
				System.out.print(" "+a[i]+" ");
				break;
			}
			
		}
	}
	
	static void o1(int a[])
	{
		for (int i= 0 ; i< a.length ;i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
				
				
			}
			System.out.print(" "+ a[i]+ " ");
		}
		
	}
	
}
