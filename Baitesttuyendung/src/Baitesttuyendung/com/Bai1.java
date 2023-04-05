package Baitesttuyendung.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bai1 {

	public static List<Integer> findPrimeNumbers(int[] arr) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			boolean check = true;
			if (arr[i] < 2) {
				check = false;
			} else {
				for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
					if (arr[i] % j == 0) {
						check = false;
						break;
					}
				}
			}
			if (check) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static int[] sortIntegers(int[] resultArr) {

		for (int i = 0; i < resultArr.length; i++) {
			for (int j = 0; j < resultArr.length - 1; j++) {
				if (resultArr[j] > resultArr[j + 1]) {
					int temp = resultArr[j];
					resultArr[j] = resultArr[j + 1];
					resultArr[j + 1] = temp;
				}
			}

		}
		return resultArr;
	}

	public static void main(String[] args) {

		Random rand = new Random();

		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			int randNum = rand.nextInt(100);
			arr[i] = randNum;
		}

		System.out.println("Mang ban dau la : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

		System.out.println("\n");

		List<Integer> result = findPrimeNumbers(arr);

		int[] resultArr = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArr[i] = result.get(i);
		}

		sortIntegers(resultArr);
		System.out.println("Các số nguyên tố sau khi được sắp xếp là: ");
		for (int num : resultArr) {
			System.out.print(num + ",");
		}
	}
}
