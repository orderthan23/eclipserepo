package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int ctn=0;
	private Scanner scan = new Scanner(System.in);
	
	
	public MemberManager() {}
	
	
	

	public void insertMember() {
		String id,pwd,name,email;
		char gender;
		int age;
		for(int i=0; i<m.length; i++) {
		System.out.print("아이디를 입력하시오 :");
		id=scan.next();
		System.out.print("패스워드를 입력하시오 :");
		pwd=scan.next();
		System.out.print("이름을 입력하시오 :");
		name=scan.next();
		System.out.print("나이를 입력하시오 :");
		age=scan.nextInt();
		System.out.print("성별을 입력하시오 :");
		gender=scan.next().charAt(0);
		System.out.print("이메일을 입력하시오 :");
		email=scan.next();
		
		m[i]=new Member(id,pwd,name,age,gender,email) {};
		ctn++;
		}
		System.out.println("입력이 완료되었습니다. 메인메뉴로 돌아갑니다");
		
	}
	
	public void searchId() {
		// TODO Auto-generated method stub
		
	}

	public void printAllMember() {
		// TODO Auto-generated method stub
		
	}


	public void searchName() {
		// TODO Auto-generated method stub
		
	}

	public void searchEmail() {
		// TODO Auto-generated method stub
		
	}

	public void updatePwd() {
		// TODO Auto-generated method stub
		
	}

	public void updateName() {
		// TODO Auto-generated method stub
		
	}

	public void updateEmail() {
		// TODO Auto-generated method stub
		
	}

	public static void deleteOne() {
		// TODO Auto-generated method stub
		
	}
	
	

}
