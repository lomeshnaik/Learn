
import java.lang.System;
import java.util.Scanner;
public class Scaner {

    static String helloMessage;

    public static void main(String[] args) {

        helloMessage = "Hello,  World!!!!!" ;
        System.out.println(helloMessage);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of the Circle : \n");
        float red = sc.nextFloat();
        System.out.println("Radius =" + red);

        {
            double pri;
            pri = 2 * Math.PI * red ;
            System.out.println("Perimeter= " + pri);

            double area;
            area = red * red * Math.PI ;
            System.out.println("Area =" + area);

        }

        helloMessage = "Hello,  World!!!!!" ;
        System.out.println(helloMessage);
    }
}
