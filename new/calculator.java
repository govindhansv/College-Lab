public class calculator {
    public static void main(String[] args) {
        int first, second, add, subtract, multiply;
        float devide;

        System.out.print("Enter Two Numbers : ");
        first = Integer.parseInt(args[0]);
        second = Integer.parseInt(args[1]);

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
    }
}
