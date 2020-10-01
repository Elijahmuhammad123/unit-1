package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("what is the color of the sky?");
        String s1 = input.nextLine();

        if (s1.equals("blue")) {
            System.out.println("Right");

        } else {
            System.out.println("wrong");
        }
        System.out.println("what color is dirt?");
        String s2 = input.nextLine();
if (s2.equals("brown")) {
    System.out.println("Right");
}
else {
    System.out.println("wrong");
}
    }
}