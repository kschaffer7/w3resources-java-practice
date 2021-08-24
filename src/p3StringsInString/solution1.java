package p3StringsInString;

//3. Write a JavaScript function that generates all combinations of a string. Go to the editor
//        Example string : 'dog'
//        Expected Output : d,do,dog,o,og,g

import java.util.ArrayList;

public class solution1 {
    public static void main(String[] args){
        String string = "dog";
        String tempString = "";
        ArrayList<String> combos = new ArrayList<String>();
        for(int i = 0; i < string.length(); i++){
            if(combos.contains(tempString)){
                tempString = "";
            }
            else{
                tempString += string.charAt(0);
                combos.add(tempString);
            }
        }
        System.out.println(combos);
    }
}
