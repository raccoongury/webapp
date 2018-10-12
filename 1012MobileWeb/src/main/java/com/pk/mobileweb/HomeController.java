package com.pk.mobileweb;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pk.mobileweb.domain.Good;
import com.pk.mobileweb.service.GoodService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private GoodService goodService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//서비스의 메소드를 호출해서 결과를 저장
		List<Good> list = goodService.list();
		//모델에 저장
		model.addAttribute("list", list);
		//결과 페이지로 포워딩 - 일반 조회는 forwarding
		return "home";
      }
	
	@RequestMapping(value="hybridapp", method=RequestMethod.GET)
	public String hybrid(Model model) {
		return "hybridapp";
	}
	
}
	
