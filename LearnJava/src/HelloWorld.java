public class HelloWorld {

    //Declaring Class Variables
    static String helloMessage= "Hello, World!";
    ////////////////////////////////////////////
        public static void main(String[] args) {
        System.out.println("Hello World!!!" + "assignment01");
        System.out.println(3 + 5);
        System.out.println(6 + 5 + " " + "the total value");
        System.out.println("the total value " + 6 + 5);
        System.out.println("Hello World" + "Problem_02");
        System.out.println(9.5 * 4.5 - 2.5 * 3 + " " + "=9.5 X 4.5 -  2.5 X 3 Answer");
        System.out.println("----------------------------");
        System.out.println(45.5 - 3.5 + "  " + "=45.5- 3.5");
        System.out.println("Problem_03 --- (Summation of a series) Write a program that displays the result of\n" +
                "\n" +
                "\t\t\t\t1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.");
        {

            int sum = 0 ;
            for (int i =0; i <= 9; i++)
            {
                sum = sum + i;
            }
                System.out.println("The Summation is =" + " \t "+  sum);
            }
                // //Declaring Class Variables helloMessage= "Hello, World!";
            System.out.println(helloMessage);


        }
    }

