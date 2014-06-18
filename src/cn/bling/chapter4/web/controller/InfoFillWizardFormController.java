package cn.bling.chapter4.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import cn.bling.chapter4.model.UserModel;

public class InfoFillWizardFormController extends AbstractWizardFormController{

    public InfoFillWizardFormController() {  
        setCommandClass(UserModel.class);  
        setCommandName("user");  
    } 
    
    protected Map referenceData(HttpServletRequest request, int page) throws Exception {  
        Map map = new HashMap();  
        if(page==1) { //�������дѧУ��Ϣҳ ��ҪѧУ������Ϣ  
            map.put("schoolTypeList", Arrays.asList("����", "��ר", "��ѧ"));  
        }  
        if(page==2) {//�������д������Ϣҳ ��Ҫ����������Ϣ  
            map.put("cityList", Arrays.asList("����", "����", "�Ϻ�"));  
        }  
        return map;  
    }     
    protected void validatePage(Object command, Errors errors, int page) {  
        //�ṩÿһҳ���ݵ���֤������  
    } 
    protected void postProcessPage(HttpServletRequest request, Object command, Errors errors, int page) throws Exception {  
        //�ṩ��ÿһҳ���ʱ�ĺ�����  
    } 
    
    
	@Override
	protected ModelAndView processFinish(HttpServletRequest req,
			HttpServletResponse resp, Object command, BindException error)
			throws Exception {
		// TODO Auto-generated method stub
		//�ɹ���Ĵ�����  
        System.out.println("����"+command);  
        return new ModelAndView("redirect:/success");
	}
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {  
        //ȡ����Ĵ�����  
        System.out.println("ȡ��"+command);  
        return new ModelAndView("redirect:/cancel");  
    }  
	

}
