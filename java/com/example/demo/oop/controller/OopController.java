package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : PhoneController
 * author     : Kim-hanseul
 * date       : 2022-02-08
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-08  Kim-hanseul   최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {
        while (true) {
            System.out.println("[메뉴] 0. exit\n"
                    + "1. 은닉화(Encapsulation)\n"
                    + "2. 상속(Inheritance)\n"
                    + "3. 추상화(Abstraction)\n"
                    + "4. 다형성(Polymorphism)");
            switch (scanner.next()) {
                case "0":
                    System.out.println(" 종료 "); return;
                case "1":
                    System.out.println(" POJO is Encapsulation "); break;
                case "2":
                    System.out.println(" 2. Inheritance ");
                    Phone phone = new Phone("goldstar telephone","goldstar");
                    CelPhone celPhone = new CelPhone(" celluarPhone "," blackberry ", " 이동 ");
                    IPhone iPhone = new IPhone("Apple");
                    GalPhone galPhone = new GalPhone(" Samsung ");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[Submenu] 0. exit 1. 전화기 2. 휴대폰 3. 아이폰 4. 갤럭시");
                    switch (scanner.next()){
                    case "0" :
                        System.out.println(" exit ");return;
                        case "1" :
                            phone.setCall(" hello ? ");
                            phoneService.usePhone(phone);
                            break;
                        case "2" :
                            celPhone.setCall(" hello ! ");
                            phoneService.useCelPhone(celPhone);
                            break;
                        case "3" :
                            iPhone.setSearch(" NEWS ");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4" :
                            galPhone.setPay(" samsung pay ");
                            phoneService.useGalPhone(galPhone);
                            break;

                    }
                    break;
                case "3" :
                    System.out.println(" 3. Abstraction "); break;
                case "4" :
                    System.out.println(" 4. Polymorphism "); break;

            }
        }
    }
}

