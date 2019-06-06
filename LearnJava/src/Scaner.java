import javax.swing.JOptionPane;
import java.lang.System;
import java.util.Scanner;
public class Scaner {

    static String helloMessage;

    static Scanner sc = new Scanner(System.in); // creating Scanner object using new followed by call to the Scanner class constructor

    public static void main(String[] args) {

        helloMessage = "Hello,  World!!!!!";
        System.out.println(helloMessage);

        System.out.println("Enter the Radius of the Circle : \n");
        float red = sc.nextFloat();
        System.out.println("Radius =" + red);

        {
            double pri;
            pri = 2 * Math.PI * red;
            System.out.println("Perimeter= " + pri);

            double area;
            area = red * red * Math.PI;
            System.out.println("Area =" + area);

        }

        helloMessage = "Hello,  World!!!!!";
        System.out.println(helloMessage);
        {
            System.out.println("enter the Message:");
            String message = sc.next();
            System.out.println(helloMessage + "\t to \t" + message);
        }

        String s;
        s = JOptionPane.showInputDialog ("enter a integer:");
        int x = Integer.parseInt(s);
        System.out.println("you entered" + x + ".");

    }
}
