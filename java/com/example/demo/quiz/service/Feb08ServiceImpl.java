package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
    }

    @Override
    public void baseball(Scanner scanner) {
        int com1 = (int)(Math.random()*9)+1;
        int com2 = (int)(Math.random()*9)+1;
        while(com1==com2) {
            com2 = (int)(Math.random()*9)+1;
        }
        int com3 = (int)(Math.random()*9)+1;
        while(com1==com3||com2==com3) {
            com3 = (int)(Math.random()*9)+1;
        }
        System.out.println(com1 + " " + com2 + " " + com3);

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        int strike = 0;
        int ball = 0;
        int out = 0;

        while(strike != 3) {
            System.out.println("user> 숫자 세 개를 입력하세요.");

            strike = 0;      //돌려줄 때마다 매번 초기화 필요
            ball = 0;
            out = 0;

            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
            if(com1 == num1) {
                strike += 1;
            }else if(com1 == num2 || com1 == num3){
                ball += 1;
            }
            else {
                out+=1;
            }
            if(com2 == num2) {
                strike += 1;
            }else if(com2 == num1 || com2 == num3) {
                ball += 1;
            }
            else {
                out+=1;
            }
            if(com3 == num3) {
                strike += 1;
            }else if(com3 == num1 || com3 == num2) {
                ball += 1;
            }
            else {
                out+=1;
            }

            System.out.println("Strike : " + strike + ", Ball : " + ball + ", Out : " + out);

        }

    }



    @Override
    public void booking(Scanner scanner) {
    }

    @Override
    public void bank(Scanner scanner) {
    }

    @Override
    public void gugudan(Scanner scanner) {
    }
}
