package tn.iset.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping
	public String display1(Model m){
		
		
		m.addAttribute("name","Nouri");
		
		return "hello";
	}
	
	
	@RequestMapping(value="/m/{nm}",method=RequestMethod.GET)
	public String display4(Model m,@PathVariable("nm") String n){
		
		
		m.addAttribute("name",n);
		
		return "hello";
	}
	
	
	@RequestMapping("/murl")
	public String display5(Model m,@RequestParam(value="name",defaultValue="test") String n){
		
		
		m.addAttribute("name",n);
		
		return "hello";
	}
	
	@RequestMapping("/mv")
	public ModelAndView display3(){
		
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("hello");
		mv.addObject("name","Mohamed");
		
		return mv;
	}
	
	
	@RequestMapping("/a")
	public String display2(){
		return "bonjour";
	}
			
}
