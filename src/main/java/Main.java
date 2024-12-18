public class Main {
    public static void main(String[] args) {
//        Calculator firstCalculator = Calculator.calculate(248, 2, 3);
//        System.out.println("Хэш-код внешнего объекта: " +  firstCalculator.hashCode());

        Calculator number = Calculator.calculate(6,3,1);
        updateNumber(number);
        System.out.println(number);

    }
    public static void updateNumber(Calculator currentNumber) {
        currentNumber.setFirstNumber(7);
    }
}
