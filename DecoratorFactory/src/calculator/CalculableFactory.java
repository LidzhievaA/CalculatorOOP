package calculator;

public class CalculableFactory implements ICalculableFactory {

    
    @Override
    public Calculable create(ComplexNumber arg) {
        return new Calculator (arg);
    }





}
