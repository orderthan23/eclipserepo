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
		System.out.print("���̵� �Է��Ͻÿ� :");
		id=scan.next();
		System.out.print("�н����带 �Է��Ͻÿ� :");
		pwd=scan.next();
		System.out.print("�̸��� �Է��Ͻÿ� :");
		name=scan.next();
		System.out.print("���̸� �Է��Ͻÿ� :");
		age=scan.nextInt();
		System.out.print("������ �Է��Ͻÿ� :");
		gender=scan.next().charAt(0);
		System.out.print("�̸����� �Է��Ͻÿ� :");
		email=scan.next();
		
		m[i]=new Member(id,pwd,name,age,gender,email) {};
		ctn++;
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�");
		
	}
	
	public void searchId() {
		System.out.print("�Է��� ���̵� �Է��ϼ��� :");
		String str=scan.next();
		for(int i=0; i<m.length; i++) {
			if(m[i].getUserId().equals(str)) {
				
				printOne(m[i]);a
			}
			
		}
		
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
	
	public void printOne(Member m) {
		System.out.println("���̵� :"+m.getUserId());
		System.out.println("�н����� :"+m.getUserPwd());
		System.out.println("�̸� :"+m.getUserName());
		System.out.println("���� :"+m.getAge());
		System.out.println("���� :"+m.getGender());
		System.out.println("�̸��� :"+m.getEmail());s
		
	}
	
	

}
