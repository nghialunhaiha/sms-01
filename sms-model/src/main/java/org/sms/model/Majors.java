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
@Table(name = "majors")
public class Majors extends BaseDomain {
	private static final long serialVersionUID = 2427085655434865845L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "majors", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 15)
	private String majors;

	@Column(name = "majors_name", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 25)
	private String majorsName;

	@Column(name = "class_code", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 15)
	private String classCode;

	@Column(name = "schoole_year", nullable = false, length = 05)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 10)
	private String schoolYear;

	@Column(name = "schoole_year_alias", nullable = false, length = 20)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 20)
	private String schoolYearAlias;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getMajorsName() {
		return majorsName;
	}

	public void setMajorsName(String majorsName) {
		this.majorsName = majorsName;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(String schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getSchoolYearAlias() {
		return schoolYearAlias;
	}

	public void setSchoolYearAlias(String schoolYearAlias) {
		this.schoolYearAlias = schoolYearAlias;
	}

}
