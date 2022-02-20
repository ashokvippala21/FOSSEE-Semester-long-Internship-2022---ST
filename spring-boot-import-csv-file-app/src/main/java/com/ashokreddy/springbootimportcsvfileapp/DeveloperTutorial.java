package com.ashokreddy.springbootimportcsvfileapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "developer_tutorial")
public class DeveloperTutorial {

	  @Id
	  @Column(name = "phone")
	  private String phone; //A phone number should always be stored as a string or text and never an integer. Some phone numbers generally use hyphens and possibly parentheses. 
      //Phone number is a numeric value and contains digits only, so at first you might think of the long type to store it in, but the best data type to store it in is a String because it will ruin the formatting, remove preceding 0's, and other undesirable things.
	  @Column(name = "name")
	  private String name;

	  @Column(name = "email")
	  private String email;

	  public DeveloperTutorial() {

	  }

	  public DeveloperTutorial(String phone, String name, String  email) {
	    this.phone = phone;
	    this.name = name;
	    this.email = email;
	  }

	  public String getPhone() {
	    return phone;
	  }

	  public void setPhone(String phone) {
	    this.phone = phone;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  @Override
	  public String toString() {
	    return "Tutorial [Phone number=" + phone + ", Name=" + name + ", email=" + email + "]";
	  }
	}