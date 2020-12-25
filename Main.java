//Krushil Amrutiya
//imports util.Scanner library 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //prints Seconds Converter
    System.out.println("Seconds Converter");
     //lets you obtain the input from the user
     Scanner keyboard = new Scanner(System.in);
     //takes the user's input
     System.out.print("Please enter the number of seconds:");
     //stores the input from the user in seconds variable
     int seconds = keyboard.nextInt();
     int sec = seconds % 60; //seconds  
     int hour = seconds / 60; //hour    
     int min = hour % 60; //min           
     hour = hour / 60;//hour
     //prints the output
     System.out.println(hour + ":" + min + ":" + sec);
  }
}
