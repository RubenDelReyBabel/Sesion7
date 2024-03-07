package com.babelgroup;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CalculadoraApplication {

    private ICalculadoraService calculadoraService;

    public CalculadoraApplication(ICalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int operation = -1;
        while(operation != 5){
            System.out.print("Bienvenido a la calculadora, selecciona una operación:\n" +
                    "\n" +
                    "Sumar\n" +
                    "Restar\n" +
                    "Multiplicar\n" +
                    "Dividir\n" +
                    "Salir\n" +
                    "Selecciona una operación:");
            operation = scanner.nextInt();
            if (operation == 5){
                break;
            }
            System.out.print("Introduzca el primer operando: ");
            int operand1 = scanner.nextInt();
            System.out.print("Introduzca el segundo operando: ");
            int operand2 = scanner.nextInt();
            try {
                double result = calculadoraService.compute(operation, operand1, operand2);
                System.out.println("El resultado de la operación es + " + result);
            } catch (OperationNotFound e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
