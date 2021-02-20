package ArrayListPart;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArrayListCreator {

    //ArrayList<String> firstArrayListOfColors = new ArrayList<>();
    //ArrayList<String> secondArrayListOfColors = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    String colorName;

    void arrayListOfColorsCreatorMenu(ArrayList<String> firstArrayListOfColors, ArrayList<String> secondArrayListOfColors) {
        String userMenuInput;

        ArrayList<String> firstArrayListOfColor = firstArrayListOfColors;
        ArrayList<String> secondArrayListOfColor = secondArrayListOfColors;

        do {
            System.out.println("-----------MENU----------");

            System.out.println("Choose letter from noob program:");
            System.out.println("A - Add color to the list");
            System.out.println("B - Show first list of colors");
            System.out.println("C - Insert insert element to the first position");
            System.out.println("D - Copy first list to the second one");
            System.out.println("E - Show second list of colors");
            System.out.println("F - Iterate through first list of colors");

            System.out.println("X - Exit");
            System.out.println("-----------MENU----------");

            userMenuInput = scanner.nextLine().toUpperCase(Locale.ROOT);

            menuOptions(userMenuInput,firstArrayListOfColor, secondArrayListOfColor);

        } while (!userMenuInput.equalsIgnoreCase("x"));
    }

    void menuOptions(String choiceOfUser,ArrayList<String> firstArrayListOfColors, ArrayList<String> secondArrayListOfColors) {
        switch (choiceOfUser) {
            case "A":
                addNewColorToArray(firstArrayListOfColors);
                break;
            case "B":
                showColorList(firstArrayListOfColors);
                break;
            case "C":
                addColorToTheFirstPosition(firstArrayListOfColors);
                break;
            case "D":
                copyFirstArrayToTheSecond(firstArrayListOfColors, secondArrayListOfColors);
                break;
            case "E":
                showSecondArrayListOfColors(secondArrayListOfColors);
                break;
            case "F":
                iterateThroughFirstArrayOfColors(firstArrayListOfColors);
                break;
            default:
                System.out.println("No such option. Take another try!");
        }
    }

    void addNewColorToArray(ArrayList<String> firstArrayList) {
        System.out.println("Type name of color to add:");
        colorName = scanner.nextLine();
        firstArrayList.add(colorName);
    }

    void showColorList(ArrayList<String> firstArrayList) {
        if (firstArrayList.isEmpty())
            System.out.println("Ups! Your list is empty. Try to add some colors!");
        else {
            System.out.println("Colors in the list:");
            System.out.println(firstArrayList.toString());
        }
    }

    void addColorToTheFirstPosition(ArrayList<String> firstArrayList) {
        System.out.println("Type color name for first position in the list:");
        colorName = scanner.nextLine();
        firstArrayList.add(0, colorName);
    }

    void copyFirstArrayToTheSecond(ArrayList<String> firstArrayList, ArrayList<String> secondArrayListOfColors) {

        secondArrayListOfColors.clear();
        secondArrayListOfColors.addAll(firstArrayList);

        System.out.println("Congrats! You just created a useless clone of your list.");
    }

    void showSecondArrayListOfColors(ArrayList<String> secondArrayList) {
        if (secondArrayList.isEmpty())
            System.out.println("Second list is empty! Nothing to show here. Try to clone!");
        else {
            System.out.println("Second list of colors: ");
            System.out.println(secondArrayList.toString());
        }
    }

    void iterateThroughFirstArrayOfColors(ArrayList<String> firstArrayList) {
        System.out.println("Iterating......");
        for (String firstArrayListOfColorElement : firstArrayList) {
            System.out.println(firstArrayList.indexOf(firstArrayListOfColorElement)
                    + " position element is " + firstArrayListOfColorElement.toString());
        }
    }
}
