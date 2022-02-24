package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb08Service;
import com.example.demo.quiz.service.Feb08ServiceImpl;
import com.example.demo.quiz.service.Feb10Service;
import com.example.demo.quiz.service.Feb10ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb10Controller
 * author     : Kim-hanseul
 * date       : 2022-02-11
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-11  Kim-hanseul   최초 생성
 */
public class Feb10Controller {
    public void execute(Scanner scanner) {
        Feb10Service feb10Service = new Feb10ServiceImpl();
        while (true) {
            System.out.println("\n" + "[MENU]\n" + "0. EXIT\n"
                    + "1. zigzag");
            switch (scanner.next()) {
                case "0":
                    System.out.println(" 종료 ");
                    return;
                case "1":
                    System.out.println(" zigzag ");
                    feb10Service.zigzag(scanner);

            }
        }
    }
}
