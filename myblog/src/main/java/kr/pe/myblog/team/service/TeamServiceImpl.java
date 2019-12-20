package kr.pe.myblog.team.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.pe.myblog.team.dao.TeamDAO;
import kr.pe.myblog.team.dto.TeamVO;
@Service

public class TeamServiceImpl implements TeamService {

	//DAO 추가 후 @Inject 어노테이션 추가 필요
		@Inject
		private TeamDAO dao;
	@Override
	public List<TeamVO> selectteam() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectteam();
	}

}
