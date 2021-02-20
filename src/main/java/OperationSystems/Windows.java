package OperationSystems;

import java.time.LocalDate;

public class Windows extends OS{
    public Windows(String name, String startUpTime, String bios,
                   LocalDate manufactureDate, String version) {
        super(name, startUpTime, bios, manufactureDate, version);
    }

}
