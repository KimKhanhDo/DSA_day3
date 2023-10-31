package homework_d3;

public class MinGap {
	public static void main(String[] args) {

		int[] arr = { 7, 1, 3, 4, 1, 7 };
		int[] arr2 = { 1, 4, 3, 4, 1 };
		int[] arr3 = { 7, 5, 0, 6, 2 };

		System.out.println(findMinGap(arr));
		System.out.println(findMinGap(arr2));
		System.out.println(findMinGap(arr3));

	}

// O(n^2)
	public static int findMinGap(int[] arr) {

		int minGap = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					int distance = j - i;
					minGap = Math.min(minGap, distance);
				}
			}
		}

		if (minGap == Integer.MAX_VALUE) {
			return 0;
		} else {
			return minGap;
		}
	}

}
