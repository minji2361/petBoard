package com.petboard.controller;

import org.springframework.stereotype.Controller;

import com.petboard.service.BoardService;

@Controller
public class LostPetController {
	
	private BoardService boardService;
	public LostPetController(BoardService boardService) {
		this.boardService = boardService;
	}

}
