package com.company;

public class Option2 {

    public static void run() {
        System.out.println("Please enter a sentence to Title Case: \n");

        Input.input.nextLine();
        String str = Input.input.nextLine().toLowerCase();
        String[] strArr = str.split(" ");
        String newStr = "";
        for (int i = 0; i < strArr.length; i++) {
            newStr += strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1) + " ";
        }
        System.out.println(newStr.trim());
    }

}
