package cn.bling.chapter4.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController{

	
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		//1���ռ�����
		//2���󶨲������������
		//3������ҵ�����
		//4��ѡ����һ��ҳ��
		ModelAndView mv = new ModelAndView();
		//���ģ������ �����������POJO����
		mv.addObject("message", "Hello World!Bling");
		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("bling");
		return mv;
	}
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest req,
//			HttpServletResponse resp) throws Exception {
//		// TODO Auto-generated method stub
//	       //1���ռ���������֤����  
//	       //2���󶨲������������  
//	       //3�������������ҵ��������ҵ����  
//	       //4��ѡ����һ��ҳ�� 
//		ModelAndView mv = new ModelAndView();
//		//���ģ������ �����������POJO����
//		mv.addObject("message", "HelloWorld !!! Bling ������");
//		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
//		mv.setViewName("bling");
//		return mv;
//	}


}
