package com.boot.myblog2.board;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardDao extends JpaRepository<BoardDto, Integer> {
	public Page<BoardDto> findAll(Pageable pageable);
	public BoardDto findByMyno(int myno);
	
	@Transactional
	public void deleteByMyno(int myno);
	
	//@Query("SELECT p FROM mydb.myboard p ORDER BY p.myno DESC")
	//List<BoardDto> findAllDesc();
	
	public List<BoardDto> findAllByOrderByMynoDesc();
}
