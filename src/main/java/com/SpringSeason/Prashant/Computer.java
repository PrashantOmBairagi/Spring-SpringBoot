package com.SpringSeason.Prashant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer{
    @Autowired //Using Constructor Injection
    Ram ram;

    CPU cpu;
    @Autowired //Using setter method to set CPU
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    // @Autowired //Using Setter Injection
    public void setRam(Ram ram) {
        this.ram = ram;
        System.out.println("using SetterMethod");
    }

    public void computerStart(){

        cpu.startCPU();
        ram.startRam();
        System.out.println("Computer Started...");
    }
}
