package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{
    private AddOperator add = new AddOperator();
    private SubtractOperator sub = new SubtractOperator();
    private MultiplyOperator mul = new MultiplyOperator();
    private DivideOperator div = new DivideOperator();

    private ArrayList<Double> saveArray = new ArrayList<>();

    public int calculate(double num1, double num2, char operator) throws CalcException {
        int result = 0;
        switch (operator) {
            case '+':

                result = (int) add.operate(num1, num2);
                System.out.println("결과: " + result);
                break;


            case '-':
                result = (int) sub.operate(num1, num2);
                System.out.println("결과: " + result);
                break;


            case '*':
                result = (int) mul.operate(num1, num2);
                System.out.println("결과: " + result);
                break;


            case '/':
                    result = (int) div.operate(num1, num2);
                    System.out.println("결과: " + result);

                break;


            default:
                throw new CalcException("잘못된 연산자를 입력했습니다.");


        }
        //리스트에 결과값 저장
        saveArray.add((double) result);
        return result;
    }

    /**
     * remove를 받으면 가장 먼저 입력받은 연산결과 삭제
     */
    public void removeResult() {
        saveArray.remove(0);
    }

    /**
     * inquiry를 입력받으면 저장된 연산 결과 조회
     */
    public void inquiryResults() {
        for (Double saveArray_res : saveArray) {
            System.out.println(saveArray_res);
        }
    }
}
