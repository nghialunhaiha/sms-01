package org.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.sms.core.domain.BaseDomain;
@Entity
@Table(name = "std_personal")
public class STDPersonal extends BaseDomain {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7787818710007017935L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "std_code", nullable = false)
	@Length(max = 12)
	@Pattern(regexp = "[0-9]*")
	@NotBlank
	private String stdCode;

	@Column(name = "first_name", nullable = false)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z]*")
	@NotBlank
	private String firstName;

	@Column(name = "name", nullable = false)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z]*")
	@NotBlank
	private String name;

	@Column(name = "class_code", nullable = false)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z]*")
	@NotBlank
	private String classCode;

	@Column(name = "pwd", nullable = false)
	@Length(max = 10)
	@NotBlank
	private String pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


}
