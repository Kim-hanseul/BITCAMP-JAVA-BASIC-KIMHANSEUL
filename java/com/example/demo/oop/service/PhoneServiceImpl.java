package com.example.demo.oop.service;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.oop.service
 * fileName   : PhoneServiceImpl
 * author     : Kim-hanseul
 * date       : 2022-02-09
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-09  Kim-hanseul   최초 생성
 */
public class PhoneServiceImpl implements PhoneService {

    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone celPhone) {
        System.out.println(celPhone.toString());
    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());
    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());
    }
}

