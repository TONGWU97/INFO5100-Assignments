package homework06;

/*
 * Given a target integer target and an integer array A sorted in ascending order, 
 * find the index i in A such that A[i] is closest to target. Please write main() method to test your code.
Assumptions:
1.	There can be duplicate elements in the array, and we can return any of the indices with same value.
2.	if A is null or A is empty, throw exception to remind users.
Example:
A = [1, 3, 3, 4], target = 2, return 0 or 1 or 2
A = [0, 1, 5], target = 7, return 2
 * */
public class ArrayTarget {
	public static void main(String[] args) {
		int A[] = { 1, 3, 3, 4 };
		System.out.println(findClosestIndex(A, 2));
	}

	public static int findClosestIndex(int arr[], int target) {
		if (arr == null || arr.length == 0) {
			throw new NullPointerException("array is null or empty!");
		}

		if (target <= arr[0]) {
			return 0;
		}
		if (target >= arr[arr.length - 1]) {
			return arr.length - 1;
		}

		int i = 0, j = arr.length, mid = (i + j) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		if (target < arr[mid]) {
			if (target > arr[mid - 1]) {
				return getClosest(arr[mid - 1], arr[mid], target);
			}
			j = mid;
		} else if (mid < arr.length - 1 && target < arr[mid + 1]) {
			return getClosest(arr[mid], arr[mid + 1], target);
		}
		i = mid + 1;
		return mid;
	}

	public static int getClosest(int val1, int val2, int target) {
		if (target - val1 > val2 - target) {
			return val2;
		} else {
			return val1;
		}
	}
}
