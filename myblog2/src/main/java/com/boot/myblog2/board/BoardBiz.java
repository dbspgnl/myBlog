package com.boot.myblog2.board;

import java.text.Collator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardBiz {
	private final BoardDao dao;

	@Transactional
	public List<BoardDto> findAllDesc(){
		return null;
	}
	
}