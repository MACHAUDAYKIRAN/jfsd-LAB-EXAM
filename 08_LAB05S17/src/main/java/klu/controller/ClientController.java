package klu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/")
public class ClientController {
	@GetMapping("/welcome")
	public ModelAndView home()
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("home.jsp");
		return mvc;
	}
	
	@GetMapping("/demo1")
	public ModelAndView admin() {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("admin.jsp");
		return mvc;
	}
	
	@GetMapping("/demo2")
	public ModelAndView user() {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("user.jsp");
		mvc.addObject("name", "klu");
		return mvc;
	}
	
	@GetMapping("/demo3")
	public ModelAndView about() {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("about.jsp");
		mvc.addObject("msg", "Hello World");
		return mvc;
	}
	
	@GetMapping("/demo6/{fname}/{lname}")
	public ModelAndView demo(@PathVariable("fname") String fn,@PathVariable("lname") String ln)
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("demo.jsp");
		mvc.addObject("name", fn + " " + ln );
		return mvc;
	}
	
}