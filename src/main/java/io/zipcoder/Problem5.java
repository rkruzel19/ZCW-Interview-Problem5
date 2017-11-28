package io.zipcoder;

public class Problem5 {

    public static void main(String[] args) {
        String input = "I love hockey";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String string){
        String output = "";
        for (int i = string.length() - 1; i >= 0; i--){
                output += string.charAt(i);
        }

        for (int i = 0; i < output.length(); i++){
            if (i == 0 || output.charAt(i) == ' '){
                
            }
        }
        return output;
    }

}
