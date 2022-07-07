package track3;

import java.util.Scanner;

public class D2_1979 {

	public static int sum_arr() {
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, res = 0;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] graph = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					graph[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= N-K; j++) {
					if(j == 0) {
						
					}
				}
			}
			
		}
	}

}
