import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < 10; i++) {
            // reading array elements from the user
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The array : \n ");

        for (int i = 0; i < 10; i++) {
            // reading array elements from the user
            System.out.print(array[i]);

            System.out.print("\t");
        }

        int smallest = array[0];
        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 0; i < 10; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("\n Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        sc.close();

    }
}
