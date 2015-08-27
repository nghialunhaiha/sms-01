package org.sms.model;
import org.sms.core.domain.BaseDomain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "std_contact")
public class STDContact  extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2507939717488541215L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "std_code", nullable = false)
	@Pattern(regexp = "[0-9]*")
	@Length(max = 10)
	@NotBlank
	private String stdCode;

	@Column(name = "whereabouts", nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 10)
	@NotBlank
	private String whereabouts;

	@Column(name = "permanent_address", nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 10)
	@NotBlank
	private String permanentAddress;

	@Column(name = "live_place", nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 10)
	@NotBlank
	private String livePlace;

	@Column(name = "id_No", nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 10)
	@NotBlank
	private String idNo;

	@Column(name = "mobile", nullable = false)
	@Pattern(regexp = "[0-9+ ]*")
	@Length(max = 15)
	@NotBlank
	private String mobile;

	@Column(name = "email", nullable = false)
	@Pattern(regexp = "[a-zA-Z0-9@_-.]*")
	@Length(max = 100)
	@NotBlank
	private String email;

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

	public String getWhereabouts() {
		return whereabouts;
	}

	public void setWhereabouts(String whereabouts) {
		this.whereabouts = whereabouts;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getLivePlace() {
		return livePlace;
	}

	public void setLivePlace(String livePlace) {
		this.livePlace = livePlace;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
