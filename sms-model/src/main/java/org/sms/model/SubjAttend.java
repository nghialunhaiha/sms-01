package org.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.sms.core.domain.BaseDomain;
@Entity
@Table(name = "Subj_Attend")
public class SubjAttend extends BaseDomain {

	private static final long serialVersionUID = -6503302019066269521L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "subject_code", nullable = false)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 10, message = "maMon is out of length, Max is 10 chracters.")
	private String subjectCode;

	@Column(name = "subject_name", nullable = false)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 20)
	private String subjectName;

	@Column(name = "so_tin_chi", nullable = false)
	@NotNull
	private int soTinChi;

	@Column(name = "khoa_code", nullable = false)
	@ForeignKey(name = "khoa_code")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 10)
	private String khoaCode;

	@Column(name = "teacher_code", nullable = false)
	@ForeignKey(name = "teacher_code")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9-_]*")
	@Length(max = 10)
	private String teacherCode;

	@Column(name = "room_code", nullable = false)
	@ForeignKey(name = "room_code")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9-]*")
	@Length(max = 10)
	private String roomCode;

	@Column(name = "ma_hoc_ky", nullable = false)
	@ForeignKey(name = "ma_hoc_ky")
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9_-]*")
	@Length(max = 10)
	private String maHocKy;

	@Column(name = "subj_group", nullable = false)
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]*")
	@Length(max = 20)
	private String subjectGroup;

}
