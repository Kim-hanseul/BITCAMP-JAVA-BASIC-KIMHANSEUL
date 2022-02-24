package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb08Service;
import com.example.demo.quiz.service.Feb08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb08Controller
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public class Feb08Controller {
    public void execute(Scanner scanner) {
        Feb08Service feb08Service = new Feb08ServiceImpl();
        while (true) {
            System.out.println("\n" + "[MENU]\n" + "0. EXIT\n"
                    + "1. 로또\n"
                    + "2. 야구게임\n" + "3. 좌석 예약\n"
                    + "4. 은행 입출금\n"
                    + "5. 구구단\n ");
            switch (scanner.next()) {
                case "0":
                    System.out.println(" 종료 ");
                    return;
                case "1":
                    System.out.println(" 로또 ");
                    feb08Service.lotto(scanner);
                    break;
                case "2":
                    System.out.println(" 야구 게임 ");
                    feb08Service.baseball(scanner);
                    break;
                case "3":
                    System.out.println(" 좌석 예약 ");
                    feb08Service.booking(scanner);
                    break;
                case "4":
                    System.out.println(" 은행 입출금 ");
                    feb08Service.bank(scanner);
                    break;
                case "5":
                    System.out.println(" 구구단 ");
                    feb08Service.gugudan(scanner);
                    break;
            }
        }
    }
}


