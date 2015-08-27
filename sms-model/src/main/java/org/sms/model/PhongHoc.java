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
@Table(name = "phong_hoc")

public class PhongHoc extends BaseDomain {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7433035590494074329L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "room_code", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 15)
	private String roomCode;

	@Column(name = "ma_lop_doc_lap", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 15)
	private String maLopDocLap;

	@Column(name = "room_alias", nullable = false, length = 10)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 10)
	private String roomAlias;

	@Column(name = "learning_time", nullable = false)
	@NotBlank
	private Date learningTime;

	@Column(name = "place", nullable = false, length = 15)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]")
	@Length(max = 15)
	private String place;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaLopDocLap() {
		return maLopDocLap;
	}

	public void setMaLopDocLap(String maLopDocLap) {
		this.maLopDocLap = maLopDocLap;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getRoomAlias() {
		return roomAlias;
	}

	public void setRoomAlias(String roomAlias) {
		this.roomAlias = roomAlias;
	}

	public Date getLearningTime() {
		return learningTime;
	}

	public void setLearningTime(Date learningTime) {
		this.learningTime = learningTime;
	}

}
