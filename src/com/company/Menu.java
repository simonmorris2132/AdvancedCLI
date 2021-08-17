package com.company;

public class Menu {

    static boolean check = true;

    public static void start(){

        System.out.println ("Welcome to Simon's CLI!\n");

        while (check){

            System.out.print ( """
                    Please Choose an option from below\s
                    
                    Option 1: Factorial Calculator\s
                    Option 2: Title Case A String\s
                    Option 3: PigLatin Converter\s
                    Option 4: Is it a Factor?\s
                    Option 5: Exit Program\s
                    
                    Option:\s""" );

            byte op = Input.input.nextByte ();

            switch (op) {

                case 1 -> {
                    Option1.run();
                    Input.yesNo();
                }
                case 2 -> {
                    Option2.run();
                    Input.yesNo();
                }
                case 3 -> {
                    Option3.run();
                    Input.yesNo();
                }
                case 4 -> {
                    Option4.run();
                    Input.yesNo();
                }
                case 5 -> {
                    check = false;
                    System.out.println ("\n" + "\n" + "See-Ya, Loser. \n");
                }
                default -> System.out.println ("\n" +
                        "Please Enter A Valid Option" +
                        "\n");
            }

        }
    }
}