package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {
	
	public int insertMember(SqlSession sqlSession, Member m) {
		
		/*
		 * sqlSession에서 제공하는 메서드를 통해서 sql문을 찾아서 실행하고 결과도 바로 받아볼 수 있다.
		 * 
		 * sqlSession.SQL문 종류에 맞는 메서드("mapper파일의 namespace.해당sql문의id", sql문을 완성시킬 객체);(select문빼고)
		 * 
		 */
		
		//int result = sqlSession.insert("memberMapper.insertMember", m);
		// return result; 
		// 두번 쓸 필요 없어서
		return sqlSession.insert("memberMapper.insertMember", m);
	}
	
	
	public Member loginMember(SqlSession sqlSession, Member m) {
		
		// selectOne() : 조회결과가 없다면 null을 반환
		return sqlSession.selectOne("memberMapper.loginMember", m);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
