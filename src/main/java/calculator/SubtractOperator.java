package calculator;

public class SubtractOperator extends AbstractOperation {
    @Override
    public double operate(int num1, int num2) throws CalcException {
        return num1 - num2;
    }
}
