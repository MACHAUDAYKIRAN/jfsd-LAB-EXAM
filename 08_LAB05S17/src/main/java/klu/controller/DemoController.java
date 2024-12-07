package klu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import klu.model.Addition;

@RestController
@RequestMapping("/")
public class DemoController {
    
	@GetMapping("/demo4")
	public String demo4()
	{
		return "JFSD";
	}
	
	@PostMapping("/demo5")
	public String add(@RequestBody Addition A)
	{
		
		Integer sum = A.getA()+A.getB();
		return sum.toString();
	}
	
	@GetMapping("/demo5")
	public String add(@RequestParam("A") int a, @RequestParam("B") int b)
		{
			Integer sum = a + b;
			return sum.toString();
			
		}
	
	
	
}