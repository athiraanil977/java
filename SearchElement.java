import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Search element (Linear Search)
        boolean found = false;
        int position = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }

        // Output result
        if(found) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
