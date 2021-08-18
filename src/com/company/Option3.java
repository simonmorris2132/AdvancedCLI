package com.company;

public class Option3 {

    public static void run() {
        System.out.print ("Please enter a Sentence to to translate to pig latin: \n");

        Input.input.nextLine();
        String str = Input.input.nextLine();
        String[] strArr = str.split(" ");
        String encoded = "";

        for (int i = 0; i < strArr.length; i++) {

            boolean vowelCheck =  strArr[i].matches("^[aeiouAIEOU].*");

            if (vowelCheck){
                strArr[i] = flipper(strArr[i]);
                strArr[i] += "way";
            } else strArr[i] = flipper(strArr[i]);
            strArr[i] += "ay";

            encoded += strArr[i] + " ";
        }
        System.out.println (encoded.trim());
    }

    static String flipper( String val) {

        char[] chArr = val.toCharArray ();
        int lastIndex = chArr.length - 1;
        char temp = chArr[0];
        chArr[0] = chArr[lastIndex];
        chArr[lastIndex] = temp;

        String flipped = new String (chArr);

        return flipped;
    }
}
