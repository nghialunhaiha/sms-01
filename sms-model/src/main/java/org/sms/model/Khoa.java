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
@Table(name = "khoa")
public class Khoa extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1164735545795018804L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "khoa_code", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String khoaCode;

	@Column(name = "majors_code", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String majorsCode;

	@Column(name = "khoa_alias", nullable = false, length = 10)
	@Length(max = 30)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String khoaAlias;

	@Column(name = "teacher_Code", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String teacherCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKhoaCode() {
		return khoaCode;
	}

	public void setKhoaCode(String khoaCode) {
		this.khoaCode = khoaCode;
	}

	public String getMajorsCode() {
		return majorsCode;
	}

	public void setMajorsCode(String majorsCode) {
		this.majorsCode = majorsCode;
	}

	public String getKhoaAlias() {
		return khoaAlias;
	}

	public void setKhoaAlias(String khoaAlias) {
		this.khoaAlias = khoaAlias;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

}
