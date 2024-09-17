package com.gls.winter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gls.winter.page.Pagination;
import com.gls.winter.page.Search;

@Service 
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDAO boardDAO;

	@Override
	public int insertBoard(BoardVO vo) {
		return boardDAO.insertBoard(vo);
	}

	@Override
	public int deleteBoard(int seq) {
		return boardDAO.deleteBoard(seq);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		return boardDAO.updateBoard(vo);
	}

	@Override
	public BoardVO getBoard(int seq) {
		return boardDAO.getBoard(seq);
	}

	@Override
	public List<BoardVO> getBoardList(Search search) {
		return boardDAO.getBoardList(search);
	}
	
	@Override
	public List<BoardVO> getBoardListFound(Pagination pagination) {
		return boardDAO.getBoardListFound(pagination);
	}
	
	@Override
	public List<BoardVO> getBoardListLost(Pagination pagination) {
		return boardDAO.getBoardListLost(pagination);
	}
	
	@Override
	public int getBoardListCnt(Search search) { // throws Exception {
		return boardDAO.getBoardListCnt(search);
	}
	
	@Override
	public int getBoardListFoundCnt() { // throws Exception {
		return boardDAO.getBoardListFoundCnt();
	}
	
	@Override
	public int getBoardListLostCnt() { // throws Exception {
		return boardDAO.getBoardListLostCnt();
	}

	

}
