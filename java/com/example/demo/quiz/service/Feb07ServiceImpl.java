package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : Kim-hanseul
 * date       : 2022-02-07
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-07  Kim-hanseul   최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{

    @Override
    public void dice(Scanner scanner) {

    }

    @Override
    public void rps(Scanner scanner) {

    }

    @Override
    public void primeNumber(Scanner scanner) {


        int a;
        System.out.print("수 입력 : ");
        a = scanner.nextInt();
        int count=0;

        for(int i=2; i<=a; i++) {
            for(int j=2; j<=i; j++) {
                if(i%j ==0)  {
                    count ++;
                }
            }

            if(count==1) {
                System.out.print(i+" ");
                }
            count=0;
        }
    }

    @Override
    public void leapCommon(Scanner scanner) {

    }

    @Override
    public void deathGame(Scanner scanner) {

    }
}
