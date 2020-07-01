package com.boot.board;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDao extends JpaRepository<BoardDto, Integer> {
	public Page<BoardDto> findAll(Pageable pageable);
	public BoardDto findByMyno(int myno);
	
	@Transactional
	public void deleteByMyno(int myno);
	
	public List<BoardDto> findAllByOrderByMynoDesc();
}
