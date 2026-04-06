package com.SpringSeason.Prashant;
import org.springframework.beans.factory.annotation.Autowired;

public class CPU {
    @Autowired //Using Constructor Injection
    Ram ram;
    // @Autowired //Using Setter Injection
    public void setRam(Ram ram) {
        this.ram = ram;
        System.out.println("using SetterMethod");
    }
    public void startCPU() {

        ram.startRam();
        System.out.println("CPU Started...");
    }
}
