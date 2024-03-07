package com.babelgroup;

public interface ICalculadoraService {

    double compute(int operation, double operand1, double operand2) throws OperationNotFound;
}
