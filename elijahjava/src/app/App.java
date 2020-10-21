package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

 Scanner input = new Scanner(System.in);
 System.out.println("please enter password.");
 int i = 0;
 String pattern = input.nextLine();

 while(i != 3){
if(pattern.equals("SK8orDie")){
    System.out.println("you have found the password.");
    System.exit(1);
}
else{
    System.out.println("wrong password. try again.");
    i = i + 1;
}
 }
 System.out.println("please enter a password.");
 String pattern2 = input.nextLine();

 if( pattern2.equals("SK8orDie")){
 System.out.println("you have found the password.");
 System.exit(2);    
 }
 else{
     System.out.println("Wrong password. Try again.");
     i = i + 1;
 }
 System.out.println("please enter password.");
 String pattern3 = input.nextLine();

 if (pattern3.equals("SK8orDie")){
     System.out.println("you have found the password.");
     System.exit(3);
 }
 else {
     System.out.println("wrong password.");
     i = i + 1;
 }
 if(i == 3){
           System.out.println("too many attempts. rerun program.");
           System.exit(1);
       }
input.close();
       }
      
   }
   

    
