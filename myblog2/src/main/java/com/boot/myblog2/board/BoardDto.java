package com.boot.myblog2.board;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="myboard")
public class BoardDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int myno;
	@Column
	private String myname;
	@Column
	private String mytitle;
	@Column
	private String mycontent;
	@Column
	@Temporal(TemporalType.DATE)
	private Date mydate;
	
	@Builder
	public BoardDto(String myname, String mytitle, String mycontent) {
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
	}
	
	public void update(String mytitle, String mycontent) {
		this.mytitle = mytitle;
		this.mycontent = mycontent;
	}
	
}
