package com.example.demo.auth.service;


import com.example.demo.auth.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentService
 * author     : Kim-hanseul
 * date       : 2022-02-07
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-07  Kim-hanseul   최초 생성
 */
public interface AuthService {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String login(UserDTO login);

}
