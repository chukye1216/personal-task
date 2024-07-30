package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Calculator calc = new Calculator();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        //while문 사용하여 계산기 반복
        while (true) {
            System.out.println("사칙연산/원의 넓이 중 어떤 것을 구하시겠습니까?(calc/circle)");
            String Choice = sc.nextLine();

            if (Choice.equals("calc")) {
                System.out.println("첫 번째 숫자를 입력하세요: ");

                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                double num1 = sc.nextDouble();

                System.out.println("두 번째 숫자를 입력하세요: ");

                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                double num2 = sc.nextDouble();

                System.out.println("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                //Calculator에서 연산 수행 후 저장
                try {
                    double result = arithmeticCalculator.calculate(num1, num2, operator);
                } catch (CalcException e) {
                    System.out.println(e.getMessage());
                }


                sc.nextLine();

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.nextLine();

                //remove를 받으면 가장 먼저 입력받은 연산결과 삭제
                if (remove.equals("remove")) {
                    arithmeticCalculator.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.nextLine();

                //inquiry를 받으면 저장된 연산결과 조회
                if (inquiry.equals("inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }

            } else if (Choice.equals("circle")) {
                System.out.println("원의 반지름을 입력해주세요 :");
                double radius = sc.nextDouble();
                double answer = circleCalculator.calculateCircleArea(radius);

                sc.nextLine();

                System.out.println("저장된 연산결과를 조회하시겠습니까? (CircleInquiry 입력 시 조회)");
                String CircleInquiry = sc.nextLine();

                if (CircleInquiry.equals("CircleInquiry")) {
                    circleCalculator.circleInquiry();
                }

            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();

            //exit 입력시 프로그램 종료
            if (exit.equals("exit")) {
                break;
            }
        }

    }
}

