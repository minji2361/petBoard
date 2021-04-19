package com.petboard.controller;

import org.springframework.stereotype.Controller;

import com.petboard.service.BoardService;

@Controller
public class ItemBoardController {
	
	private BoardService boardService;
	public ItemBoardController(BoardService boardService) {
		this.boardService = boardService;
	}

}
