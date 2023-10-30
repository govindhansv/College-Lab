import java.util.Scanner;

class vowels{
    public static void main(String[] args){
        System.out.print(" Enter a String : ");
        String Text,str2;
        Scanner sc = new Scanner(System.in);
        Text = sc.nextLine();
        System.out.print(Text);
        System.out.println(Text.length());
        Text = sc.nextLine();

        str2=Text.replaceAll("[aeiouAEIOU]","");

        System.out.println("All Vowels Removed Successfully");


        System.out.println(str2);

    }
}