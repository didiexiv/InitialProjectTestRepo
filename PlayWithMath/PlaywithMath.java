package playwithmath;

import java.util.Scanner;

public class PlaywithMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        double number = -3.45;
//
//        double a = Math.ceil(number);
//        System.out.println(a);
//
//        double b = Math.floor(number);
//        System.out.println(b);
//
//        long c = Math.round(number);
//        System.out.println(c);
//
//        double d = Math.abs(number);
//        System.out.println(d);

//        double Radius = 7.5;
//        double perimeter = 2 * Math.PI * Radius;
//        double area = Math.PI * Radius * Radius;
//
//        System.out.printf("Perimeter is : " + perimeter + "%n");
//        System.out.printf("Area is : " + area + "%n");
//
//        byte x = 1;
//        byte y = 2;
//        byte a = (byte) (-x + x++ * 2);
//        System.out.printf("The price of a, x and y is ::" + a + " " + x + " " + y + "%n");
//        byte b = (byte) ((x++ + --y) + --y);
//        System.out.printf("The price of a, x and y is:" + b + " " + x + " " + y + "%n");
//        byte c = (byte) (x + x);
//        System.out.printf("The price of a, x and y is:" + c + " " + x + " " + y + "%n");
//
//        double width = 5.6;
//        double height = 8.5;
//        double perimeter2 = 2 * (height + width);
//        double area2 = width * height;
//
//        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter2);
//        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area2);

        Scanner in = new Scanner(System.in);
        System.out.print("Put seconds please: ");
        int seconds = in.nextInt();
        int number1 = seconds / 60;
        int number2 = seconds / 60;
        int number3 = seconds / 60 % 60;
        number2 = number2 / 60;
        System.out.printf(number2 + ":" + number3 + ":" + number1 + "%n");
        

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please give me the price of the product");
//        int price = input.nextInt();
//        for (int i = 0; i <= 10; i++) {
//            double discount = 10;
//            double newprice = price * discount * 0.01;
//            discount++;
//            System.out.println("The final price for your product after" + discount + "% wil be" + newprice);
//        }
//        System.out.println("Please give me the price of the product");
//        int price1 = input.nextInt();
//         for ( int discount=0; discount<=10; discount++){
//             discount = 10;
//             double newprice = price1*discount*0.01;
//             
//            System.out.println("The final price for your product after" + discount + "% wil be" + newprice );
//         }
    }

}
