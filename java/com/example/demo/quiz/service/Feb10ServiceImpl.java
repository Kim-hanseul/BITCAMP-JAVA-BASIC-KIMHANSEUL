package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : Kim-hanseul
 * date       : 2022-02-10
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-10  Kim-hanseul   최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {



    @Override
    public void zigzag(Scanner scanner) {

         Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[][] num = new int[count][count];
        int temp = 1;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < count; j++) {
                    num[i][j] = temp;
                    temp++;
                }
            } else
                for (int j = count - 1; j >= 0; j--) {
                    num[i][j] = temp;
                    temp++;
                }
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.printf("%3d" + " ", num[i][j]);
            }

            System.out.println();


        }
    }
    }
