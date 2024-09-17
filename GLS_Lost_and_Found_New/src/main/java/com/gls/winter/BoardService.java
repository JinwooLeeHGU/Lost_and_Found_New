package com.gls.winter;

import java.util.List;

import com.gls.winter.page.Pagination;
import com.gls.winter.page.Search;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public int deleteBoard(int seq);
	public int updateBoard(BoardVO vo);
	public BoardVO getBoard(int seq);
	public List<BoardVO> getBoardList(Search search);
	public List<BoardVO> getBoardListFound(Pagination pagination);
	public List<BoardVO> getBoardListLost(Pagination pagination);
	public int getBoardListCnt(Search search); // throws Exception; // 총 게시글 개수 확인
	public int getBoardListFoundCnt(); // throws Exception; // 총 Found 게시글 개수 확인
	public int getBoardListLostCnt(); // throws Exception; // 총 Lost 게시글 개수 확인

}
