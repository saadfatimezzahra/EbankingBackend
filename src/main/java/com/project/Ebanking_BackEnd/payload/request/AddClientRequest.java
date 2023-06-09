package com.project.Ebanking_BackEnd.payload.request;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AddClientRequest {
		@NotBlank
	    @Size(max = 50)
	    @Email
	    private String email;
	    
	    
	    @NotBlank
	    @Size(min = 3, max = 30)
	    private String firstname,lastname;
	    
	    CharSequence password;

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	String balance ;
	    Date dateOfBirth;
	    private String phone,address,confirmationEmail,pieceIdentity,n_pieceIdentity;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public CharSequence getPassword() {
			return password;
		}
		public void setPassword(CharSequence password) {
			this.password = password;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getConfirmationEmail() {
			return confirmationEmail;
		}
		public void setConfirmationEmail(String confirmationEmail) {
			this.confirmationEmail = confirmationEmail;
		}
		public String getPieceIdentity() {
			return pieceIdentity;
		}
		public void setPieceIdentity(String pieceIdentity) {
			this.pieceIdentity = pieceIdentity;
		}
		public String getN_pieceIdentity() {
			return n_pieceIdentity;
		}
		public void setN_pieceIdentity(String n_pieceIdentity) {
			this.n_pieceIdentity = n_pieceIdentity;
		}
		public AddClientRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AddClientRequest(@NotBlank @Size(max = 50) @Email String email,
				@NotBlank @Size(min = 3, max = 30) String firstname, @NotBlank @Size(min = 3, max = 30) String lastname,
				CharSequence password, Date dateOfBirth, String phone, String address, String confirmationEmail,
				String pieceIdentity, String n_pieceIdentity) {
			super();
			this.email = email;
			this.firstname = firstname;
			this.lastname = lastname;
			this.password = password;
			this.dateOfBirth = dateOfBirth;
			this.phone = phone;
			this.address = address;
			this.confirmationEmail = confirmationEmail;
			this.pieceIdentity = pieceIdentity;
			this.n_pieceIdentity = n_pieceIdentity;
		}
		
	   
		

}
