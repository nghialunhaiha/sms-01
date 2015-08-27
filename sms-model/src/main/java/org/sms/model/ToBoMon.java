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
@Table(name = "to_bo_mon")
public class ToBoMon extends BaseDomain {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7344284086724472885L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "ma_to_bo_mon", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String maToBoMon;

	@Column(name = "teacher_code", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String teacherCode;

	@Column(name = "subj_code", nullable = false, length = 10)
	@Length(max = 10)
	@Pattern(regexp = "[a-zA-Z0-9]")
	@NotBlank
	private String subjCode;

	@Column(name = "truong_bo_mon", length = 10, columnDefinition = "tinyint default false")
	private boolean truongBoMon;

	@Column(name = "pho_bo_mon", length = 10, columnDefinition = "tinyint default false")
	private boolean phoBoMon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaToBoMon() {
		return maToBoMon;
	}

	public void setMaToBoMon(String maToBoMon) {
		this.maToBoMon = maToBoMon;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public boolean isTruongBoMon() {
		return truongBoMon;
	}

	public void setTruongBoMon(boolean truongBoMon) {
		this.truongBoMon = truongBoMon;
	}

	public boolean isPhoBoMon() {
		return phoBoMon;
	}

	public void setPhoBoMon(boolean phoBoMon) {
		this.phoBoMon = phoBoMon;
	}

	public String getSubjCode() {
		return subjCode;
	}

	public void setSubjCode(String subjCode) {
		this.subjCode = subjCode;
	}

}
