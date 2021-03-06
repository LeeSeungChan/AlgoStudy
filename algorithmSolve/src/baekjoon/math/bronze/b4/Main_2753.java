package baekjoon.math.bronze.b4;

import java.util.Scanner;

/**
 * 수학,구현 / B4
 * 
 * 2754번: 윤년
 * https://www.acmicpc.net/problem/2754
 * 
 * PASS
 */
public class Main_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do {
			n = sc.nextInt();
			
			if(n >= 1 && n <= 4000) {
				break;
			}else {
				System.out.println("다시 입력해주세요. 0<=n<=4000");
			}
		}while(true);
		
		if((n % 4  == 0 && n % 100 != 0) || n % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		sc.close();
	}
}
