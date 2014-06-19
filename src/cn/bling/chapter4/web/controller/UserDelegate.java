package cn.bling.chapter4.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.bling.chapter4.model.UserModel;
import cn.bling.chapter4.model.UserService;

public class UserDelegate{
    //�û�������  
    private UserService userService;  
    //�߼���ͼ�� ͨ������ע�뷽ʽע�룬������  
    private String createView;  
    private String updateView;  
    private String deleteView;  
    private String listView;  
    private String redirectToListView;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getCreateView() {
		return createView;
	}
	public void setCreateView(String createView) {
		this.createView = createView;
	}
	public String getUpdateView() {
		return updateView;
	}
	public void setUpdateView(String updateView) {
		this.updateView = updateView;
	}
	public String getDeleteView() {
		return deleteView;
	}
	public void setDeleteView(String deleteView) {
		this.deleteView = deleteView;
	}
	public String getListView() {
		return listView;
	}
	public void setListView(String listView) {
		this.listView = listView;
	}
	public String getRedirectToListView() {
		return redirectToListView;
	}
	public void setRedirectToListView(String redirectToListView) {
		this.redirectToListView = redirectToListView;
	}  
	public String create(HttpServletRequest request, HttpServletResponse response, UserModel user) {  
        if("GET".equals(request.getMethod())) {  
            //�����get���� ����ת�� ����ҳ��  
            return getCreateView();  
        }  
        userService.create(user);  
        //ֱ���ض����б�ҳ��  
        return getRedirectToListView();  
    }  
	 public ModelAndView update(HttpServletRequest request, HttpServletResponse response, UserModel user) {  
	        if("GET".equals(request.getMethod())) {  
	            //�����get���� ����ת�����ҳ��  
	            ModelAndView mv = new ModelAndView();  
	            //��ѯҪ���µ����  
	            mv.addObject("command", userService.get(user.getUsername()));  
	            mv.setViewName(getUpdateView());  
	            return mv;  
	        }  
	        userService.update(user);  
	        //ֱ���ض����б�ҳ��  
	        return new ModelAndView(getRedirectToListView());  
	    }  
	 public ModelAndView delete(HttpServletRequest request, HttpServletResponse response, UserModel user) {  
	        if("GET".equals(request.getMethod())) {  
	            //�����get���� ����ת��ɾ��ҳ��  
	            ModelAndView mv = new ModelAndView();  
	            //��ѯҪɾ������  
	            mv.addObject("command", userService.get(user.getUsername()));  
	            mv.setViewName(getDeleteView());  
	            return mv;  
	        }  
	        userService.delete(user);  
	        //ֱ���ض����б�ҳ��  
	        return new ModelAndView(getRedirectToListView());  
	    }     
	 public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {  
	        ModelAndView mv = new ModelAndView();  
	        mv.addObject("userList", userService.list());  
	        mv.setViewName(getListView());  
	        return mv;  
	    }  
	      
	    //���ʹ��ί�з�ʽ������������ֻ����command  
	    protected String getCommandName(Object command) {  
	        //������������ Ĭ��command  
	        return "command";  
	    }  
}
