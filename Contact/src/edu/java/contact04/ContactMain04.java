package edu.java.contact04;


import java.util.List;
import java.util.Scanner;

import edu.java.contact.menu.Menu;
import edu.java.contact.model.Contact;

// MVC(Model-View-Controller) 아키텍쳐에서 View에 해당하는 클래스.
// UI(User Interface)를 담당하는 클래스.

public class ContactMain04 {

	private final Scanner scanner = new Scanner(System.in);
	private final ContactDaoImpl dao = ContactDaoImpl.getInstance();
	
	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 v0.4 ***");
		
		ContactMain04 app = new ContactMain04();
		// -> ContactMain03의 static이 아닌 필드와 메서드들을 사용하기 위해서.
		
		boolean run = true;
		while (run) {
			int n = app.showMainMenu();
			Menu menu = Menu.getValue(n);
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case CREATE:
				app.insertNewContact();
				break;
			case READ_ALL:
				app.selectAllcontacts();
				break;
			case READ_BY_INDEX:
				app.selectContactByIndex(); 
				break;
			case UPDATE:
				app.updateContact();
				break;
			case DELETE:
				app.deleteContact();
				break;
			default:
					System.out.println("메인 메뉴 번호를 확인하세요...");
			}
		}
		
		System.out.println("*** 프로그램 종료 ***");

	}
	
	
	
	private void deleteContact() {
		System.out.println("\n----- 연락처 삭제 -----");
        System.out.print("삭제할 연락처 인덱스 입력> ");
        int index = inputNumber();
        
        if (!dao.isValidIndex(index)) {
            System.out.println(">>> 해당 인덱스에는 연락처 정보가 없음.");
            return;
        }
        
        int result = dao.delete(index);
        if (result == 1) {
            System.out.println(">>> 연락처 삭제 성공");
        } else {
            System.out.println(">>> 연락처 삭제 실패");
        }
		
	}



	private void updateContact() {
		System.out.println("\n----- 연락처 업데이트 -----");
		System.out.println("수정할 연락처 인덱스 입력> ");
		int index = inputNumber();
		
		if (!dao.isValidIndex(index)) { // 유효하지 않은 인덱스이면 
			System.out.println(">>> 해당 인덱스에는 연락처 정보가 없음.");
			return; // 메서드 종료
		}
		
		Contact before = dao.read(index);
		System.out.println(">>> 수정 전: " + before);
		
		System.out.println("이름 입력> ");
		String name = scanner.nextLine();	
		System.out.println("전화번호 입력> ");
		String phone = scanner.nextLine();
		System.out.println("이메일 입력> ");
		String email = scanner.nextLine();
		
		Contact after = new Contact(0, name, phone, email);
		
		int result = dao.update(index, after);
		if (result == 1) {
			System.out.println(">>> 연락처 업데이트 성공");
		} else {
			System.out.println(">>> 연락처 업데이트 실패");
		}
		}



	private void selectContactByIndex() {
		System.out.println("\n----- 인덱스 검색 -----");
		System.out.println("검색할 연락처 인덱스 입력> ");
		int index = inputNumber();
		
		Contact contact = dao.read(index);
		// -> View에서는 Controller의 메서드를 호출해서 인덱스 검색 결과를 리턴받음.
		
		if (contact != null) {
			System.out.println(contact);
		} else {
			System.out.println(">>> 해당 인덱스에는 연락처 정보가 없음.");
		}
	}
	
	private void selectAllcontacts() {
		System.out.println("\n----- 연락처 전체 목록 -----");
		
		List<Contact> contacts = dao.read();
		// -> View(UI)는 Controller의 메서드를 호출해서 출력에 필요한 데이터 리턴받음.
		
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}
	
	private void insertNewContact() {
		System.out.println("\n----- 새 연락처 저장 -----");
		
//		if(!dao.isMemoryAvailable()) { // 배열에 빈 공간이 없으면
//			System.out.println("연락처를 저장할 공간이 부족합니다...");
//			return; // 메서드 종료
//		}
		
		System.out.println("이름 입력> ");
		String name = scanner.nextLine();
	    System.out.println("전화번호 입력> ");
	    String phone = scanner.nextLine();
	    System.out.println("이메일 입력> ");
	    String email = scanner.nextLine();
	    
	    Contact contact = new Contact(0, name, phone, email); // 저장할 연락처 객체
	    
	    int result = dao.create(contact);
	    // -> 컨트롤러 객체의 메서드를 호출해서 연락처 저장 기능을 실행.
	    if(result == 1) {
	    	System.out.println(">>> 새 연락처 저장 성공");
	    } else {
	    	System.out.println(">>> 새 연락처 저장 실패");
	    }
	}
	

	private int showMainMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("-----------------------------------------------------------");
		System.out.println("선택> ");
		int n = inputNumber();
		
		return n;
	}

	private int inputNumber() {
		while (true) {
			try {
				int n = Integer.parseInt(scanner.nextLine());
				return n;
			} catch (NumberFormatException e) {
				System.out.println("정수 입력>> ");
			}
		}
		
	}

}
