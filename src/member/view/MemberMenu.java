package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	
	private Scanner scan = new Scanner(System.in);
	private MemberManager mm = new MemberManager();
	
	
	
	public MemberMenu() {}
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("======ȸ�� ���� �޴�====");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ����");
			System.out.println("==================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int select=scan.nextInt();
			
			switch(select) {
			case 1: mm.insertMember();break;
			case 2: searchMemberMenu();break;
			case 3: updateMemberMenu();break;
			case 4: deleteMemberMenu();break;
			case 5: mm.printAllMember();break;
			case 9: System.out.println("���α׷��� �����մϴ�");return ;
			default:System.out.println("�߸��� �Է��Դϴ� "); continue;
			
			
			}
			
			
			
		}
		
	}
	private void searchMemberMenu() {
		
		while(true) {
			
			System.out.println("=======ȸ�� ���� �˻�======");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���θ޴��� ");
			System.out.println("=====================");
			
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
			int select=scan.nextInt();
			
			switch(select) {
			
			case 1: mm.searchId();break;
			case 2: mm.searchName();break;
			case 3: mm.searchEmail();break;
			case 9: System.out.println("���� �޴��� �̵��մϴ�."); return;
			default: System.out.println("�߸��� �Է��Դϴ� �ٽ��ϼ��� ");continue;
			}
			
			
			
		}
		
		
	}
	private void updateMemberMenu() {
		
		
		
		while(true) {
			
			System.out.println("=======ȸ�� ���� ����======");
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. ���θ޴��� ");
			System.out.println("=====================");
			
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
			int select=scan.nextInt();
			
			switch(select) {
			
			case 1: mm.updatePwd();break;
			case 2: mm.updateName();break;
			case 3: mm.updateEmail();break;
			case 9: System.out.println("���� �޴��� �̵��մϴ�."); return;
			default: System.out.println("�߸��� �Է��Դϴ� �ٽ��ϼ��� ");continue;
			}
			
		}
		
		
	}

	private void deleteMemberMenu() {
		
while(true) {
			
			System.out.println("=======ȸ�� ���� ����======");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ��ü ȸ�� ����");
			System.out.println("9. ���θ޴��� ");
			System.out.println("=====================");
			
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
			int select=scan.nextInt();
			
			switch(select) {
			
			case 1: MemberManager.deleteOne();break;
			case 2: mm.updateName();break;
			case 3: mm.updateEmail();break;
			case 9: System.out.println("���� �޴��� �̵��մϴ�."); return;
			default: System.out.println("�߸��� �Է��Դϴ� �ٽ��ϼ��� ");continue;
			}
			
		}
		
		
	}


}
