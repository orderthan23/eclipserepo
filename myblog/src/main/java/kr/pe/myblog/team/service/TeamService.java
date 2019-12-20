package kr.pe.myblog.team.service;

import java.util.List;

import kr.pe.myblog.team.dto.TeamVO;



public interface TeamService {
	
	public List<TeamVO> selectteam() throws Exception;

}
