

import java.util.Scanner;

public class TripletSum {
	
	public int triplet_sum(int arr[],int n,int m) {
		
		int count=0;
		//System.out.println("pairs of element and their sum:");
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] + arr[j] == m) {
					//System.out.println(arr[i] + "+" + arr[j] + "=" + m);
					count++;
					
				}
				
			}
		}
		if(count>0)
			return 1;
		else
			return -1;
	}

}
