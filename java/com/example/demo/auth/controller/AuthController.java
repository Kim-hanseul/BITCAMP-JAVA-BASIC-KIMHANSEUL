package com.example.demo.auth.controller;

import com.example.demo.auth.service.AuthService;
import com.example.demo.auth.domain.BmiDTO;
import com.example.demo.auth.service.AuthServiceImpl;
import com.example.demo.auth.domain.CalcDTO;
import com.example.demo.auth.domain.GoogleDTO;
import com.example.demo.auth.domain.GradeDTO;
import com.example.demo.auth.domain.UserDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : Kim-hanseul
 * date       : 2022-01-27
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-01-27  Kim-hanseul   최초 생성
 */
public class AuthController {
    public void execute(Scanner scanner){
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        AuthService service = new AuthServiceImpl();


        while(true){
            System.out.println(" Select Menu ");
            String menu = "0. EXIT\n "
                    + "1. BMI\n "
                    + "2. CALC\n "
                    + "3. SEARC\n "
                    + "4. GRADE\n "
                    + "5. LOGIN\n" ;
            System.out.println(menu);
            String res = "";
            switch(scanner.next()){
                case "0" :
                    System.out.println("Exit"); return;

                    case "1" :
                System.out.println(BmiDTO.BMI+ "\n NAME, HEIGHT, WEIGHT ");
                bmi.setName(scanner.next());
                bmi.setHeight(scanner.nextDouble());
                bmi.setHeight(scanner.nextDouble());
                res = service.getBmi(bmi);
                break;

                case "2" :
                System.out.println(CalcDTO.CALC+ "\n first num , 연산자 ,second number");
                calc.setNum1(scanner.nextInt());
                calc.setOpcode(scanner.next());
                calc.setNum2(scanner.nextInt());
                res = service.calc(calc);
                break;

                case "3" :
                    System.out.println(GoogleDTO.GOOGLE+ "\n input your keyword ");
                    google.setBlank(scanner.next());
                    res = service.search(google);
                break;

                case "4" :
                    System.out.println(GradeDTO.GRADE_TITLE + "\n NAME, KOR grade, ENG grade, MATH grade ");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.getGrade(grade);
                break;

                case "5" :
                System.out.println(UserDTO.LOGIN_TITLE + "\n input your id, pw, name ");
                UserDTO u = UserDTO.getInstance();
                u.setId(scanner.next());
                u.setPw(scanner.next());
                u.setName(scanner.next());
                res = service.login(u);
                break;

                default:  res = " write wrong number "; break;
            }
            System.out.println(res);
        }
        }
        }
