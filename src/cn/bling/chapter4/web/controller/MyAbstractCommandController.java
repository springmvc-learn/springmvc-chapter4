package cn.bling.chapter4.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import cn.bling.chapter4.model.UserModel;

public class MyAbstractCommandController extends AbstractCommandController{
	
	public MyAbstractCommandController(){
		//�����������ʵ����
		setCommandClass(UserModel.class);
	}
	@Override
	protected ModelAndView handle(HttpServletRequest rep,
			HttpServletResponse resp, Object command, BindException error)
			throws Exception {
		// TODO Auto-generated method stub
		//���������ת��Ϊʵ������
		UserModel user=(UserModel)command;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("abstractCommand");
		mv.addObject("user",user);
		
		return mv;
	}

}
