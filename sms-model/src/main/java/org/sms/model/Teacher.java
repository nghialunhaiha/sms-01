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
@Table(name = "teacher")
public class Teacher  extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2181775531554815037L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "teacher_code", nullable = false, length = 10)
	@NotBlank
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9_]")
	private String teacherCode;

	@Column(name = "teacher_alias", nullable = false, length = 20)
	@NotBlank
	@Length(max = 20)
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String teacherAlias;

	@Column(name = "sbject_Code", nullable = false, length = 15)
	@NotBlank
	@Length(max = 15)
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String sbjectCode;

	@Column(name = "main_Teacher", nullable = false, length = 20)
	@NotBlank
	@Length(max = 20)
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String mainTeacher;

	@Column(name = "email", nullable = false, length = 100)
	@NotBlank
	@Length(max = 100)
	@Pattern(regexp = "[a-zA-Z0-9@._-]")
	private String email;

	@Column(name = "gender", nullable = false, columnDefinition = "tinyint default false")
	@NotBlank
	private boolean gender;

	@Column(name = "password", nullable = false, length = 18)
	@NotBlank
	@Length(max = 18)
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String password;

	@Column(name = "iCC", nullable = false, length = 15)
	@NotBlank
	@Length(max = 15)
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String iCC;//independenceClassCode.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public String getTeacherAlias() {
		return teacherAlias;
	}

	public void setTeacherAlias(String teacherAlias) {
		this.teacherAlias = teacherAlias;
	}

	public String getSbjectCode() {
		return sbjectCode;
	}

	public void setSbjectCode(String sbjectCode) {
		this.sbjectCode = sbjectCode;
	}

	public String getMainTeacher() {
		return mainTeacher;
	}

	public void setMainTeacher(String mainTeacher) {
		this.mainTeacher = mainTeacher;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getiCC() {
		return iCC;
	}

	public void setiCC(String iCC) {
		this.iCC = iCC;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherCode=" + teacherCode + ", teacherAlias=" + teacherAlias + ", sbjectCode=" + sbjectCode
				+ ", mainTeacher=" + mainTeacher + ", email=" + email + ", gender=" + gender + ", password=" + password + ", iCC=" + iCC
				+ "]";
	}

}
