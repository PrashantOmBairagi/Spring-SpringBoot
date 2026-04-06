package com.SpringSeason.Prashant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer{

    CPU cpu;
    @Autowired //Using setter method to set CPU
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void computerStart(){

        cpu.startCPU();
        System.out.println("Computer Started...");
    }
}
