package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : GreedyService
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public interface GreedyService {
    int sweatsuit(int n, int[] lost, int[] reserve);
    int joystick(String name);
    String bignumber(String number, int k);
    int lifeboat(int[] people, int limit);
    int island(int n, int[][] costs);
    int securityCamera(int[][] routes);
}
