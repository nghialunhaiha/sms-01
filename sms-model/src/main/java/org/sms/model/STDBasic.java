package org.sms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.sms.core.domain.BaseDomain;
@Entity
@Table(name = "std_basic")
public class STDBasic extends BaseDomain {

	private static final long serialVersionUID = -1048343570893683998L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "std_code", nullable = false)
	@Length(max = 12)
	@Pattern(regexp = "[0-9]*")
	@NotBlank
	private String stdCode;

	@Column(name = "birth_Day", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@NotBlank
	private Date birthDay;

	@Column(name = "gender", nullable = false, columnDefinition = "tinyint default false")
	@NotBlank
	private boolean gender;

	@Column(name = "born_place", nullable = false)
	@Length(min = 1, max = 50)
	@Pattern(regexp = "[a-zA-Z0-9 ]*")
	@NotBlank
	private String bornPlace;

	@Column(name = "province", nullable = false)
	@Length(min = 1, max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@NotBlank
	private String province;

	@Column(name = "district", nullable = false)
	@Length(min = 1, max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@NotBlank
	private String district;

	@Column(name = "commune", nullable = false)
	@Length(min = 1, max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@NotBlank
	private String commune;

	@Column(name = "house_number", nullable = false)
	@Length(min = 1, max = 5)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@NotBlank
	private String houseNo;

	@Column(name = "ethnic", nullable = false)
	@Length(min = 1, max = 7)
	@Pattern(regexp = "[a-zA-Z0-9 ]*")
	@NotBlank
	private String ethnic;

	@Column(name = "religion", nullable = false)
	@Length(min = 1, max = 20)
	@Pattern(regexp = "[a-zA-Z0-9 ]*")
	@NotBlank
	private String religion;

	@Column(name = "tpxt")
	@Length(min = 1, max = 30)
	@Pattern(regexp = "[a-zA-Z0-9 ]*")
	private String TPXT;

	@Column(name = "dtut")
	@Length(min = 1, max = 30)
	@Pattern(regexp = "[a-zA-Z ]*")
	private String DTUT;

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

	public String getBornPlace() {
		return bornPlace;
	}

	public void setBornPlace(String bornPlace) {
		this.bornPlace = bornPlace;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getTPXT() {
		return TPXT;
	}

	public void setTPXT(String tPXT) {
		TPXT = tPXT;
	}

	public String getDTUT() {
		return DTUT;
	}

	public void setDTUT(String dTUT) {
		DTUT = dTUT;
	}

}
