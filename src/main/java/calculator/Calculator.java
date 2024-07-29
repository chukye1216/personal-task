package calculator;

import java.util.ArrayList;

public class Calculator {
    // 한번 입력된 반지름 값은 변하지 않음 -> static
    static double radius;
    //파이 값은 절대로 변하지 않을 상수. -> final static
    final static double PI = 3.14;
    private ArrayList<Integer> saveArray = new ArrayList<>();
    //원의 넓이를 저장할 새 리스트 생성
    private ArrayList<Double> CircleArray = new ArrayList<>();

    /**
     * Calculator 인스턴스를 생성(new)할 때 생성자를 통해 연산 결과를 저장하고 있는 컬렉션 필드가 초기화 되도록 수정합니다.
     */
    public Calculator() {
        //생성자로 리스트 초기화
        this.saveArray = new ArrayList<>();
        this.CircleArray = new ArrayList<>();
    }

    /**
     * App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정
     */


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
    public void removeResult() {
        saveArray.remove(0);
    }

    /**
     * inquiry를 입력받으면 저장된 연산 결과 조회
     */
    public void inquiryResults() {
        for (int saveArray_res : saveArray) {
            System.out.println(saveArray_res);
        }
    }
    //원의 넓이를 구하는 메서드 생성
    public double calculateCircleArea(double radius) {
        double Cir = PI * radius * radius;
        CircleArray.add(Cir);
        System.out.println("원의 넓이 :" + Cir);
        return Cir;


    }
    //저장된 원의 넓이 값들 바로 전체 조회
    public void circleInquiry() {
        for (double saveCircl : CircleArray) {
            System.out.println(saveCircl);
        }
    }


    /**
     * 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
     *
     * @return
     */
    public ArrayList<Integer> getSaveArray() {
        return saveArray;
    }

    /**
     * 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
     *
     * @param
     */
    public void setSaveArray(ArrayList<Integer> saveArray) {
        this.saveArray = saveArray;
    }

    public ArrayList<Double> getCircleArray() {
        return CircleArray;
    }

    public void setCircleArray(ArrayList<Double> CircleArray) {
        this.CircleArray = CircleArray;
    }
}

