/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int weight=0;
	    double r=0;
	    int drink_num=0;
	    double alcohol_volume=0;
	    int time_drink=0;
	    System.out.println("What is your weight in pounds?");
	    weight= kb.nextInt();
	    System.out.println("Enter 1 for Male, 2 for Female.");
	    r= kb.nextDouble();
	    if(r==1){
            r=0.73;
        }
	    else{
	        r=0.66;
        }
	    System.out.println("How many drinks did you have?");
	    drink_num= kb.nextInt();
	    System.out.println("What is the amount of alcohol by volume of the drinks consumed (as a percent)?");
	    alcohol_volume= kb.nextDouble();
	    System.out.println("What is the amount of time (in hours) since your last drink?");
	    time_drink= kb.nextInt();
		double total= (((drink_num*alcohol_volume)*5.14/weight*r)-.015*time_drink);
	    System.out.println("Your BAC is "+total);
	    if(total<0.08){
	        System.out.println("It is legal for you to drive.");
        }
	    else{
	        System.out.println("It is not legal for you to drive.");
        }
    }
}
