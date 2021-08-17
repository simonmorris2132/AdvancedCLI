package com.company;

import java.util.Scanner;

public class Input {

    static   Scanner input = new Scanner ( System.in );

    public static void yesNo(){

        System.out.print ( """
                    Would You Like To Continue With Another Program?
                    
                    Yy|Nn:\s""" );
        String yn = input.next ();
        switch (yn){
            case "Y","y","Yes","yes" -> System.out.println ("");
            case "N","n","No","no" -> Menu.check = false;
        }
    }
}