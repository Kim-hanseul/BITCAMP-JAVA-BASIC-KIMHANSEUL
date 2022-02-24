package com.example.demo.oop;

/**
 * packageName: com.example.demo.controller
 * fileName   : ArrayExam
 * author     : Kim-hanseul
 * date       : 2022-02-04
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-04  Kim-hanseul   최초 생성
 */
public class ArrayExam {
    public static void main(String[] args) {
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전 탐색", "이중 탐색",
                "스택", "깊이 우선 탐색", "그래프", "탐욕법", "DP",
                "큐", "너비 우선 탐색"};

        quiz1(arr);
        quiz2(arr);
        quiz3(arr);
        quiz4(arr);

    }




    private static String quiz1(String[] arr) {
        String s = "";
        System.out.println(" Q1 : 팀별 과제를 출력하세요 ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n"; }
            s += i + " : " + arr[1] + "\t"; }
        System.out.println(s);
        return s;
    }

    private static String quiz2(String[] arr) {
        String s = "";
        System.out.println(" Q2 : 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[1].equals("김진영")) {for (int j = 0; j < 3; j++) {
                s += arr[i + j * 5] + " , "; }
                if (i == 17) {break;}
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

        int count = 0;
        String countManager = "";
        countManager += arr[0] + "(3개),";
        countManager += arr[1] + "(3개),";
        countManager += arr[2] + "(2개),";
        countManager += arr[3] + "(2개),";
        countManager += arr[4] + "(2개),";
        countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
    }
}





