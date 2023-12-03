import java.util.Scanner;

public class main {

    public static void main(String[] args)

    {
        byte b = 1;
        short s = 1;
        int i;
        long l = 10000;
        float f = 0.3F;
        double d = 1.333;
        boolean boo;
        char c = 'e';
        String st = "Fuck this sheet!";

        System.out.println(st);
        b = ++b;
        System.out.println("incremented byte b = " + b);

        i = b + s;
        System.out.println("'i' is a sum of byte b and short s, i = " + i);
        byte bb = (byte)s++;

        d = d * f;
        System.out.println("d = 0.3F * 1.333 = " + d);

        l = l / --i;
        System.out.println("l = 10000 / (3-1) = " + l);


        System.out.println("This int was returned from other method - v = " +someOpetarion());

        System.out.println(evenOrNot());


    }

    public static int someOpetarion()
    {
        int j = 22;
        int k = 44;
        int v;
        v = (k+j)/2;
        return v;
    }

    public static String evenOrNot()
    {
        String e;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now let's play a game. Enter some number to check if it even or not:");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            e = "The number is even";
        } else{
           e = "The number isn't even";
        }
        return e;
    }
}
