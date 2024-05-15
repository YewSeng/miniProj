package com.caltech.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.caltech.pojo.Employee;
import com.caltech.service.EmployeeService;



@Controller
public class EmployeeController {
@Autowired
	EmployeeService service;
Logger log=Logger.getAnonymousLogger();
@RequestMapping("/")
public ModelAndView defaultpage(HttpServletRequest request,HttpServletResponse response) {
	log.info("entered into the / request");
	ModelAndView mv=new ModelAndView();	
	mv.setViewName("first.jsp");	
	log.info("went to index.jsp page ");
	return mv;
	
}


@RequestMapping("/insert")
public ModelAndView insertOpr(HttpServletRequest request,HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
Employee e=new Employee();
e.setEmpname(request.getParameter("name"));
e.setPhono(request.getParameter("phono"));
if(service.insert(e)!=null) {
	mv.setViewName("display.jsp");
}

	return mv;
	
}

@RequestMapping("/getall")
public ModelAndView getallOpr(HttpServletRequest request,HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
List<Employee> list=service.getall();
mv.setViewName("employeelist.jsp");
mv.addObject("list", list);
	return mv;
	
}


}
