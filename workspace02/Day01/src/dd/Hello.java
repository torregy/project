package dd;

import java.math.BigInteger;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int tmp[] = new int[n];
		for(int i = 0; i < n; i ++){
			tmp[i] = scan.nextInt();
		}
		
		int num = 0;
		for(int i = 1; i <= n; i ++){
			num += i;
		}
		
		int count = 0;
		int arr[] = new int[num];
		for(int i = 0; i < n; i ++){
			for(int j = i; j < n; j ++){
				for(int k = i; k <= j; k ++){
					arr[count] += tmp[k];
				}
				count ++;
			}
		}
		
		int result = 0;
		for(int i = 0; i < count ; i ++){
			if(arr[i] < 0) result ++;
		}
		System.out.println(result);
	}
}
