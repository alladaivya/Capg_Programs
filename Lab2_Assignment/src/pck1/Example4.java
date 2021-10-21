package pck1;
import java.util.*;

public class Example4 { //Remove Duplicates
	public static int size;

	//Removes duplicates in the sorted array
	public static int removeDuplicates(int[] a) {
		if(a.length<=1)
			return a.length;
		int[] temp = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length-1; i++) {
			if (a[i] != a[i+1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[a.length-1];

		// Changing the original array
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}

	//Removes the duplicate elements in the array and sorts it in descending order 
	 public static int[] modifyArray(int[] a) {

		//Bubble Sort
		for (int i = 0; i < a.length-1; i++)
			for (int j = 0; j < a.length-i-1; j++)
				if (a[j] < a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
		size=removeDuplicates(a);
		int[] t=new int[size];
		for(int i=0;i<size;i++)
			t[i]=a[i];
		return t;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements");
		int i,j;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		modifyArray(a);
		System.out.println("Resulting array");
		for(i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}

}