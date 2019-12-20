package kr.pe.myblog.team.dto;

public class TeamVO {
	
	private String team_name;//이름
	private String team_position;//직위
	private String team_pic;//사진
	private String regdate;//입사일
	private String deldate;//퇴사일
	//<typeAlias type="kr.pe.myblog.team.dto.TeamVO" alias="teamVO"/>
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getTeam_position() {
		return team_position;
	}
	public void setTeam_position(String team_position) {
		this.team_position = team_position;
	}
	public String getTeam_pic() {
		return team_pic;
	}
	public void setTeam_pic(String team_pic) {
		this.team_pic = team_pic;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getDeldate() {
		return deldate;
	}
	public void setDeldate(String deldate) {
		this.deldate = deldate;
	}
	
	
	
	
	

}
