package org.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.sms.core.domain.BaseDomain;
@Entity
@Table(name = "PInfo_ResultSubject")
public class PInfoResultSubject extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3330963076121208842L;

	@Id
	@Column(name = "resultId")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9_-]")
	@Length(max = 15)
	private String resultId;

	@Column(name = "subject_code", length = 10, nullable = false)
	@Length(max = 10)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9_-]")
	private String subjectCode;

	@Column(name = "std_code", length = 10, nullable = false)
	@Length(max = 10)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String stdCode;

	@Column(name = "ma_lop_doc_lap", length = 15, nullable = false)
	@Length(max = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String maLopDocLap;

	@Column(name = "sbd", length = 10, nullable = false)
	@Length(max = 10)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	private String SBD;

	public String getResultId() {
		return resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}

	public String getMaLopDocLap() {
		return maLopDocLap;
	}

	public void setMaLopDocLap(String maLopDocLap) {
		this.maLopDocLap = maLopDocLap;
	}

	public String getSBD() {
		return SBD;
	}

	public void setSBD(String sBD) {
		SBD = sBD;
	}
	
	
	
	
	
}
