import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28}; // sorted array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int srch = sc.nextInt();

        int li = 0;          
        int hi = a.length - 1;  
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

