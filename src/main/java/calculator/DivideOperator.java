package calculator;

public class DivideOperator {
    public double operate(double num1, double num2) throws CalcException {
        if (num2 == 0) {
            throw new CalcException("분모는 0으로 나눌 수 없습니다");
        }
        return num1 / num2;
    }
}
