package com.kh.mybatis.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.model.vo.PageInfo;

public class BoardDao {

	public int selectListCount(SqlSession sqlSession) {
		
		return sqlSession.selectOne("boardMapper.selectListCount");
	}
	
	
	public ArrayList<Board> selectList(SqlSession sqlSession, PageInfo pi){
		
		// 마이바티스에서는 페이징처리를 위해 RowBounds라는 클래스를 제공한다.
		// offset, limit
		/*
		 * ex) boardLimit을 5라고 정해놨음
		 * 
		 * offset : 몇 개의 게시글을 건너 뛰고 조회할건지
		 * 
		 * 									offset(건너뛸숫자)		limit(조회할 숫자)
		 * currentPage : 1 => 1 ~ 5			0					5	
		 * currentPage : 2 => 6 ~ 10		5					5
		 * currentPage : 3 => 11 ~ 15		10					5
		 */

		int limit = pi.getBoardLimit();
		int offset = (pi.getCurrentPage() -1) * limit;
		
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		// RowBounds 객체를 넘겨야 할 경우
		// selectList메소드의 오버라이딩된 형태 중 매개변수가 3개인 메소드를 사용해야만 하기 때문에
		// 딱히 두번째 매개변수 자리에 넘길값이 없다면 null을 작성하면 됌
		return (ArrayList)sqlSession.selectList("boardMapper.selectList", null, rowBounds);
	}
	
	public int increaseCount(SqlSession sqlSession, int boardNo) {
		return sqlSession.update("boardMapper.increaseCount", boardNo);
	}
	
	
	public Board selectBoard(SqlSession sqlSession, int boardNo) {
		return sqlSession.selectOne("boardMapper.selectBoard", boardNo);
	}
	
	
	public ArrayList<Reply> selectReplyList(SqlSession sqlSession, int boardNo){
		return (ArrayList)sqlSession.selectList("boardMapper.selectReplyList", boardNo);
	}
	
	
	public int selectSearchCount(SqlSession sqlSession, HashMap<String, String> map) {
		return sqlSession.selectOne("boardMapper.selectSearchCount", map);
	}
	
	
	public ArrayList<Board> selectSearchList(SqlSession sqlSession, HashMap<String, String> map, PageInfo pi){
		int limit = pi.getBoardLimit();
		int offset = (pi.getCurrentPage() - 1) * limit;
		
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		return (ArrayList)sqlSession.selectList("boardMapper.selectSearchList", map, rowBounds);
	}
	
	
	
	
	
	
	
	
	
}
