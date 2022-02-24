package com.example.demo.auth.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginApp.java
 * author     : Kim-hanseul
 * date       : 2022-01-24
 * desc       : 아이디 패스워드 이름 값을 받아서 로그인을 하는 앱
 * ================================
 * DATE      AUTHOR      NOTE
 * ================================
 * 2022-01-24  Kim-hanseul   최초 생성
 */
public class UserDTO {
    public static String LOGIN_TITLE = " LOGIN SCREEN ";

    private final static UserDTO userDTO = new UserDTO();

    private UserDTO(){}

    public static UserDTO getInstance(){
        return userDTO;
    }
    private String id;
    private String pw;
    private String name;
    public static String PASSWORD = "abc";


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
