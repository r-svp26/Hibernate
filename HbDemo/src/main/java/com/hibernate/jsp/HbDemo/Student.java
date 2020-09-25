package com.hibernate.jsp.HbDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Student {

	@Id
	private int id;
	@Column(name = "ename")
	private String name;
	/* @Transient <-- If we don't want to store. */
	private String loc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}

}
