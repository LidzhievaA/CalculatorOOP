package calculator;

public final class Calculator implements Calculable {

    private ComplexNumber complexNumber;

    
    public Calculator(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }

    @Override
    public void sum(ComplexNumber complexNumber) {
        int a = complexNumber.getA() + complexNumber.getA();
        int b = complexNumber.getB() + complexNumber.getB();
        complexNumber.setA(a);
        complexNumber.setB(b);
    }

    public void multi(ComplexNumber complexNumber) {
        int a = complexNumber.getA() * complexNumber.getA() - complexNumber.getB() * complexNumber.getB();
        int b = complexNumber.getA() * complexNumber.getB() + complexNumber.getB() * complexNumber.getA(); ;
        complexNumber.setA(a);
        complexNumber.setB(b);
    }



    public ComplexNumber getResult() {
        return complexNumber;
    }



}
