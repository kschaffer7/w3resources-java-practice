package p2PalindromeString;

// Write a JavaScript function that checks whether a passed string is palindrome or not? Go to the editor
// A palindrome is word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class solution1 {
    public static void main(String[] args){
        String string = "nurses run";
        String cleanString = string.toLowerCase().replaceAll(" ", "");
        ArrayList<Character> stringArrayList = new ArrayList<Character>();
        String reversedString = "";
        for(int i = 0; i < cleanString.length(); i++){
            stringArrayList.add(cleanString.charAt(i));
        }
        Collections.reverse(stringArrayList);
        for(int j = 0; j < stringArrayList.size(); j++){
            reversedString += stringArrayList.get(j);
        }
        if(cleanString.contains(reversedString)){
            System.out.println(string + " is a palindrome.");
        }
        else{
            System.out.println(string + " is NOT a palindrome.");
        }
    }

}
