package com.petboard.controller;

import org.springframework.stereotype.Controller;

import com.petboard.service.BoardService;

@Controller
public class HospitalController {
	
	private BoardService boardService;
	public HospitalController(BoardService boardService) {
		this.boardService = boardService;
	}

}
