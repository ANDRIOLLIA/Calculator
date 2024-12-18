public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    private Calculator(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int multiply (){
        return firstNumber * secondNumber * thirdNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public static Calculator calculate(int num1, int num2, int num3){
        Calculator calculatorAndrey = new Calculator(num1, num2, num3);
        System.out.println("Хэш-код внутреннего объекта: " +  calculatorAndrey.hashCode());
        return calculatorAndrey;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", thirdNumber=" + thirdNumber +
                '}';
    }
}