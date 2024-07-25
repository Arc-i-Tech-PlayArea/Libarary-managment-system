package com.arch_i_tech.dto;

public class AdministratorDTO {

	 private String AdministratorName;
	 private String Email;
	 private String Role;
	 private String Password;
	public String getAdministratorName() {
		return AdministratorName;
	}
	public void setAdministratorName(String administratorName) {
		AdministratorName = administratorName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public AdministratorDTO(String administratorName, String email, String role, String password) {
		super();
		AdministratorName = administratorName;
		Email = email;
		Role = role;
		Password = password;
	}
	public AdministratorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdministratorDTO [AdministratorName=" + AdministratorName + ", Email=" + Email + ", Role=" + Role
				+ ", Password=" + Password + "]";
	}
	 
	 
	 
}
