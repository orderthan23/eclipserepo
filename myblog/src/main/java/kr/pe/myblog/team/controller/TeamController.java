package kr.pe.myblog.team.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.MemberService;

import kr.pe.myblog.front.controller.FrontController;
import kr.pe.myblog.front.dto.FrontinfoVO;
import kr.pe.myblog.front.service.FrontinfoService;
import kr.pe.myblog.team.dto.TeamVO;
import kr.pe.myblog.team.service.TeamService;
@Controller
public class TeamController {
	//<context:component-scan base-package="kr.pe.myblog.team.controller" />
		//contorller 추가시 수정해야 할 부분
		private static final Logger logger = LoggerFactory.getLogger(TeamController.class);
		
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
		@RequestMapping(value = "/index3.do", method = RequestMethod.GET)
		public String home(Locale locale, Model model) throws Exception{

			logger.info("/index3.do");
			
			
			
			List<TeamVO> teamList=teamService.selectteam();
			model.addAttribute("teamList", teamList);
			
			

			return "team";
		}
		

}
