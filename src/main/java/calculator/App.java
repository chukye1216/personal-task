package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 생성
        ArrayList<Integer> save = new ArrayList<>();
        //count 값 초기화
        int count = 0;

        //while문 사용하여 계산기 반복
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");

            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");

            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
            char operator = sc.next().charAt(0);

            //result 값 초기화
            int result = 0;

            //swich문 사용해 연산 기호 구분하여 출력
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
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = num1 / num2;
                        System.out.println("결과: " + result);
                    }
                    break;


                default:
                    System.out.println("올바른 사칙연산 기호를 입력해주세요");
                    break;


            }
            //리스트에 결과값 저장
            save.add(result);
            sc.nextLine();

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();
            //remove를 받으면 가장 먼저 입력받은 연산결과 삭제
            if (remove.equals("remove")) {
                save.remove(0);
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (inquiry.equals("inquiry")) {
                for(int save_res : save){
                    System.out.println(save_res);
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
