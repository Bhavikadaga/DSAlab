import java.util.Scanner;

class BinarySearchUserIp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

       
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

       
        System.out.print("Enter the element to search: ");
        int srch = sc.nextInt();

       
        int li = 0;
        int hi = n - 1;
        int mi;
        boolean found = false;

        while (li <= hi) {
            mi = (li + hi) / 2;

            if (a[mi] == srch) {
                System.out.println("Element is at index " + mi);
                found = true;
                break;
            } else if (a[mi] < srch) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
        }

       
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}

