package Baitesttuyendung.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bai3 {

	public static List<List<Integer>> createPairs(int[] arr, int n) {
		List<List<Integer>> result = new ArrayList<>();
		if (n == 1) {
			for (int i = 0; i < arr.length; i++) {
				List<Integer> pair = new ArrayList<>();
				pair.add(arr[i]);
				result.add(pair);
			}
			return result;
		}
		List<List<Integer>> subPairs = createPairs(arr, n - 1);
		for (int i = 0; i < subPairs.size(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (!subPairs.get(i).contains(arr[j])) {
					List<Integer> pair = new ArrayList<>(subPairs.get(i));
					pair.add(arr[j]);
					result.add(pair);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int arr[] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			int randNum = rand.nextInt(100);
			arr[i] = randNum;
		}

		for (int num3 : arr) {
			System.out.print(num3 + " :");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử của 1 cặp: ");
		int num = sc.nextInt();
		List<List<Integer>> result = createPairs(arr, num);

		for (List<Integer> num1 : result) {

			System.out.print(num1 + ": ");
		}

	}
}
