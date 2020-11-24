import java.util.Scanner;
import java.util.ArrayList;
public class INSERTION {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i = 0; i < C; i++)
		{
			int N = sc.nextInt();
			
			int[] a = new int[N];
			
			int[] result = new int[N];
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			for(int j = 0; j < N; j++)
			{
				a[j] = sc.nextInt();
				arr.add(j + 1);
			}
			
			result = make_arr(arr, a, N);
			
			for(int j = 0; j < N; j++)
			{
				System.out.printf("%d ", result[j]);
			}
			System.out.println();
			
		}
	}
	
	public static int[] make_arr(ArrayList<Integer> arr, int[] a, int N)
	{
		int[] result = new int[N];
		int n;
		
		for(int i = N - 1; i >= 0; i--)
		{
			n = arr.size();
			
			result[i] = arr.get(n - a[i] - 1);
			
			arr.remove(n - a[i] - 1);
		}
		
		return result;
	}

}
