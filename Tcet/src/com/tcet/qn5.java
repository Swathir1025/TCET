package com.tcet;
import java.util.Arrays;

public class qn5 {
	public static void main(String[] args) {
		int[] crates= {1,0,3,0,12,5,0,7};
		moveZerosToEnd(crates);
		System.out.println("Crates after moving empty ones to the end: "+Arrays.toString(crates));
		}
	public static void moveZerosToEnd(int[] crates) {
		int j=0;
		for (int i=0;i<crates.length;i++) {
			if (crates[i]!=0) {
				crates[j]=crates[i];
				j++;
			}
		}
		while(j<crates.length) {
			crates[j]=0;
			j++;
		}
	}

}
