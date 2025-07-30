import java.util.Scanner;

public class ArrayIsSortedOrNot {
    static boolean sortedOrNot(int[] arr) {
        boolean increasing = true;
        boolean decreasing=true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            }
        }


        return increasing || decreasing;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(" is sorted : " + sortedOrNot(arr));
    }
}



