package edu.java.contact.model;

import java.io.Serializable; // 파일에 쓰기 위해서 임포트 함.

// MVC(Model-View-Controller) 아키텍쳐에서 Model에 해당하는 클래스.
// 특별한 기능은 없는, 순수하게 데이터만 설계하는 클래스.
// VO(Value Object): 값(자료)를 표현하는 객체.
// DTO(Date Transfer Object): 데이터를 전달(메서드 아규먼트, 리턴 값)할 때 사용되는 객체.
public class Contact implements Serializable {
	
	// 오라클 DB 테이블 이름과 컬럼 이름들을 상수로 정의. -1
	public interface Entity {
		String TBL_NAME = "CONTACTS"; // 테이블 이름
		String COL_CID = "CID"; // PK
		String COL_NAME = "NAME"; 
		String COL_PHONE = "PHONE";
		String COL_EMAIL = "EMAIL";
	}
	
	// field
	private int cid; // 테이블의 PK
	private String name;
	private String phone;
	private String email;
	
	// constructors
	public Contact() {}

	public Contact(int cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCid() {
		return cid;
	}
	
	@Override
	public String toString() {
		return "Contact(cid = " + this.cid
				+ ", name = " + this.name
				+ ", phone = " + this.phone
				+ ", email = " + this.email
				+")";
		
		// return String.format("Contact(cid=%d, name=%d, phone=%d, email=%s)", cid, name, phone, email); -> 이것도 가능. 
	}
	

}
