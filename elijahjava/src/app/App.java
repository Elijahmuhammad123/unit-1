package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

   int targetnum = 75;
   boolean isfinished= false;
   while (isfinished == false) {
       Scanner input = new Scanner(System.in);
   System.out.println("guess a number between 0 and 100.");
   int guess = input.nextInt();
   input.nextLine();


   if (guess == targetnum){
       System.out.println("correct");
       isfinished = true;
   }

   else{
       if (guess > targetnum){
           System.out.println("high");
       }
       else{
           System.out.println("low");
       }
   }


   }
   

    }
}