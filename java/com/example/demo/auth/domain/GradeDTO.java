package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeDemo
 * author     : Kim-hanseul
 * date       : 2022-01-26
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-01-26  Kim-hanseul   최초 생성
 */
public class GradeDTO {
    public static String GRADE_TITLE = " PASS OR DIE ! GOOD LUCK ";
    private String name;
    private int kor;
    private int eng;
    private int math;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor){
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng){
        this.eng = eng;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math){
        this.math = math;
    }

    }



