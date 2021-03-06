package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : SortService
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public interface SortService {
    int[] kNumber(int[] array, int[][] commands);
    String bestNumber(int[] numbers);
    int solution(int[] citations);
}
