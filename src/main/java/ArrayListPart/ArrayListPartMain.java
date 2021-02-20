package ArrayListPart;

import java.util.ArrayList;

public class ArrayListPartMain {
    public static void main(String[] args) {

        ArrayListCreator arrayListCreator = new ArrayListCreator();

        ArrayList<String> firsRandomColorList = new ArrayList<>();
        ArrayList<String> secondRandomColorList = new ArrayList<>();


        arrayListCreator.arrayListOfColorsCreatorMenu(firsRandomColorList, secondRandomColorList);
    }
}
