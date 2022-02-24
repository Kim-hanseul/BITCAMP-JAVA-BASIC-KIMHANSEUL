package com.example.demo;

import com.example.demo.algorithm.controller.AlgorithmController;
import com.example.demo.auth.controller.AuthController;
import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		AuthController memberController = new AuthController();
		OopController phoneController = new OopController();
		QuizController quizController = new QuizController();
		AlgorithmController algorithmController = new AlgorithmController();

		while (true) {
			System.out.println("메뉴\n" + "[ 0. quit ]\n"+"[ 1. auth ]\n" + "[ 2. OOP ]\n" + "[ 3. Quiz ]\n" + "[ 4. Algorithm ]\n"
			); switch (scanner.next()){
				case "0" :
					System.out.println(" quit "); return;
				case "1" :
					System.out.println( " 1. auth ");
					memberController.execute(scanner);break;
				case "2" :
					System.out.println( " 2. OOP ");
					phoneController.execute(scanner);break;
				case "3" :
					System.out.println( " 3. Quiz ");
					quizController.execute(scanner); break;
				case "4" :
					System.out.println( " 4. Algorithm ");
					algorithmController.execute(scanner);break;
				default :
					System.out.println(" wrong number "); break;
			}
		}
	}
}