package com.stichteam.cafe.cafe.controller;

import org.hibernate.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stichteam.cafe.cafe.dto.MemberDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class CafeController {
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/cafe/signmodal.html")
	public String signModalPage() {
	    return "signmodal";
	}
	
	@GetMapping("/cafe/menumodal.html")
	public String menuModalPage() {
        return "menumodal";
	}
	
    @GetMapping("/cafe/imagelist2.html")
	public String imagelistPage() {
		return "imagelist";
	}
	@GetMapping("/cafe/menu")
	 public String menu() {
		 return "menu";
	}
	@GetMapping("/drivingthrow")
	public String somePage() {
	    return "drivingthrow";
	}
  
	@GetMapping("/cafeplace")
	public String cafeplace() {
		return "cafeplace";
	}
	
	@RequestMapping("/cafereview")
	public String cafeReview() {
	     return "cafereview";
	}



	@GetMapping("/ordernow")
	public String ordernow() {
		return "ordernow";
	}
    @GetMapping("/login")
    public String showloginmodal() {
  	return "login";
  }
  
 
	@RequestMapping(value = {"/", "/main.do", "/login"}, method = RequestMethod.GET)
    public ModelAndView showMainAndLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("main/main");

        HttpSession session = request.getSession();
        Boolean isLogin = (Boolean) session.getAttribute("isLogin");
        MemberDTO member = (MemberDTO) session.getAttribute("member");

        mav.addObject("isLogin", isLogin);
        mav.addObject("member", member);

        // 로그인 모달을 띄울지 여부 전달
        String uri = request.getRequestURI();
        if (uri.endsWith("/login")) {
            mav.addObject("showLoginModal", true); // 뷰에서 모달 표시 조건
        }

        return mav;
    }
   
    }	
    
    