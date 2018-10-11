package com.ldx.array;

public class Demo01 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int total = 0;
		int max = arr[0];
		for(int i : arr){
			total += i;
			if(i > max){
				max = i;
			}
			System.out.println(i);
		}
		System.out.println(max);
		System.out.println(total);
	}
}
