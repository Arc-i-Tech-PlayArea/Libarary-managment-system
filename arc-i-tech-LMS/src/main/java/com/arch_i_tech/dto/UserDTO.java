package com.arch_i_tech.dto;
public class UserDTO {
	
	 private String UserFullName;
	 private String Email;
	 private String Contact;
	 private String AdharCardNumber;
	 private String Address;
	 private String Education;
	 private String Password;
	public String getUserFullName() {
		return UserFullName;
	}
	public void setUserFullName(String userFullName) {
		UserFullName = userFullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getAdharCardNumber() {
		return AdharCardNumber;
	}
	public void setAdharCardNumber(String adharCardNumber) {
		AdharCardNumber = adharCardNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
	public UserDTO(String userFullName, String email, String contact, String adharCardNumber, String address,
			String education, String password) {
		super();
		UserFullName = userFullName;
		Email = email;
		Contact = contact;
		AdharCardNumber = adharCardNumber;
		Address = address;
		Education = education;
		Password = password;
	}
	
	public UserDTO()
	{

	}
	@Override
	public String toString() {
		return "UserDTO [UserFullName=" + UserFullName + ", Email=" + Email + ", Contact=" + Contact
				+ ", AdharCardNumber=" + AdharCardNumber + ", Address=" + Address + ", Education=" + Education
				+ ", Password=" + Password + "]";
	}
	 

}
