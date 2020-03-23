package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	
	private Scanner scan = new Scanner(System.in);
	private MemberManager mm = new MemberManager();
	
	
	
	public MemberMenu() {}
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("======회원 관리 메뉴====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 종료");
			System.out.println("==================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int select=scan.nextInt();
			
			switch(select) {
			case 1: mm.insertMember();break;
			case 2: searchMemberMenu();break;
			case 3: updateMemberMenu();break;
			case 4: deleteMemberMenu();break;
			case 5: mm.printAllMember();break;
			case 9: System.out.println("프로그램을 종료합니다");return ;
			default:System.out.println("잘못된 입력입니다 "); continue;
			
			
			}
			
			
			
		}
		
	}
	private void searchMemberMenu() {
		
		
	}
	private void updateMemberMenu() {
		
		
	}

	private void deleteMemberMenu() {
		
		
	}


}
