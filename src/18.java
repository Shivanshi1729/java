/* 
	Program to find the saddle point coordinates in a given matrix. A saddle point is an
	element of the matrix, which is the minimum element in its row and the maximum in
	its column.
	For example, consider the matrix given below
		Mat[3][3]
		1 2 3
		4 5 6
		7 8 9
	Here, 7 is the saddle point because it is the minimum element in its row and maximum
	element in its column.
	Steps to find the saddle point coordinates in a given matrix.
		i. Input the matrix from the user.
		ii. Use two loops, one for traversing the row and the other for traversing the
			column.
		iii. If the current element is the minimum element in its row and maximum element
			in its column, then return its coordinates.
		iv. Else, continue traversing.
*/

import java.util.Scanner;

class shi_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the value of n: ");
		n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the elements of arr:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			int min = arr[i][0];
			int ci = 0;

			// find min element in row
			for (int j = 1; j < n; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					ci = j;
				}
			}
			// check if it's max too
			boolean isMax = true;
			for (int k = 0; k < n; k++) {
				if (arr[k][ci] > min) {
					isMax = false;
					break;
				}
			}
			if (isMax) {
				System.out.println("Saddle point is: " + min);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Saddle point is not found");
		sc.close();
	}
}

