package com.mybatis.dao;

import java.util.List;

import com.mybatis.vo.QnA;

public interface QnADAO {
	public List<QnA> selectAll();
	public QnA selectOne(String num);
	public void insert(QnA c);
	public void delete(String num);
	public void update(QnA c);
	public List<QnA> findByTitle(String title);
	public List<QnA> findByID(String Name);
	public int login(String id, String pw);
	public void ansUpdate(String num, String answer);
}
