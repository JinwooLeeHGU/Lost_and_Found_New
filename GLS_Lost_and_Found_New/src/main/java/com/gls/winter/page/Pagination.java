package com.gls.winter.page;

// import org.springframework.stereotype.Repository;

// @Repository
public class Pagination {
	
	
	private int listSize = 8;   // 초기값으로 목록개수를 10으로 셋팅  (한 페이지 당 보여질 게시물개수) 
	private int rangeSize = 5;  // 초기값으로 페이지범위를 10으로 셋팅 
	private int page;        // 현재 목록의 페이지 번호
	private int range;       // 화면에 보이는 페이지의 범위의 시작 번호
	private int listCnt;     // 전체 게시물의 개수
	private int pageCnt;     // 전체 페이지 범위의 개수
	private int startPage;   // 범위 내 시작 페이지
	private int startList;   // 게시판 시작 번호
	private int endPage;     // 범위 내 끝 페이지 
	private int lost;        // 1 - found / 0 - lost
	private boolean prev;    // 이전 페이지
	private boolean next;    // 다음 페이지

	public int getRangeSize() {
		return rangeSize;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	
	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}
	
	public int getStartList() {
		return startList;
	}

	public void pageInfo(int page, int range, int listCnt, int lost) {
		this.page = page;         // 현재 페이지의 정보 
		this.range = range;       // 현재 페이지 범위 정보
		this.listCnt = listCnt;   // 게시물의 총 개수
		this.lost = lost;
		
		//전체 페이지수 
		// this.pageCnt = (int) Math.ceil(listCnt/listSize);
		this.pageCnt = (int)Math.ceil((double)listCnt/listSize);

		
		//시작 페이지
		this.startPage = (range - 1) * rangeSize + 1 ;
		
		//끝 페이지  / 마지막 페이지의 번호를 구하는 이유는 다음에 나올 [다음] 버튼의 활성화 여부를 판단하기 위해서
		this.endPage = range * rangeSize;
	
		//게시판 시작번호  / 현재 MySQL을 이용해 원하는 목록을 가져 오기 위해서
		this.startList = (page - 1) * listSize;		

		//이전 버튼 상태
		this.prev = range == 1 ? false : true;
		
		//다음 버튼 상태
		this.next = endPage > pageCnt ? false : true;
		if (this.endPage > this.pageCnt) {
			this.endPage = this.pageCnt;
			this.next = false;
		}
	}

	
//	private int pageSize = 10;  /** 한 페이지당 게시글 수 **/
//	private int rangeSize = 10; /** 한 블럭(range)당 페이지 수 **/
//	private int curPage = 1;    /** 현재 페이지 **/
//	private int curRange = 1;   /** 현재 블럭(range) **/
//	private int listCnt;        /** 총 게시글 수 **/
//	private int pageCnt;        /** 총 페이지 수 **/
//	private int rangeCnt;       /** 총 블럭(range) 수 **/	
//	private int startPage = 1;  /** 시작 페이지 **/
//	private int endPage = 1;    /** 끝 페이지 **/	
//	private int startIndex = 0; /** 시작 index **/
//	private int prevPage;       /** 이전 페이지 **/
//	private int nextPage;       /** 다음 페이지 **/
//	
//	public int getPageSize() {
//		return pageSize;
//	}
//	public void setPageSize(int pageSize) {
//		this.pageSize = pageSize;
//	}
//	public int getRangeSize() {
//		return rangeSize;
//	}
//	public void setRangeSize(int rangeSize) {
//		this.rangeSize = rangeSize;
//	}
//	public int getCurPage() {
//		return curPage;
//	}
//	public void setCurPage(int curPage) {
//		this.curPage = curPage;
//	}
//	public int getCurRange() {
//		return curRange;
//	}
//	public void setCurRange(int curRange) {
//		this.curRange = curRange;
//	}
//	public int getListCnt() {
//		return listCnt;
//	}
//	public void setListCnt(int listCnt) {
//		this.listCnt = listCnt;
//	}
//	public int getPageCnt() {
//		return pageCnt;
//	}
//	public void setPageCnt(int pageCnt) {
//		this.pageCnt = pageCnt;
//	}
//	public int getRangeCnt() {
//		return rangeCnt;
//	}
//	public void setRangeCnt(int rangeCnt) {
//		this.rangeCnt = rangeCnt;
//	}
//	public int getStartPage() {
//		return startPage;
//	}
//	public void setStartPage(int startPage) {
//		this.startPage = startPage;
//	}
//	public int getEndPage() {
//		return endPage;
//	}
//	public void setEndPage(int endPage) {
//		this.endPage = endPage;
//	}
//	public int getStartIndex() {
//		return startIndex;
//	}
//	public void setStartIndex(int startIndex) {
//		this.startIndex = startIndex;
//	}
//	public int getPrevPage() {
//		return prevPage;
//	}
//	public void setPrevPage(int prevPage) {
//		this.prevPage = prevPage;
//	}
//	public int getNextPage() {
//		return nextPage;
//	}
//	public void setNextPage(int nextPage) {
//		this.nextPage = nextPage;
//	}
	
	
}
