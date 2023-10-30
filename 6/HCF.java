import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        int a,b,hcf,lcm,temp1, temp2,temp;

        System.out.println("Enter Two Numbers ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        temp1 = a;
        temp2 =b;

        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
         }
         hcf = temp1;
         lcm = (a*b)/hcf;

        System.out.println("HCF of numbers" + a +','+ b + " is " + hcf +  "  and lcm is  " + lcm );
        sc.close();
    }
}
