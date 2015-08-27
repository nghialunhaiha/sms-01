package org.sms.model;

import java.util.Date;

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
@Table(name = "testing_info")
public class TestingInfo  extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3620309688128810515L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "testing_date", nullable = false)
	@NotBlank
	private Date testingDate;

	@Column(name = "testing_room", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String testingRoom;

	@Column(name = "subj_code", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String subjCode;

	@Column(name = "iCC", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String iCC;

	@Column(name = "testing_time", nullable = false, length = 10)
	@NotBlank
	private Date testingTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTestingDate() {
		return testingDate;
	}

	public void setTestingDate(Date testingDate) {
		this.testingDate = testingDate;
	}

	public String getTestingRoom() {
		return testingRoom;
	}

	public void setTestingRoom(String testingRoom) {
		this.testingRoom = testingRoom;
	}

	public String getSubjCode() {
		return subjCode;
	}

	public void setSubjCode(String subjCode) {
		this.subjCode = subjCode;
	}

	public String getiCC() {
		return iCC;
	}

	public void setiCC(String iCC) {
		this.iCC = iCC;
	}

	public Date getTestingTime() {
		return testingTime;
	}

	public void setTestingTime(Date testingTime) {
		this.testingTime = testingTime;
	}

}
