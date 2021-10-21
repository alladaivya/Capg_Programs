package pck1;
import java.util.Arrays;

public class Example2 { //sortStrings
	public static void main(String[] args) {
		String []arr= {"av","eg","a","b","j","uk"};

		String []left=new String [arr.length/2];
		System.out.println(left.length);

		String []right=new String[arr.length-left.length];
		System.out.println(right.length);
		for(int i=0;i<arr.length;i++)
		{
			Arrays.sort(arr);
		}

		System.out.println(Arrays.toString(arr));

		for(int j=0;j<left.length;j++)
		{
			left[j]=arr[j];
			left[j]=left[j].toUpperCase();
			System.out.print(left[j]);
		}
		for(int k=0;k<right.length;k++)
		{
			right[k]=arr[left.length+k];
			right[k]=right[k].toLowerCase();
			System.out.print(right[k]);
		}
	}
}
