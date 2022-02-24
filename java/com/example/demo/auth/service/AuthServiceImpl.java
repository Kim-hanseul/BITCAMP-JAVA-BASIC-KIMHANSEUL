package com.example.demo.auth.service;
import com.example.demo.auth.domain.*;
/**
 * packageName: com.example.demo.service
 * fileName   : StudentServiceImpl
 * author     : Kim-hanseul
 * date       : 2022-02-07
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-07  Kim-hanseul   최초 생성
 */
public class AuthServiceImpl implements AuthService {

    /**
     * BMI = w / t * t
     * 고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     * */

    @Override
    public String getBmi(BmiDTO param) {
        double bmi = param.getWeight() / (param.getHeight() * param.getHeight()) * 10000;
        String s = "";
        if(bmi >= 35){
            s =  " 고도 비만 ";
        }else if(bmi >= 30){
            s= " 중(重)도 비만 (2단계 비만) " ;
        }else if(bmi >= 25){
            s= " 경도 비만 (1단계 비만) " ;
        }else if(bmi >= 23){
            s = " 과체중 " ;
        }else if(bmi >= 18.5){
            s = " 정상 " ;
        }else {
            s= " 저체중 ";
        }
        return param.getName()+" : "+s;
    }

    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String search(GoogleDTO google) {
        return null;
    }

    @Override
    public String getGrade(GradeDTO grade) {
        return null;
    }

    @Override
    public String login(UserDTO login) {
        return null;
    }
}
