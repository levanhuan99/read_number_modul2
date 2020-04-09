package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter your number: ");
        number = scanner.nextInt();

        int a, b;

        a = number % 10;
        b = number - a;
        String print = " ";

        if (number > 1 && number < 10) {

            print = printNumberFrom1to9(number);

        } else if (number > 9 && number < 20) {

            print = printNumberFrom10To19(number);

        } else if (number > 20 && number < 100) {
            if (number % 10 == 0) {
                //nếu number chia hết cho 10
                print = printNumberDivide10From20To90(number); // gọi hàm này
            }else {
                print = printNumberDivide10From20To90(b)+" " + printNumberFrom1to9(a);
            }
        }


        System.out.println("your number is: " + print);


    }


    public static String printNumberFrom1to9(int number) {
        String print = " ";
        switch (number) {
            case 1:
                print = "one";
                break;
            case 2:
                print = "two";
                break;
            case 3:
                print = "three";
                break;
            case 4:
                print = "four";
                break;
            case 5:
                print = "five";
                break;
            case 6:
                print = "six";
                break;
            case 7:
                print = "seven";
                break;
            case 8:
                print = "eight";
                break;
            case 9:
                print = "nine";
                break;
        }
        return print;
    }

    public static String printNumberFrom10To19(int number) {
        String print = " ";
        switch (number) {
            case 10:
                print = "ten";
                break;
            case 11:
                print = "eleven";
                break;
            case 12:
                print = "twelve";
                break;
            case 13:
                print = "thirteen";
                break;
            case 14:
                print = "fourteen";
                break;
            case 15:
                print = "fifteen";
                break;
            case 16:
                print = "sixteen";
                break;
            case 17:
                print = "seventeen";
                break;
            case 18:
                print = "eighteen";
                break;
            case 19:
                print = "nineteen";
                break;
        }
        return print;
    }

    public static String printNumberDivide10From20To90(int number) {
        String print = " ";
        switch (number) {
            case 20:
                print = "twenty";
                break;
            case 30:
                print = "thirty";
                break;
            case 40:
                print = "forty";
                break;
            case 50:
                print = "fifty";
                break;
            case 60:
                print = "sixty";
                break;
            case 70:
                print = "seventy";
                break;
            case 80:
                print = "eighty";
                break;
            case 90:
                print = "ninety";
                break;
        }
        return print;
    }

}
