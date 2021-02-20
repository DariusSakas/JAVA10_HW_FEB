package OperationSystems;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        OS linux = new Linux("Ubuntu", "2",
                "EFI", LocalDate.of(2020,02,20),"Home" );
        OS windows = new Windows("Ubuntu", "2",
                "EFI", LocalDate.of(2020,02,20),"Home");
        OS mac = new iOS("Ubuntu", "2",
                "EFI", LocalDate.of(2020,02,20),"Home" );

        OS [] arrayOfOSSystems = new OS[3];
        arrayOfOSSystems[0] = linux;
        arrayOfOSSystems[1]= windows;
        arrayOfOSSystems[2]= windows;

        for (OS arrayOfOSSystem : arrayOfOSSystems) {
            System.out.println(arrayOfOSSystem.toString());
        }

    }
}
