package kr.pe.myblog.team.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.pe.myblog.front.dto.FrontinfoVO;
import kr.pe.myblog.team.dto.TeamVO;
@Repository
public class TeamDAOImpl implements TeamDAO {
	
	//SQLSession 추가 후 @Inject 어노테이션 추가 필요
	//teamMapper.xml 생성 필요
		@Inject
		private SqlSession sqlSession;
		
		private static final String Namespace = "kr.pe.myblog.mappers.teamMapper";

		@Override
		public List<TeamVO> selectteam() throws Exception {
			// TODO Auto-generated method stub
			return sqlSession.selectList(Namespace+".selectteam");
		}

	}


