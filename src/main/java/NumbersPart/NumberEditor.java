package NumbersPart;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class NumberEditor {

//    Write a Java method to find the smallest number among three numbers.
//    Write a Java method to compute the average of three numbers.

    Scanner scanner = new Scanner(System.in);
    Scanner intScannaer = new Scanner(System.in);

    Integer[] threeNumArray = new Integer[3];

    void numberEditorMenu() {
        String userMenuInput;
        do {
            System.out.println("-----------MENU----------");

            System.out.println("Choose your letter:");
            System.out.println("A - Add three numbers");
            System.out.println("B - Show added numbers");
            System.out.println("C - Show average of added numbers");
            System.out.println("D - Show smallest number between added numbers");

            System.out.println("X - Exit");
            System.out.println("-----------MENU----------");

            userMenuInput = scanner.nextLine().toUpperCase(Locale.ROOT);
            menuOptions(userMenuInput);

        } while (!userMenuInput.equalsIgnoreCase("x"));
    }

    void menuOptions(String choiceOfUser) {
        switch (choiceOfUser) {
            case "A":
                addThreeNumbersToArray(threeNumArray);
                break;
            case "B":
                showAddedNumbers(threeNumArray);
                break;
            case "C":
                averageOfThreeNumbers(threeNumArray);
                break;
            case "D":
                minValueOfArray(threeNumArray);
                break;
            case"X":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("No such option. Take another try!");
        }
    }
    void arrayNullPointExceptionCheck(Integer[]arrayOfInts) {
        for (Integer element : arrayOfInts) {
            if (element == null) {
                System.out.println("Ups, your array is empty! Try A from Menu.");
                numberEditorMenu();
            }
        }
    }

    void addThreeNumbersToArray(Integer[]arrayOfInts) {

        for (int i = 0; i < arrayOfInts.length; i++) {
            boolean correctNumberValue = false;
             do {
                try {
                    System.out.println("Add number: ");
                    arrayOfInts[i] = intScannaer.nextInt();

                    System.out.println("You just added " + arrayOfInts[i] + " to your array!");
                    correctNumberValue = true;
                }catch (InputMismatchException ex){
                    System.out.println("It doesn't look like number! Try to type a number?");
                    intScannaer.next();
                }
            }while (!correctNumberValue);
        }
    }

    void showAddedNumbers(Integer[]arrayOfInts) {
        arrayNullPointExceptionCheck(arrayOfInts);

        for (Integer integer : arrayOfInts) {
            System.out.print(integer.toString() + " ");
            System.out.println();
        }
    }

    void averageOfThreeNumbers(Integer[]arrayOfInts) {
        arrayNullPointExceptionCheck(arrayOfInts);

        int sumOfAll = 0;

        for (Integer integer : arrayOfInts) {
            sumOfAll += integer;
        }

        double averageOfThree = sumOfAll/arrayOfInts.length;

        System.out.println("Average of three numbers is "+ String.format("%.2f", averageOfThree));
    }

    void minValueOfArray(Integer[]arrayOfInts) {
        arrayNullPointExceptionCheck(arrayOfInts);

        int minValue = arrayOfInts[0];
           for (Integer integer : arrayOfInts) {
            if (integer < minValue)
                minValue = integer;
        }
        System.out.println("Smallest value in array is: " +minValue);
    }
}
