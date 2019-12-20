package com.example.dao;

import java.util.List;

import com.example.dto.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> selectMember() throws Exception;

	public int selectMemberCnt() throws Exception;

	public String selectMemberName() throws Exception;

	public MemberVO selectMemberInfo(String id) throws Exception;
}
