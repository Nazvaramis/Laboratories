package com.example.rtsllab1;
import java.util.*;
import java.util.Scanner;
import java.util.Scanner;

import java.util.Scanner;

public class lab1ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("for the a + bi equation \n ");
        System.out.println("Enter a for the first equation");
        int a1 = scanner.nextInt();

        System.out.println("Enter b for the first equation");
        int b1 = scanner.nextInt();

        complexnumber num = new complexnumber(a1,b1);

        System.out.println("for the a - bi equation \n ");
        System.out.println("Enter a for the second equation");
        int a2 = scanner.nextInt();

        System.out.println("Enter b for the second equation");
        int b2 = scanner.nextInt();

        complexnumber num2 = new complexnumber(a2,b2);


        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition Result: " + complexnumber.add(num, num2));
                break;
            case 2:
                System.out.println("Subtraction Result: " + complexnumber.substract(num, num2));
                break;
            case 3:
                System.out.println("Multiplication Result: " + complexnumber.multiplication(num, num2));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }





    }




class complexnumber {

    int real;
    int imaginar;

    complexnumber(int real, int imaginar){
        this.real = real;
        this.imaginar = imaginar;

    }


    public static complexnumber add(complexnumber num, complexnumber num2){

        int sumareala = num.real + num2.real;
        int sumimaginara = num.imaginar + num2.imaginar;


        return new complexnumber(sumareala,sumimaginara);


    }

    public static complexnumber substract(complexnumber num, complexnumber num2){

        int scaderereala = num.real - num2.real;
        int sumaimaginara = num.imaginar + num2.imaginar;

        return new complexnumber(scaderereala,sumaimaginara);
    }

    public static complexnumber multiplication(complexnumber num, complexnumber num2){

        int multiplyreal = num.real * num2.real -num.real*num2.imaginar +num2.real*num.imaginar;
        int multiplyimaginar = num.imaginar*num2.imaginar;

        return new complexnumber(multiplyreal,multiplyimaginar);
    }


    public String toString(){

        return real + (imaginar >= 0 ? "+" : "") + imaginar + "i";

    }

}






