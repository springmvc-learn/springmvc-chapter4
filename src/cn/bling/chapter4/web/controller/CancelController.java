package cn.bling.chapter4.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class CancelController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest rep,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		resp.getWriter().write("cancel");
		return null;
	}
	

}
