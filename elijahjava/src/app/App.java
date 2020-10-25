package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

 Scanner input = new Scanner(System.in);

 System.out.println("please enter a number.");
 int num1 = input.nextInt();
 input.nextLine();
 
 System.out.println("please enter a larger number");
 int num2 = input.nextInt();
 input.nextLine();

 num1++;
 while (num1 < num2){
     if (num1 % 2 == 0){
         System.out.println(num1);

         System.out.println(num1);
     }
     num1++;
 }
       }
      
   }
   

    
