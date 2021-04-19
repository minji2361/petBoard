package com.petboard.controller;

import org.springframework.stereotype.Controller;

import com.petboard.service.BoardService;

@Controller
public class MainController {
	
	private BoardService boardService;
	public MainController(BoardService boardService) {
		this.boardService = boardService;
	}

}
