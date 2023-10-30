import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class mergearrays {
    public static void main(String[] args) throws InterruptedException {
        int s1, s2, s3;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of array 1");
        s1 = sc.nextInt();
        System.out.println(" Enter size of array 2");
        s2 = sc.nextInt();
        s3 = s1 + s2;
        int[] array1 = new int[s1];
        int[] array2 = new int[s2];
        int[] array3 = new int[s3];

        System.out.println("Entered array 1 Elements");
        for (int i = 0; i < s1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Entered array 2 Elements");
        for (int i = 0; i < s2; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println("Entered array 1");
        for (int i = 0; i < s2; i++) {
            System.out.print(array1[i] + ",");
        }

        System.out.println("Entered array 2");
        for (int i = 0; i < s2; i++) {
            System.out.println(array2[i] + ",");
        }

        System.out.println("Merging .... . .. . . ");
        for (int i = 0; i < s1; i++) {
            array3[i] = array1[i];
            System.out.print("..");
            TimeUnit.SECONDS.sleep(1);
        }
            System.out.println("");
            System.out.println("");
            System.out.println("");

        for (int i = s1,j=0 ; i < s3; i++,j++) {
            array3[i] = array2[j];
        }
        System.out.print("Merged Array ... ->  ");
        for (int i = 0; i < s3; i++) {
            System.out.print(array3[i] + ",");
        }

    }
}