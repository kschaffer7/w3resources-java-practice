package p1ReverseNumber;
//1. Write a JavaScript function that reverse a number.
//        Example x = 32243;
//        Expected Output : 34223

import java.util.ArrayList;
import java.util.Collections;

public class solution1 {
    public static void main(String[] args){
        int number = 32243;
        String numberString = Integer.toString(number);
        ArrayList<Character> numberStringArrayList = new ArrayList<Character>();
        String reversedNumberString = "";
        int reversedNumber;
        for(int i = 0; i < numberString.length(); i++){
            numberStringArrayList.add(numberString.charAt(i));
        }
        Collections.reverse(numberStringArrayList);
        for(int j = 0; j < numberStringArrayList.size(); j++){
            reversedNumberString = reversedNumberString + numberStringArrayList.get(j);
        }
        reversedNumber = Integer.valueOf(reversedNumberString);
        System.out.println(reversedNumber);
    }
}
