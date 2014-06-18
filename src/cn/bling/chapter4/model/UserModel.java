package cn.bling.chapter4.model;

public class UserModel {
	private String username;
	private String password;
	private String city;
	
	private String realname;
	private WorkInfoModel workInfo;
	private SchoolInfoModel schoolInfo;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public WorkInfoModel getWorkInfo() {
		return workInfo;
	}
	public void setWorkInfo(WorkInfoModel workInfo) {
		this.workInfo = workInfo;
	}
	public SchoolInfoModel getSchoolInfo() {
		return schoolInfo;
	}
	public void setSchoolInfo(SchoolInfoModel schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	
	
}
