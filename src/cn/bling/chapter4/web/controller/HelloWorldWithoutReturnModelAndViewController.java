package cn.bling.chapter4.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldWithoutReturnModelAndViewController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		resp.getWriter().write("Hello World!!Bling111");
		//�����ֱ���ڸô�����/������д��Ӧ ����ͨ������null����DispatcherServlet�Լ��Ѿ�д����Ӧ�ˣ�����Ҫ��������ͼ����
		return null;
	}

}
