package member.model.vo;

import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class Member {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	private String email;
	
	
	public Member() {}
	public Member(String userId, String userPwd, String userName,
					int age,char gender, String email) {
		
		this.userId=userId;
		this.userPwd=userPwd;
		this.userName=userName;
		this.age=age;
		this.gender=gender;
		this.email=email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
