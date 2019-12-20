package kr.pe.myblog.front.dto;


public class FrontinfoVO {
	
	private int front_no;
	private String front_title;
	private String front_content;
	private String front_link;
	private String front_icon;
	
	//<typeAlias type="kr.pe.myblog.front.dto.FrontinfoVO" alias="frontinfoVO"/>
	//vo 추가시 수정할 부분
	public int getFront_no() {
		return front_no;
	}
	public void setFront_no(int front_no) {
		this.front_no = front_no;
	}
	public String getFront_title() {
		return front_title;
	}
	public void setFront_title(String front_title) {
		this.front_title = front_title;
	}
	public String getFront_content() {
		return front_content;
	}
	public void setFront_content(String front_content) {
		this.front_content = front_content;
	}
	public String getFront_link() {
		return front_link;
	}
	public void setFront_link(String front_link) {
		this.front_link = front_link;
	}
	public String getFront_icon() {
		return front_icon;
	}
	public void setFront_icon(String front_icon) {
		this.front_icon = front_icon;
	}
	

}
