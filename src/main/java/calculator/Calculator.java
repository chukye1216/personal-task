package calculator;

import java.util.ArrayList;

public class Calculator {
    // 한번 입력된 반지름 값은 변하지 않음 -> static
    static double radius;

    //파이 값은 절대로 변하지 않을 상수. -> final static
    final static double PI = 3.14;
    private ArrayList<Double> saveArray = new ArrayList<>();
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
     * 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
     *
     * @return
     */
    public ArrayList<Double> getSaveArray() {
        return saveArray;
    }

    /**
     * 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
     *
     * @param
     */
    public void setSaveArray(ArrayList<Double> saveArray) {
        this.saveArray = saveArray;
    }

    public ArrayList<Double> getCircleArray() {
        return CircleArray;
    }

    public void setCircleArray(ArrayList<Double> CircleArray) {
        this.CircleArray = CircleArray;
    }
}

