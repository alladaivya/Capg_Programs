package pck1;
import java.util.*;

public class SecondSmallestArray {
		public static void main(String[] args) {
			int[] arr = {3,5,7,8,9,1,2,6};
			int min1=arr[0],min2=arr[0];
			
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<min1) {
					min1 = arr[i];
				}
				else if(arr[i]<min2) {
					min2 = arr[i];
				}
			}
			System.out.println("2nd smallest array: "+min2);
	}
}
