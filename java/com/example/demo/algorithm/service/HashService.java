package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName   : HashService
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public interface HashService {
    String loserplayer(String[] participant, String[] completion);

    boolean phonechart(String[] phone_book);

    int spy(String[][] clothes);

    int[] bestAlbum(String[] genres, int[] plays);
}
