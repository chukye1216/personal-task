package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> saveArray = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) throws CalcException {
        int result = 0;
        switch (operator) {
            case '+':

                result = num1 + num2;
                System.out.println("결과: " + result);
                break;


            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;


            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;


            case '/':
                //if문 사용하여 num2에 0이 오는 경우 해당 연산오류 내용 출력
                if (num2 == 0) {
                    throw new CalcException("분모는 0으로 나눌 수 없습니다");
                } else {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                }
                break;


            default:
                throw new CalcException("잘못된 연산자를 입력했습니다.");



        }
        //리스트에 결과값 저장
        saveArray.add(result);
        return result;
    }

    /**
     * remove를 받으면 가장 먼저 입력받은 연산결과 삭제
     */
    public void remove() {
            saveArray.remove(0);
    }

    /**
     * inquiry를 입력받으면 저장된 연산 결과 조회
     */
    public void inquiry() {
            for (int saveArray_res : saveArray) {
                System.out.println(saveArray_res);
            }

    }
}
