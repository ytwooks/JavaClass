package day5;

import java.util.Scanner;

public class Myshop3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1을 입력해주세요");
		System.out.print("숫자1 입력>>>");
		int input = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자2를 입력해주세요");
		System.out.print("숫자2 입력>>>");
		int input1 = sc1.nextInt();
		
		Cal2 cal2 = new Cal2();
		int result = cal2.myCal(input, input1) * 100;
		
		System.out.println("결과는 " + result + "입니다.");
		
	}

}
