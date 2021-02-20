package OperationSystems;

import java.time.LocalDate;

public abstract class OS {

    private String Name;
    private String StartUpTime;
    private String Bios;
    private LocalDate manufactureDate;
    private String version;

    public OS(String name, String startUpTime, String bios, LocalDate manufactureDate, String version) {
        Name = name;
        StartUpTime = startUpTime;
        Bios = bios;
        this.manufactureDate = manufactureDate;
        this.version = version;
    }

    @Override
    public String toString() {
        return "OS{" +
                "Name='" + Name + '\'' +
                ", StartUpTime='" + StartUpTime + '\'' +
                ", Bios='" + Bios + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", version='" + version + '\'' +
                '}';
    }
}
