/* 
    Write a Java program to create a class called ArrayDemo and overload arrayFunc()
    function.
    void arrayFunc(int [], int) - To find all pairs of elements in an Array whose sum is equal
    to a given number :
    Input: Array numbers= [4, 6, 5, -10, 8, 5, 20], target=10
    Output :
    Pairs of elements whose sum is 10 are : 
    4 + 6 = 10
    5 + 5 = 10
    -10 + 20 = 10
    void arrayFunc(int A[], int p, int B[], int q) - Given two sorted arrays A and B of size p
    and q, Overload method arrayFunc() to merge elements of A with B by maintaining the
    sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
    Example:
    Input :
        int[] A = { 1, 5, 6, 7, 8, 10 }
        int[] B = { 2, 4, 9 }
    Output:
        Sorted Arrays:
        A: [1, 2, 4, 5, 6, 7]
        B: [8, 9, 10]
*/

class ArrayDemo {
    void arrayFunc(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == n) {
                    System.out.println("(" + a[i] + "," + a[j] + ")");
                }
            }
        }
    }

    void arrayFunc(int A[], int p, int B[], int q) {
        int c[] = new int[p + q];
        for (int i = 0; i < p; i++) {
            c[i] = A[i];
        }
        for (int i = p; i < p + q; i++) {
            c[i] = B[i - p];
        }

        for (int i = 0; i < p + q; i++) {
            for (int j = 0; j < p + q - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < p; i++) {
            A[i] = c[i];
        }
        for (int i = p; i < p + q; i++) {
            B[i - p] = c[i];
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 2, 3, 4, 2, 3, 4 };
        int b[] = { 12, 13, 12, 1, 11 };
        ArrayDemo aa = new ArrayDemo();
        aa.arrayFunc(a, 3);
        aa.arrayFunc(a, a.length, b, b.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }

    }
}
