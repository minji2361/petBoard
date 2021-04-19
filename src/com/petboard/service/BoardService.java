package com.petboard.service;

import org.springframework.stereotype.Service;

import com.petboard.repository.BoardDao;

@Service
public class BoardService {
	
	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

}
