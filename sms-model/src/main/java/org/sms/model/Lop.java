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
@Table(name = "lop")
public class Lop extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3831803874767577418L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "class_Code", nullable = false)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 10)
	private String classCode;

	@Column(name = "lop_alias", nullable = false)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 10)
	private String lopAlias;

	@Column(name = "std_code", nullable = false)
	@NotBlank
	@Pattern(regexp = "[0-9]")
	@Length(max = 10)
	private String stdCode;

	@Column(name = "ma_lop_truong", nullable = false)
	@NotBlank
	@Pattern(regexp = "[0-9]")
	@Length(max = 10)
	private String maLopTruong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getLopAlias() {
		return lopAlias;
	}

	public void setLopAlias(String lopAlias) {
		this.lopAlias = lopAlias;
	}

	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}

	public String getMaLopTruong() {
		return maLopTruong;
	}

	public void setMaLopTruong(String maLopTruong) {
		this.maLopTruong = maLopTruong;
	}

}
