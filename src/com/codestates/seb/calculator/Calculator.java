package com.codestates.seb.calculator;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");
    System.out.println("숫자를 입력하세요");
    Scanner input1 = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
    // TODO...


    double a = input1.nextDouble();

    System.out.println("숫자를 입력하세요");
    Scanner input3 = new Scanner(System.in);
    double c = input3.nextDouble();

    System.out.println("연산자를 입력해 주세요");
    Scanner input2 = new Scanner(System.in);
    String b = input2.nextLine();

    double result = 0.0;
    if(b.equals("+")){
       result = a + c;
    }
    else if(b.equals("-")){
       result = a - c;
    }
    else if(b.equals("x")){
       result = a * c;
    }
    else if(b.equals("/")){
      result = a / c;
    }
    else{
      System.out.println("잘못된 입력입니다.");
    }

    System.out.println(result);



  }
}
