package com.kh.mybatis.common.template;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	
	/*
	 * 기존 JDBC
	 * 
	 * public static Connection getConnection(){
	 * 		drver.properties파일 읽어들여서
	 * 		해당 DB와 접속된 Connection 객체를 생성해서 리턴
	 * }
	 * 
	 * public static void close(JDBC용객체){
	 * 	전달받은 JDBC용 객체를 반남시키기위해서 조건문을 통해 예외처리를
	 * }
	 * 
	 * public static void commit/rollback(Connection 객체){
	 *  트랜잭션처리
	 * }
	 * 
	 */
	
	
	// 마이바티스 
	public static SqlSession getSqlSession() {
		
		// mybatis-config.xml파일을 읽어들여서
		// 해당 DB와 접속된 SqlSession객체를 생성해서 반환
		SqlSession sqlSession = null;
		
		// SqlSession 객체를 생성하기 위해서는 SqlSessionFactory 객체가 필요
		// SqlSessionFactory객체를 생성하기 위해서는 SqlSessionFactoryBuilder 객체가 필요
		
		String resource = "/mybatis-config.xml";
		
		try {
			InputStream stream = Resources.getResourceAsStream(resource); // 자원으로부터 통로를 얻어내겠다!
			
			// 1단계 ) new SqlSessionFactoryBuilder() : SqlSessionFactoryBuilder 객체 생성
			// 2단계 ) .build(stream) : 통로로부터 mybatis-config.xml파일을 읽어들여서 SqlSessionFactory객체를 생성
			// 3단계 ) .openSession() : SqlSession 객체 생성
			
			sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSession;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
