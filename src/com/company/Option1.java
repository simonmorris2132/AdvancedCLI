package com.company;

public class Option1 {

    public static void run() {
        System.out.print("Please enter a number to factorialize: \n");

        int num = Input.input.nextInt();

        System.out.println("Factorial \"" + num + "!\" = \"" + recur(num) + "\"\n");

    }

    static int recur(int number) {
        if (number <= 2) {
            return number;
        }
        return number * recur(number - 1);
    }
}


