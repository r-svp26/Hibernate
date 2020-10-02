package org.jsp.One2OneApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passport_Details")
/* PARRENT CLASS */
public class Passport {

	@Id
	@GeneratedValue
	private int passportid;
	private String passportname;

	public int getPassportid() {
		return passportid;
	}

	public void setPassportid(int passportid) {
		this.passportid = passportid;
	}

	public String getPassportname() {
		return passportname;
	}

	public void setPassportname(String passportname) {
		this.passportname = passportname;
	}

}
