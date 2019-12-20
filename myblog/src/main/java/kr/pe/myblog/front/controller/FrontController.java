package kr.pe.myblog.front.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.controller.MemberController;
import com.example.dto.MemberVO;
import com.example.service.MemberService;

import kr.pe.myblog.front.dto.FrontinfoVO;
import kr.pe.myblog.front.service.FrontinfoService;
import kr.pe.myblog.team.dto.TeamVO;
import kr.pe.myblog.team.service.TeamService;

@Controller
public class FrontController {
	//<context:component-scan base-package="kr.pe.myblog.front.controller" />
	//contorller 추가시 수정해야 할 부분
	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);
	
	@Inject
	private MemberService service;
	//서비스 추가
	@Inject
	private FrontinfoService frontService;
	
	@Inject
	private TeamService teamService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/index2.do", method = RequestMethod.GET)
	public String ho(Locale locale, Model model) throws Exception{

		logger.info("/index2.do");
		
		
		
		List<FrontinfoVO> frontList=frontService.selectFrontinfo();
		model.addAttribute("frontList", frontList);
		
		

		return "front";
	}
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, @RequestParam(value="name", required=false)
				String name,
				@RequestParam Map<String, String>parameters,
				Model model) throws Exception{

		logger.info("/home.do" +"---"+ name);
		
		if(name !=null) {
			
			logger.info("INSERT 작업필요!!"+ parameters.get("subject"));
		}
		
		List<FrontinfoVO> frontList=frontService.selectFrontinfo();
		model.addAttribute("frontList", frontList);
		
		List<TeamVO> teamList=teamService.selectteam();
		model.addAttribute("teamList", teamList);

		return "home";
	}
	
}

