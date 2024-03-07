package com.babelgroup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CalculadoraApplication application = context.getBean(CalculadoraApplication.class);
        application.run();
    }
}
