package cn.bling.chapter4.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

public class HelloWorldLastModifiedCacheController extends AbstractController implements LastModified{
	private long lastModified;
	@Override
	public long getLastModified(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		if(lastModified == 0L) {
			//TODO �˴����µ���������������и��£�Ӧ�����·������������޸ĵ�ʱ���
			lastModified = System.currentTimeMillis();
		}
		return lastModified;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		//������ٴ�����ǰҳ��
		resp.getWriter().write("<a href=''>this</a>");
		return null;
	}

}
