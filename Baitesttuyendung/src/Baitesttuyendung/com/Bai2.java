package Baitesttuyendung.com;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vị trí phần tử muốn tìm: ");
		int num1 = sc.nextInt();

		int[] arr = new int[num1];

		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		int value = arr[num1 - 1];
		System.out.println("Vị trí số" + " " + num1 + " " + "trong dãy số Fibonacci là :" + " " + value);
	}
}
