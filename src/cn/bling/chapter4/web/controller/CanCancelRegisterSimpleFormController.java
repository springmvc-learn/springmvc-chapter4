package cn.bling.chapter4.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;
import org.springframework.web.servlet.mvc.SimpleFormController;

import cn.bling.chapter4.model.UserModel;

public class CanCancelRegisterSimpleFormController extends CancellableFormController{
	public CanCancelRegisterSimpleFormController(){
		setCommandClass(UserModel.class);//�����������ʵ����
		setCommandName("user");//����������������  
	}
	//form object �������ṩչʾ��ʱ�ı����ݣ�ʹ��commandName��������
    protected Object formBackingObject(HttpServletRequest request) throws Exception {  
        UserModel user = new UserModel();  
        user.setUsername("�������û���");  
        return user;  
    }  
  //�ṩչʾ��ʱ��Ҫ��һЩ�������� 
    protected Map referenceData(HttpServletRequest request) throws Exception {  
        Map map = new HashMap();  
        map.put("cityList", Arrays.asList("ɽ��", "����", "�Ϻ�"));  
        return map;  
    }  
    protected void doSubmitAction(Object command) throws Exception {  
        UserModel user = (UserModel) command;  
        //TODO ����ҵ�������  
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getCity());
    }
    protected ModelAndView onCancel(Object command) throws Exception {  
        UserModel user = (UserModel) command;  
        //TODO ����ҵ�������  
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getCity());
        return super.onCancel(command);  
    }  
    
}
