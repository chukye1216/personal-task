package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    private ArrayList<Double> CircleArray = new ArrayList<>();

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

}
