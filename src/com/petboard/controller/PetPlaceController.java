package com.petboard.controller;

import org.springframework.stereotype.Controller;

import com.petboard.service.BoardService;

@Controller
public class PetPlaceController {
	
	private BoardService boardService;
	public PetPlaceController(BoardService boardService) {
		this.boardService = boardService;
	}

}
