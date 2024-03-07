package com.babelgroup;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService implements ICalculadoraService {

        @Override
        public double compute(int operation, double operand1, double operand2) throws OperationNotFound {
            return switch (operation) {
                case 1 -> operand1 + operand2;
                case 2 -> operand1 - operand2;
                case 3 -> operand1 * operand2;
                case 4 -> operand1 / operand2;
                default -> throw new OperationNotFound();
            };
        }
}
