package baekjoon.pass;

import java.util.Scanner;

public class Main_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = 0;
		int n = 0;
		
		if(a > b){
			m = a;
			n = b;
		}else{
			m = b;
			n = a;
		}
		
		int max = findMaxValue(m, n);
		int min = findMinValue(m, n);
		
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
	}

	private static int findMinValue(int m, int n) {
 		int min = n;
 		
 		for(int i = n; ; i++){
 			if(i % m == 0 && i % n == 0){
 				min = i;
 				break;
 			}
 		}
		
		return min;
	}

	private static int findMaxValue(int m, int n) {
		int max = 1;
		
		for(int i = 1; i <= n; i++){
			if(m % i == 0 && n % i ==0){
				max = i;
			}
		}
		
 		return max;
	}
}