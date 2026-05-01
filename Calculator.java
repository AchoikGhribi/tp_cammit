// // Calculator.java before refactoring
// public class Calculator {
//     public double calc(double a, double b) {
//         double x = a + b;
//         double y = a * b;
//         return x / y;
//     }

//     public void prtRes(double res) {
//         System.out.println("Result: " + res);
//     }
// }

// After refactoring
public class Calculator {
    public double calculateSumProductRatio(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        double product = firstNumber * secondNumber;
        return sum / product;
    }

    public void printResult(double resultValue) {
        System.out.println("Result: " + resultValue);
    }
}