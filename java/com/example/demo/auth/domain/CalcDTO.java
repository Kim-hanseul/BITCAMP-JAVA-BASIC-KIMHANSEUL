package com.example.demo.auth.domain;

import com.example.demo.oop.domain.Phone;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp.java
 * author     : Kim-hanseul
 * date       : 2022-01-24
 * desc       : 숫자 2개와 연사자를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE      AUTHOR      NOTE
 * ================================
 * 2022-01-24  Kim-hanseul   최초 생성
 */

public class CalcDTO {
    public static String CALC = "Calculator";
    private int num1;
    private String opcode;
    private int num2;

    protected String kind;
    protected String company;
    protected String move;

    public CalcDTO(){}

    public CalcDTO(String kind, String company, String move){
        this.kind = kind;
        this.company = company;
        this.move = move;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getNum1(){
        return num1;}
    public void setNum1(int num1){
        this.num1 = num1;}
    public String getOpcode(){
        return opcode;}
    public void setOpcode(String opcode){
        this.opcode = opcode;}
    public int getNum2(){
        return num2;}
    public void setNum2(int num2){
        this.num2 = num2;}

}





