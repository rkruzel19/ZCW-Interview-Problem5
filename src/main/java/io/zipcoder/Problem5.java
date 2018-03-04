package io.zipcoder;

public class Problem5 {

    public static void main(String[] args) {
        String input = "I love UNIT Testing";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String string){
        String output = "";
        if (string.length() % 2 != 0){
            for (int i = 0; i < (string.length() / 2); i++){
                string = string.charAt(string.length() - 1 - i) + string.;
            }
        }

//        for (int i = 0; i < string.length(); i--){
//                output += string.charAt(i);
//        }

        return output;
    }

}
