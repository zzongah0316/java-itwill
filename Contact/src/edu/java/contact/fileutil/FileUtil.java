package edu.java.contact.fileutil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;



// 도우미 클래스 - 파일 관련(read, write, 폴더 생성) 기능을 제공하기 위한 클래스.
// 모든 필드와 메서드는 static으로 선언, 객체 생성은 하지 못하도록.
public class FileUtil {
	// 상수 정의
	public static final String DATA_DIR = "data"; // 데이터 폴더 이름
	public static final String DATA_FILE = "contacts.dat"; // 데이터 파일 이름
	// -> .\data\contacts.dat 파일에 연락처 리스트 객체를 저장하기 위해서.
	
	// private 생성자 - 다른 클래스에서는 생성자가 보이지 않기 때문에 객체를 생성할 수 없음.
	private FileUtil() {}
	
	/**
	 * 연락처 데이터 파일을 저장하는 폴더가 존재하지 않으면 생성하고, File 객체를 리턴.
	 * 이미 폴더가 생성되어 있는 경우에는, 그 폴더의 File 객체를 리턴.
	 * 
	 * @return 데이터 파일을 저장할 폴더의 File 객체.
	 */
	public static File initDataDir() {
		// TODO
		File dir = new File(DATA_DIR); 
		if(dir.exists()) { // 폴더가 존재하면
			System.out.println("데이터 폴더가 이미 있습니다...");
		} else { // 폴더가 존재하지 않으면 
			dir.mkdir(); 
			System.out.println("데이터 폴더 생성 성공");
		}
		
		return dir;
	}
	
	/**
	 * readDataFromFile.
	 * argument로 전달된 File 객체를 사용해서, 파일에 저장된 연락처 정보를 읽고, 
	 * 그 결과를 List<Contact> 타입의 객체로 리턴.
	 * 
	 * @param file 연락처 정보가 저장된 파일 경로를 가지고 있는 File 타입 객체.
	 * @return Contact 타입을 원소로 갖는 리스트(List).
	 */
	// TODO
	public static List<Contact> readDataFromFile (File file) {
		List<Contact> list = new ArrayList<>();
	  		try (
	  				FileInputStream in = new FileInputStream(file);
	  				BufferedInputStream bin = new BufferedInputStream(in);
	  				ObjectInputStream oin = new ObjectInputStream(bin);
	  		){
	  			list = (List<Contact>) oin.readObject();
	  			
	  		} catch (Exception e) {
	  			e.printStackTrace();
	  		}		
	  		return list;
     }

	
	
	/**
	 * writeDataToFile.
	 * argument로 전달된 data를 (직렬화해서 OOS) file에 씀.
	 * 
	 * @param data 파일에 쓸 데이터. Contact 타입을 저장하는 리스트(List<Contact>).
	 * @param file 데이터 파일(File) 객체
	 */
	// TODO
	// 내가 푼것
	//public static List<Contact> writeDataToFile (File file, List<Contact> contacts){
	public static void writeDataToFile(List<Contact> data, File file) {	
		try(
				FileOutputStream out = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);
		){
			oout.writeObject(data);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * initData.
	 * 연락처 데이터 파일이 있으면, 파일의 내용을 읽어서 리스트를 생성하고 리턴.
	 * 연락처 데이터 파일이 없으면, 빈 리스트를 리턴.
	 * 
	 * @return Contact 타입을 원소로 갖는 리스트(List<Contact>).
	 */
	
     public static List<Contact> initData(){
    	 // TODO
    	 File file = new File(DATA_DIR, DATA_FILE); // .\data\contacts.dat 파일 객체
    	 List<Contact> list = new ArrayList<>();
 		if(file.exists()) { // 파일이 존재하면
 			list = readDataFromFile(file);
 			System.out.println("연락처 파일 로딩중...");
 		} else { // 파일이 존재하지 않으면
 			
    	
     }
 		return list;
     }
}
//     public static List<Contact> initData(){
//     File file = new File(DATA_DIR, DATA_FILE); // .\data\contacts.dat 파일 객체
//	 List<Contact> list = null;
//		if(file.exists()) { // 파일이 존재하면
//			System.out.println("파일이 이미 있습니다...");
//			list = readDataFromFile(file);
//		} else { // 파일이 존재하지 않으면
//			 List<Contact> list = new ArrayList<>();
//		} ----> 이것도 사용 가능


