package com.company;

import java.util.ArrayList;

public class Option4 {

    public static void run() {

        System.out.print("Please Enter the Base: ");
        int f = Input.input.nextInt();
        System.out.print("Please Enter the Potential Factor: ");
        int p = Input.input.nextInt();

        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        while (f % 2 == 0) {
            primeFactors.add(2);
            f /= 2;
        }

        for (int i = 3; i <= Math.sqrt(f); i += 2) {
            while (f % i == 0) {
                primeFactors.add(i);
                f /= i;
            }
        }
        if (f > 2)
            primeFactors.add(f);

        System.out.println(primeFactors);
    }
}