package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list", service.getList());	//List<BoardVO> 가 리턴;
		return "board/list";
	}
	
	
	/**
	 * log4jdbc.log4j2.properties 넣어야함
	 * 디비 연결 마무리해야함
	 * 
	 * 디비 테이블 생성, 더미 데이터 생성 완료
	 * 
	 * 커밋
	 * 
	 * 끝
	 * 
	 */
}
