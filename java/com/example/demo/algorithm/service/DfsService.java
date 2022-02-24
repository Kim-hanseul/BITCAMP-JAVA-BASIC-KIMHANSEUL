package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : DfsService
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public interface DfsService {
    int targetNumber(int[] numbers, int target);
    int network(int n, int[][] computers);
    int wordChange(String begin, String target, String[] words);
    String[] trip(String[][] tickets);
}
