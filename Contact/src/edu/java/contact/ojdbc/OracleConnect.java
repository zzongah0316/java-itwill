package edu.java.contact.ojdbc;

public interface OracleConnect {
	// Oracle DB 접속 URL
	String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // - 1
	
	// Oracle DB 접속 계정
	String USER = "scott"; // - 2
	
	// Oracle DB 접속 계정의 비밀번호
	String PASSWORD = "tiger"; // - 3
}
