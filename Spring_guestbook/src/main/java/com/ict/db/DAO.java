package com.ict.db;

import org.mybatis.spring.SqlSessionTemplate;

// DB처리하는 메서드들을 가지고 있는 클래스

public class DAO {
	// 실제 사용하는 클래스 : SqlSessionTemplate
	// jsp에서 사용한 SqlSession과 사용법 같다
	private SqlSessionTemplate session;

	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	

	
}













