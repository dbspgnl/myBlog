package com.boot.board;

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
	@Column(name="myno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int myno;
	@Column(name="myname")
	private String myname;
	@Column(name="mytitle")
	private String mytitle;
	@Column(name="mycontent")
	private String mycontent;
	@Column(name="mydate")
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
