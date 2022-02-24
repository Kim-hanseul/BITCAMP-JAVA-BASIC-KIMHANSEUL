package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.QuizService;
import com.example.demo.quiz.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb06Controller
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public class Feb06Controller {
    public void execute(Scanner scanner) {
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전 탐색", "이중 탐색",
                "스택", "깊이 우선 탐색", "그래프", "탐욕법", "DP",
                "큐", "너비 우선 탐색"};
        Feb06Controller feb06Controller = new Feb06Controller();

        while (true) {
            System.out.println("[MENU] 0.EXIT 1. 2. 3. 4.");
            switch (scanner.next()) {
                case "1:":
                    quiz1(arr);
                    break;
                case "2":
                    quiz2(arr);
                    break;
                case "3":
                    quiz3(arr);
                    break;
                case "4":
                    quiz4(arr);
                    break;
            }
        }


    }


    private static String quiz1(String[] arr) {
        String s = "";
        System.out.println(" Q1 : 팀별 과제를 출력하세요 ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + " : " + arr[1] + "\t";
        }
        System.out.println(s);
        return s;
    }

    private static String quiz2(String[] arr) {
        String s = "";
        System.out.println(" Q2 : 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[1].equals("김진영")) {
                for (int j = 0; j < 3; j++) {
                    s += arr[i + j * 5] + " , ";
                }
                if (i == 17) {
                    break;
                }
            }
        }
        System.out.println(s);
        return s;
    }

    private static void quiz3(String[] arr) {
        String s = "";
        System.out.println(" Q3 : 큐를 담당한 사람을 출력하세요" +
                "예) 큐를 담당한 사람 : 권혜민 ");
        s += arr[15] + "를 담당한 사람 : " + arr[0];


        System.out.println(" Q3 : 입력한 과목의 인덱스를 추출하세요 ");
    }

    private static void quiz4(String[] arr) {
        System.out.println("Q4 . 팀원별 과제수를 출력하세요"
                + " 예) 권혜민(3개), 조현국(3개), 김진영(2개), 김한슬(2개), 서성민(2개)");

        int[] intArr = new int[5];
        int[] resArr = new int[5];
        String s = "";
        for (int i = 5; i < arr.length; i++) {
            int a = i % 5;
            for (int j = 0; j < 5; j++) {
                if (a == j) {
                    intArr[j]++;
                }
            }

        }
    }

}

