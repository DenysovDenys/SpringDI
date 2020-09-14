package com.company.executor;

import com.company.model.Car;
import org.springframework.stereotype.Component;

@Component
public class ExecuteManager {
    private final Car car;

    public ExecuteManager(Car car) {
        this.car = car;
    }

    public void runProgram() {
        System.out.println(car);
    }
}
