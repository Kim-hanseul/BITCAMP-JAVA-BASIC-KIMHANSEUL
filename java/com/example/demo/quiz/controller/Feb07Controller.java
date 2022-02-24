package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb07Service;
import com.example.demo.quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : Kim-hanseul
 * date       : 2022-02-07
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-07  Kim-hanseul   최초 생성
 */
public class Feb07Controller {
    /**
     * 1. 주사위 dice
     * 2. 가위바위보 rps
     * 3. 입력 받은 두 수 사이에 있는 소수 구하기
     * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기
     * 5. 숫자 맞추기 (death game)
     */
    public void execute(Scanner scanner){
        Feb07Service feb07Service = new Feb07ServiceImpl();
        while (true) {
            System.out.println("\n"+ "[MENU]\n"+ "0. EXIT\n"
                    + "1. 주사위\n"
                    + "2. 가위바위보\n"+ "3. 두 수 사이에 있는 소수 구하기\n"
                    +  "4. 입력받은 연도가 윤년? 평년?\n"
                    + "5. 숫자 맞추기 (DEATH GAME)\n ");
            switch (scanner.next()){
                case "0":
                    System.out.println(" 종료 ");return;
                case "1":
                    System.out.println(" 주사위 ");
                    feb07Service.dice(scanner);
                    break;
                case "2" :
                    System.out.println(" 가위 바위 보");
                    feb07Service.rps(scanner);
                    break;
                case "3" :
                    System.out.println(" 소수 구하기 ");
                    feb07Service.primeNumber(scanner);
                    break;
                case "4":
                    System.out.println(" 입력받은 연도가 윤년? 평년?");
                    feb07Service.leapCommon(scanner);
                    break;
                case "5":
                    System.out.println(" death game ! ");
                    feb07Service.deathGame(scanner);
                    break;
            }
        }
    }
}
