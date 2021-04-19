package com.petboard.controller;

import org.springframework.stereotype.Controller;

import com.petboard.service.BoardService;

@Controller
public class PetChatController {
	
	private BoardService boardService;
	public PetChatController(BoardService boardService) {
		this.boardService = boardService;
	}

}
