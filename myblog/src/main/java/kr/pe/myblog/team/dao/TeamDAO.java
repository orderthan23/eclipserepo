package kr.pe.myblog.team.dao;

import java.util.List;

import kr.pe.myblog.team.dto.TeamVO;


//DAO 추가 : DAO 인터페이스를 생성한 후 root-contex.xml 의 
//<context:component-scan base-package="kr.pe.myblog.team.dao"></context:component-scan>
//추가 필요함
public interface TeamDAO {

	List<TeamVO> selectteam() throws Exception;
}
