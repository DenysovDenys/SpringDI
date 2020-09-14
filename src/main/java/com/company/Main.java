package com.company;


import com.company.config.Config;
import com.company.executor.ExecuteManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        ExecuteManager executeManager = annotationConfigApplicationContext.getBean(ExecuteManager.class);
        executeManager.runProgram();
        annotationConfigApplicationContext.close();
    }
}
