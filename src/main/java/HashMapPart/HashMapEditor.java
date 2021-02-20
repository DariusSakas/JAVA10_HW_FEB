package HashMapPart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEditor {

    Scanner scannerString = new Scanner(System.in);

    public void checkIfContainsValue(HashMap<Integer, String> hashMap) {
        System.out.println("What key value are your looking for?");


        boolean endlessLoop = true;
        while (endlessLoop) {

            String foundKeyValue = "Empty";
            int valueToCheck = scannerString.nextInt();

            for (Map.Entry<Integer, String> integerStringEntry : hashMap.entrySet()) {
                if (integerStringEntry.getKey() == valueToCheck)
                    foundKeyValue = integerStringEntry.toString();
            }
            if (foundKeyValue.equals("Empty"))
                System.out.println("Sorry, can't find what you want. Try another value!");
            else
                System.out.println(foundKeyValue);
        }
    }

//    public int stringToIntConvert (String value) {
//        int intToCheck;
//        try {
//            intToCheck = Integer.parseInt(value);
//
//        } catch (Exception ex) {
//            System.out.println("Test stringtointcovert");
//            scannerString.next();
//            return -1;
//        }
//        return intToCheck;
//    }
//    public void printValueForSpecifiedKey(String stringValue, int intValue, HashMap<Integer, String> hashMap){
//        if(intValue == -1){
//            System.out.println(hashMap.containsKey(stringValue));
//        }else
//            System.out.println(hashMap.containsKey(intValue));
//    }

}
