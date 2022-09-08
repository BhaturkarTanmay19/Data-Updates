package static_keywod.child;

import java.util.Scanner;

public class Solution {

	public static void main(String[] rag)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();// getting the size of array from user
		int[] arr = new int[n];
		int[] arr1 = new int[2];
		System.out.println("Enter the value for array");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int size = arr1.length;
		System.out.println("Enter the number of query for array");
		int k = sc.nextInt();
		while(k-- > 0)
		{
			System.out.println("Enter the query");
			for(int i=0; i<size; i++)
			   {
				
				   arr1[i] = sc.nextInt();
			   }
			   
			   int first = arr1[0];
			   int last = arr1[size-1];

			  
			   for(int i=first; i<=last; i++)
			   {
				   arr[i] = -arr[i];
				   
			   }
			   
			   for(int i=0; i<n; i++)
			   {
				   System.out.print(arr[i]+" ");
			   }
			   for(int i=first; i<=last; i++)
			   {
				  arr[i] = -arr[i];
			   }
			   System.out.println();
			  
			   
		}
	   
		sc.close();
	
		
    }
}
