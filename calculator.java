public class Calculator {
    int sum(int first, int second){
        return first + second;
    }
    int subtract(int first, int second){
        return first - second;
    }
    int multiply(int first, int second){
        return first * second;
    }
    int divide(int first, int second){
        if (second != 0){
            return first / second;
        }
        else{
            throw new IllegalArgumentException("Error");
        }
    }
    double squareRoot(int number)
    {
        if (number >= 0)
            return Math.sqrt(number);
        else {
            throw new IllegalArgumentException("Error");
        }
    }

    double squared_1(int number)
    {
        return Math.pow(number, 2);
    }

    double squared_2(int first, int second)
    {
        return Math.pow(first, second);
    }

    double ln(double number)
    {
        return Math.log(number);
    }

    double abs(double numder){
        return Math.abs(numder);
    }

    int factorialis(int number){
        int result = 1;
        for (int i = 0; i <= number; i++){
            result = result * i;
        }
        return result;
    }

}
