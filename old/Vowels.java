import java.util.Scanner;
public class Vowels   {


    public static void main(String args[]) 
     {

        String str1,str2;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter a string");
        str1=sc.nextLine();

        str2=str1.replaceAll("[aeiouAEIOU]","");

        System.out.println("All Vowels Removed Successfully");


        System.out.println(str2);

    }
}
    

