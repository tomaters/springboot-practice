package com.zeus.service;

import java.util.ArrayList;
import java.util.List;

import com.zeus.domain.Board;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class BoardService {
	
	private List<Board> boardList;
	
	public BoardService() {
		boardList = new ArrayList<>();
	}
	
	public void create(Board board) {
		boardList.add(board);
		log.info("create(Board board) = " + board);
	}
	
	public void readByBoardNo(Integer boardNo) {
		Board board = null;
		for(Board data : boardList) {
			if(data.getBoardNo() == boardNo) {
				board = data;
				break;
			}
		} log.info("board: " + board.toString());
	}
	
	public void delete(Board board) {
		boardList.remove(board);
		log.info("delete(Board board): " + board.toString());
	}
}
